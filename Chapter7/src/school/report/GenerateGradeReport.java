package school.report;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.Define;

import java.util.ArrayList;

public class GenerateGradeReport {

    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
    public static final String LINE = "-------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        // 모든 과목에 대한 학점
        for (Subject subject : school.getSubjects()) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();  // String 으로 반환
    }

    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE );
        buffer.append(GenerateGradeReport.HEADER );
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject subject){
        ArrayList<Student> students = subject.getStudents();

        for (int i=0; i<students.size(); i++){
            Student std = students.get(i);
            buffer.append(std.getStudentName());
            buffer.append(" | ");
            buffer.append(std.getStudentId());
            buffer.append(" | ");
            buffer.append(std.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(std, subject);  //학생별 해당과목 학점 계산
            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    public void getScoreGrade(Student std, Subject subject) {
        ArrayList<Score> scores = std.getScores();
        int majorId = std.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};

        for (Score s : scores) {
            if (s.getSubject().getSubjectId() == subject.getSubjectId()) { // 현재 학점을 산출할 과목
                String grade;
                if (subject.getGradeType() == Define.PF_TYPE)
                    grade = gradeEvaluations[Define.PF_TYPE].getGrade(s.getPoint());
                else if (s.getSubject().getSubjectId() == majorId) // 중점 과목?
                    grade = gradeEvaluations[Define.SAB_TYPE].getGrade(s.getPoint());
                else
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(s.getPoint());
                buffer.append(s.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter(){
        buffer.append("\n");
    }

}
