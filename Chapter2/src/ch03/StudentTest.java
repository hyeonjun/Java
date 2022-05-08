package ch03;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.studentId = 12345;
        student.setStudentName("Lee");
        student.address = "서울 강남구";

        student.showStudentInfo();

        Student student1 = new Student();
        student1.studentId = 54321;
        student1.studentName = "Kim";
        student1.address = "경기도 성남시";

        student1.showStudentInfo();
    }
}
