package ch01.eqauls_hashcode;

import java.util.Objects;

public class Student implements Cloneable{ // Cloneable: clone 메서드를 사용할 수 있게 해줌

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student student) {
            return this.studentId == student.studentId;
        }
        return false;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
//        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
