package ch13.duplicate_defaultmethod;

public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() { // default 메서드 중복
        // Buy.super.order();
        // Sell.super.order();
        System.out.println("customer order");
    }

    public void info() {
        System.out.println("Hi~");
    }

}
