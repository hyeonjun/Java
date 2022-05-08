package ch08;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(100, "Lee");
        student1.setKoreaSubject("국어", 100);
        student1.setMathSubject("수학", 95);

        Student student2 = new Student(100, "Kim");
        student2.setKoreaSubject("국어", 80);
        student2.setMathSubject("수학", 99);

        System.out.println(student1);
        System.out.println(student2);

    }
}
