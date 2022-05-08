package ch13.multiple_interface;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.info();

        ((Buy) customer).buy(); // Buy buyer = customer;

        ((Sell) customer).sell(); // Sell seller = customer;
    }
}
