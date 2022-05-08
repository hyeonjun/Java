package ch08;

public class Student {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String subjectName, int score) {
        korea.subjectName = subjectName;
        korea.score = score;
    }

    public void setMathSubject(String subjectName, int score) {
        math.subjectName = subjectName;
        math.score = score;
    }

    @Override
    public String toString() {
        int total = korea.score + math.score;
        return studentName + "의 총점은 " + total + "점입니다.";
    }
}
