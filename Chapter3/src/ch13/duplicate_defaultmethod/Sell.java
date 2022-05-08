package ch13.duplicate_defaultmethod;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("판매 주문");
    }

}
