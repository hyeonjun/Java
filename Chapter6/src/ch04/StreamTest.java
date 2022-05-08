package ch04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(
                new Customer("이순신", 40, 100),
                new Customer("김유신", 20, 100),
                new Customer("홍길동", 13, 50)
        );

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream().map(Customer::getName).forEach(System.out::println);

        int total = customerList.stream().mapToInt(Customer::getPrice).sum();
        System.out.println("총 여행 비용은 :" + total + "입니다");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter(a -> a.getAge() > 19).map(Customer::getName).sorted().forEach(System.out::println);

    }

}
