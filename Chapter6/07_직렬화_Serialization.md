# 07. 직렬화(Serialization)

### 직렬화란?
* 인스턴스의 상태를 그대로 파일로 저장하거나 네트워크로 전송하고 (serialization) 이를 다시 복원 (deserialization) 하는 방식
* 자바에서는 보조 스트림을 활용하여 직렬화를 제공함
* ObjectInputStream과 ObjectOutputStream
  * ObjectInputStream(InputStream in): InputStream을 생성자의 매개변수로 받아 ObjectInputStream을 생성
  * ObjectOutputStream(OutputStream out): OutputStream을 생성자의 매개변수로 받아 ObjectOutputStream을 생성

### Serializable 인터페이스
* 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
* 구현 코드가 없는 marker interface
* transient: 직렬화하지 않으려는 멤버 변수에 사용 (Socket 등 직렬화할 수 없는 객체)

### Externalizable 인터페이스
* writerExternal()과 readExternal() 메서드를 구현해야 함
* 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현할 수 있음