# 10. Multi Thread 프로그래밍에서의 동기화

### critical section과 semaphore
* critical section: 두 개 이상의 thread가 동시에 한 자원에 접근하는 경우 문제가 생길 수 있기 때문에 동시에 접근할 수 없는 영역
* semaphore: 특별한 형태의 시스템 객체이며 get/release 두 개의 기능이 있음
* 한 순간 오직 하나의 thread 만이 semaphore를 얻어 critical section에 들어갈 수 있고, 나머지 thread 들은 대기(blocking) 상태가 된다.

### 동기화(synchronization)
* 두 개의 thread가 같은 객체에 접근할 경우, 동시에 접근함으로써 오류 발생
* 동기화는 임계 영역에 접근할 경우 공유 자원을 lock하여 다른 thread에 접근을 제어함
* 동기화를 잘못 구현하면 deadlock에 빠질 수 있음

### synchronized 메서드 or 블럭
* synchronized 블럭
  * 현재 객체 또는 다른 객체를 lock 으로 만듬
  
        synchronized(참조형 수식) {
            수행문;
        }
* synchronized 메서드
  * 객체의 메서등 synchronized 키워드 사용
  * 현재 이 메서드가 속해있는 객체에 lock을 건다.
  * 자바에서는 deadlock을 방지하는 기술이 제공되지 않으므로 되도록이면 synchronized 메서드에서 다른 synchronized 메서드는 호출하지 않도록 한다.

### wait()/notify() 메서드를 활용한 동기화 프로그래밍
* 리소스가 어떤 조건에서 더 이상 유효하지 않은 경우 리소스를 기다리기 위해 Thread가 wait() 상태가 된다.
* wait() 상태가 된 Thread는 notify()가 호출될 때까지 기다린다.
* 유효한 자원이 생기면 notify()가 호출되고 wait() 하고 있는 Thread 중 무작위로 하나의 Thread를 재시작하도록 한다.
* notifyAll()이 호출되면 wait() 하고 있는 모든 Thread 들이 재시작 된다.
  * 이 경우 유효한 리소스만큼의 Thread만이 수행될 수 있고 자원을 갖지 못한 Thread의 경우는 다시 wait() 상태로 만듬
* 자바에서는 notifyAll() 메서드의 사용을 권장함
