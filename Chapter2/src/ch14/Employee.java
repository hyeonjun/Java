package ch14;

public class Employee {

    private static int serialNum = 1000; // private로 선언 시 외부에서 바로 참조할 수 없게 됨

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        employeeId = serialNum;
        serialNum++;
    }

    public static int getSerialNum() {
        int i = 0; // 지역 변수
        // employeeName = "Lee"; // 에러
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
