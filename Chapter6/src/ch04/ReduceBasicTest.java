package ch04;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        return (s1.getBytes().length >= s2.getBytes().length) ? s1 : s2;
    }
}


public class ReduceBasicTest {

    public static void main(String[] args) {

        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};

        // reduce 연산: 프로그래머가 직접 구현한 연산을 적용
        // ex) Arrays.stream(arr).reduce(0, (a,b)->a+b));
        // reduce() 메서드의 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행 할 수 있음

        // reduce 사용
        String result = Arrays.stream(greetings).reduce("", (s1, s2) -> s1.length() >= s2.length() ? s1:s2);
        System.out.println(result);

        // reduce - BinaryOperator를 구현한 클래스를 사용
        result = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(result);

        // stream을 사용하여 가장 긴 길이 구하기
        System.out.println(Arrays.stream(greetings).mapToInt(String::length).max().orElse(-1));

    }


}
