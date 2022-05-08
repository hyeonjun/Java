package ch05;

public class AutoCloseObj implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("리소스 해제");
    }
}
