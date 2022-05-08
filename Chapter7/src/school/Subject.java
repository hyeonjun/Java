package school;

import util.Define;

import java.util.ArrayList;

public class Subject {

    private String subjectName; // 과목 이름
    private int subjectId; // 과목 고유 번호
    private int gradeType; // 과목 평가 타입

    // 수강 신청한 학생 리스트
    // register() 메서드 호출하여 리스트 추가
    private ArrayList<Student> students = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE; // 기본 A, B 타입
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void register(Student std) { // 수강 신청
        students.add(std);
    }
}
