package ch13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeName("이순신");

        // System.out.println(e1.serialNum); // 1000

        Employee e2 = new Employee();
        e2.setEmployeeName("김유신");
        // e2.serialNum++; // 1001
        
        // 두 개의 인스턴스가 공통 변수인 serialNum으로 접근함
        // System.out.println(e1.serialNum); // 1001
        // System.out.println(e2.serialNum); // 1001
        // serialNum은 static 변수이기 때문에 이미 메모리에 올라와 있기 때문에 클래스 이름으로 참조할 수 있음
        System.out.println(Employee.serialNum);

        System.out.println(e1.getEmployeeName() + "," + e1.getEmployeeId());
        System.out.println(e2.getEmployeeName() + "," + e2.getEmployeeId());
    }
}
