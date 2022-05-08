package ch04;

import java.util.Arrays;
import java.util.List;

public class StreamBasicTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr).forEach(n -> System.out.println(n));
        Arrays.stream(arr).forEach(System.out::println);

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        long count = Arrays.stream(arr).count();
        System.out.println(count);

        // 중간 연산과 최종 연산
        // 중간 연산 - filter(), map(), sorted() 등
        // 조건에 맞는 요소를 추출(filter)하거나 반환(map)

        // 최종 연산 - forEach(), count(), sum() 등
        // forEach(): 요소를 하나씩 꺼내옴
        // count(): 요소 개수
        // sum(): 요소 합

        String[] str = {"abc", "abcd", "abcde", "abcdef", "abcdefg"};
        // filter를 중간 연산, forEach가 최종 연산
        Arrays.stream(str).filter(s -> s.length() > 3).forEach(s -> System.out.print(s + " "));
        System.out.println("\n====================================");

        // map ex)
        // 고객 클래스 배열에서 고객 이름만 가져오기
        // customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));

        Arrays.stream(str).map(String::length).forEach(n -> System.out.print(n + "\t"));
        System.out.println("\n====================================");

        Arrays.stream(str).map(String::length).filter(length -> length > 3).forEach(n -> System.out.print(n + "\t"));
        System.out.println("\n====================================");

        List<String> sList = Arrays.asList("Tomas", "Edward", "Jack");
        sList.forEach(s -> System.out.println(s + " "));
        System.out.println("====================================");

        sList.stream().sorted().forEach(s -> System.out.println(s + " "));


    }



}
