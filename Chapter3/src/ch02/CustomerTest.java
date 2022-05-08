package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(10010, "이순신");
        customer.bonusPoint = 1000;

        VIPCustomer vipCustomer = new VIPCustomer(10020, "김유신");
        vipCustomer.bonusPoint = 10000;

        Customer customer1 = new VIPCustomer(12345, "noname"); // 업캐스팅
        customer1.bonusPoint = 2000;

        customer.info();
        vipCustomer.info();
        customer1.info();
    }
}
