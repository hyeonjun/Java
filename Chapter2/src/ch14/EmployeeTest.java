package ch14;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println(Employee.getSerialNum());

        Employee e1 = new Employee();
        e1.setEmployeeName("Lee");

        Employee e2 = new Employee();
        e2.setEmployeeName("Lee");

        System.out.println(e1.getEmployeeName()+", "+e1.getEmployeeId());
        System.out.println(e2.getEmployeeName()+", "+e2.getEmployeeId());

        System.out.println(Employee.getSerialNum());
    }
}
