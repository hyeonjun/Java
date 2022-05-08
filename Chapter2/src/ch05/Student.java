package ch05;

public class Student {

    public int studentNnumber;
    public String studentName;
    public int grade;

    public Student() {}

    public Student(int studentNnumber, String studentName, int grade) {
        // this: 객체 자신을 가리키는 키워드
        this.studentNnumber = studentNnumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNnumber=" + studentNnumber +
                ", studentName='" + studentName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
