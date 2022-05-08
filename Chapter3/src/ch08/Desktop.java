package ch08;

public class Desktop extends Computer {

    @Override
    void display() {
        System.out.println("Desktop display");
    }

    @Override
    void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
