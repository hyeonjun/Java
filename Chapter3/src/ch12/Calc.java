package ch12;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() { // 디폴트 메서드 -> 공통으로 사용할 수 있는 기본 메서드: 하위 클래스에서 재정의 가능
        System.out.println("정수의 사칙연산 제공");
        myMethod();
    }

    static int total(int[] arr) { // 정적 메서드
        int total = 0;
        for(int i: arr) {
            total += i;
        }
        mystaticMethod();
        return total;
    }

    // private 메서드
    private void myMethod() { // private default
        System.out.println("private method");
    }

    private static void mystaticMethod() { // private static
        System.out.println("private static method");
    }

}
