package ch15;

public class Company {

    private static Company instance; // 클래스 내부에 유일한 private 인스턴스 생성

    private Company() { // 생성자를 private로 선언
    }
    
    // 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
