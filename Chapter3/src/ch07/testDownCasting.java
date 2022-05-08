package ch07;

import ch05.*;

import java.util.ArrayList;

public class testDownCasting {

    public static void main(String[] args) {
        // 다운 캐스팅
        Customer vc = new VIPCustomer(); // 묵시적 형변환 -> 업 캐스팅
        VIPCustomer vipCustomer = (VIPCustomer) vc; // 명시적 형변환 -> 다운 캐스팅

        // instanceof 를 사용하여 인스턴스 형 체크
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(10010, "이순신"));
        customers.add(new Customer(10020, "신사임당"));
        customers.add(new GoldCustomer(10030, "홍길동"));
        customers.add(new GoldCustomer(10040, "이율곡"));
        customers.add(new VIPCustomer(10050, "김유신", 12345));

        for (int i=0; i<customers.size(); i++) {
            Customer customer = customers.get(i);

            if (customer instanceof VIPCustomer) {
                System.out.println(customer.getCustomerName() + "님은 VIP고객입니다.");
            } else if (customer instanceof GoldCustomer) {
                System.out.println(customer.getCustomerName() + "님은 GOLD고객입니다.");
            } else {
                System.out.println(customer.getCustomerName() + "님은 SILVER고객입니다.");
            }
        }
    }



}
