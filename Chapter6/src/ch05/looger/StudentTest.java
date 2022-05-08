package ch05.looger;

public class StudentTest {

    public static void main(String[] args) {
        MyLogger logger = MyLogger.getLogger();

        String name = null;
        Student student = null;
        try {
            student = new Student(name);

        } catch (StudentNameFormatException e) {
            logger.warning(e.getMessage());
        }

        try {
            name = "Edward Jon Kim Test";
            student = new Student(name);
        } catch (StudentNameFormatException e) {
            logger.warning(e.getMessage());
        }

        student = new Student("James");
    }

}
