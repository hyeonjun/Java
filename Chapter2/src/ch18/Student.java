package ch18;

import java.util.ArrayList;

public class Student {

    private String name;
    private int id;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        this.subjects.add(subject);
    }

    public void info() {
        int total = 0;
        for (Subject s: subjects) {
            total += s.getScore();
            System.out.println("학생 " + name + "의 " + s.getName() + " 과목 성적은 " + s.getScore() + "입니다.");
        }
        System.out.println("학생 " + name + "의 총점은 " + total + " 입니다.");
    }


}
