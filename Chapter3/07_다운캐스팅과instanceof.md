# 07. 다운 캐스팅과 instanceof

### 다운 캐스팅(downcasting)
* 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
* 하위 클래스의 형 변환은 명시적으로 해야한다.


    Customer vc = new VIPCustomer(); // 묵시적
    VIPCustomer vCustomer = (VIPCustomer) vc; // 명시적

### instanceof 를 사용하여 인스턴스 타입 체크
* 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드
  * 맞으면 true, 아니면 false를 반환
