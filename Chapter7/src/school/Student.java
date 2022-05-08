package school;

import java.util.ArrayList;

public class Student {

    private int studentId; // 학번
    private String studentName; // 이름
    private Subject majorSubject; // 중점 과목

    // 학생 성적 리스트
    // addSubjectScore() 메서드 호출 시 리스트 추가
    private ArrayList<Score> scores = new ArrayList<>();

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score s) {
        scores.add(s);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }
}
