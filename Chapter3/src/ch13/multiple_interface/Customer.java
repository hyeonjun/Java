package ch13.multiple_interface;

public class Customer implements Buy, Sell{

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    public void info() {
        System.out.println("Hi~");
    }
}
