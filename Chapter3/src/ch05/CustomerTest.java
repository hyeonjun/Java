package ch05;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(10010, "이순신"));
        customers.add(new Customer(10020, "신사임당"));
        customers.add(new GoldCustomer(10030, "홍길동"));
        customers.add(new GoldCustomer(10040, "이율곡"));
        customers.add(new VIPCustomer(10050, "김유신", 12345));

        System.out.println("====== 고객 정보 출력 =======");
        for (Customer customer: customers) {
            System.out.println(customer.info());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 =======");
        int price = 10000;
        for (Customer customer: customers) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }
    }
}
