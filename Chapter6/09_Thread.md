# 09. Thread

### Thread란?
* process: 실행 중인 프로그램, 프로그램이 실행되면 OS로부터 메모리를 할당받아 프로세스 상태가 됨
* thread: 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread 임

### Multi-threading
* 여러 thread가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과
* thread는 각각 자신만의 작업 공간을 가짐(context)
* 각 thread 사이에서 공유하는 자원이 있을 수 있음(static instance)
* 여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 경쟁 상태(race condition)이 발생할 수 있음
  * 이러한 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 임계 구역(critical section)이라고 함
  * critical section에 대한 동기화(일종의 순차적 수행)를 구현하지 않으면 오류가 발생할 수 있음

### Thread 클래스의 메서드
* Thread 우선 순위
  * Thread.MIN_PRIORITY(=1) ~ Thraed.MAX_PRIORITY(=10)
  * 디폴트 우선 순위: Thread.NORMAL_PRIORITY(=5)
  * 우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높음
  * setPriority() / getPriority()
* join()
  * 동시에 두 개 이상의 Thread가 실행될 때 다른 Thread의 결과를 참조하여 실행해야하는 경우 join() 함수를 사용
  * join() 함수를 호출한 Thread가 not-runnable 상태가 됨
    * 다른 Thread의 수행이 끝나면 다시 runnable 상태로 돌아옴
* interrupt()
  * 다른 Thread에 예외를 발생시킨는 interrupt를 보냄
  * Thread가 join(), sleep(), wait() 함수에 의해 not-runnable 상태일 때 interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
* Thread 종료
  * 무한 반복의 경우 while(flag)의 flag 변수 값을 false로 바꾸어 종료