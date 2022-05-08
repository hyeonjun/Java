package ch02;

public class FunctionTest {

    public static int addNum(int num1, int num2) { // 2. num1, num2 라는 변수가 저장될 메모리 공간이 스택에 생성
        return num1 + num2; // 3. 반환 시 사용했던 메모리가 해제
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        for (int i =0; i<=100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int result = addNum(10, 20); // 1. 함수 호출
        System.out.println(result);

        sayHello("Hi");

        result = calcSum();
        System.out.println(result);

    }
}
