package school;

import java.util.ArrayList;

public class School {

    private static School instance = new School();

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Subject> subjects = new ArrayList<>();

    private School() {}

    public static School getInstance() {
        if (instance == null)
            instance = new School();
        return instance;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addStudent(Student std) {
        students.add(std);
    }

    public void addSubject(Subject sub) {
        subjects.add(sub);
    }
}
