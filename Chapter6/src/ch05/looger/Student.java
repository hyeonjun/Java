package ch05.looger;

public class Student {

    private String studentName;
    MyLogger logger = MyLogger.getLogger();

    public Student(String studentName) {

        if (studentName == null)
            throw new StudentNameFormatException("name must not be null");
        else if (studentName.split(" ").length > 3)
            throw new StudentNameFormatException("name too long");

        this.studentName = studentName;
    }

    public String getStudentName() {
        logger.fine("begin getStudentName()");
        return studentName;
    }

}
