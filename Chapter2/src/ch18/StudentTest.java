package ch18;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Lee", 1001);
        s1.addSubject("국어", 100);
        s1.addSubject("수학", 50);

        Student s2 = new Student("Kim", 1002);
        s2.addSubject("국어", 70);
        s2.addSubject("수학", 85);
        s2.addSubject("영어", 100);

        s1.info();
        System.out.println("==========================");
        s2.info();
    }
}
