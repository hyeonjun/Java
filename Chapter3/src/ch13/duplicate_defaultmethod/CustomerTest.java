package ch13.duplicate_defaultmethod;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.info();

        ((Buy) customer).buy();
        ((Buy) customer).order();

        ((Sell) customer).sell();
        ((Sell) customer).order();
    }
}
