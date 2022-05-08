package ch02;

import java.util.Arrays;

public class LambdaTest {

    // 두 수를 입력받아 더하는 add 함수
    static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));

        //람다식 표현
        LambdaAdd add1 = (x, y) -> {return x+y;};
        LambdaAdd add2 = (x, y) -> x+y;
        LambdaAdd add3 = Integer::sum;
        System.out.println(add1.add(1, 2));
        System.out.println(add2.add(1, 2));
        System.out.println(add3.add(1, 2));

        LambdaMax max1 = (x, y) -> (x > y) ? x:y;
        LambdaMax max2 = (x, y) -> Math.max(x, y);
        LambdaMax max3 = Math::max;
        System.out.println(max1.max(1, 2));
        System.out.println(max2.max(1, 2));
        System.out.println(max3.max(1, 2));

        LambdaCalc add = Integer::sum;
        LambdaCalc sub = (x, y) -> x-y;
        LambdaCalc mul = (x, y) -> x*y;
        LambdaCalc div = (x, y) -> x/y;
        System.out.println(add.calc(6, 3));
        System.out.println(sub.calc(6, 3));
        System.out.println(mul.calc(6, 3));
        System.out.println(div.calc(6, 3));


    }

}
