package ch12;

public class CalcTest {
    public static void main(String[] args) {

        // 정적메서드는 인스턴스 생성과 상관없이 사용 가능
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));

        CompleteCalc calc = new CompleteCalc();
        int num1=10, num2=2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" +calc.sub(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));

        calc.description(); // 디폴트메서드는 인스턴스 생성 후 사용 가능

    }
}
