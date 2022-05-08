package ch05;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student(12345, "Lee", 3);
        System.out.println(student);

        Student student1 = new Student();
        student1.studentName = "Kim";
        student1.studentNnumber = 54321;
        student1.grade = 2;
        System.out.println(student1);
    }

}
