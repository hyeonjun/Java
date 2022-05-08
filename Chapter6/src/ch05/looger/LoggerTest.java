package ch05.looger;

public class LoggerTest {

    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getLogger();

        myLogger.log("test");
    }
}
