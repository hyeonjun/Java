package ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(10010, "이순신");
        customer.bonusPoint = 1000;
        int price = customer.calcPrice(1000);
        customer.info();
        System.out.println("--> price: "+price);

        VIPCustomer vipCustomer = new VIPCustomer(10020, "김유신");
        vipCustomer.bonusPoint = 10000;
        price = vipCustomer.calcPrice(1000);
        vipCustomer.info();
        System.out.println("--> price: "+price);

        Customer customer1 = new VIPCustomer(12345, "noname"); // 업캐스팅
        customer1.bonusPoint = 2000;
        price = customer1.calcPrice(1000);
        customer1.info();
        System.out.println("--> price: "+price);
    }
}
