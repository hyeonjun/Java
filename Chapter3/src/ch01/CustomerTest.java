package ch01;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("이순신");
        customer.setCustomerId(10010);
        customer.bonusPoint = 1000;

        VIPCustomer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerName("김유신");
        vipCustomer.setCustomerId(10020);
        vipCustomer.bonusPoint = 10000;

        customer.info();
        vipCustomer.info();
    }
}
