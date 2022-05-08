package ch05;

public class AutoCloseTest {

    public static void main(String[] args) {

        try(AutoCloseObj obj = new AutoCloseObj()) { // 자바 9 부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj) 와 같이 사용할 수 있음
            throw new Exception(); // exception 발생
        } catch (Exception e) {
            System.out.println("예외1");
        }

        AutoCloseObj obj1 = new AutoCloseObj();
        try(obj1) { // 자바 9 부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj) 와 같이 사용할 수 있음
            throw new Exception(); // exception 발생
        } catch (Exception e) {
            System.out.println("예외2");
        }
    }

}
