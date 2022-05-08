package ch13.class_and_interface;

public interface Queue {
    void enQueue(String title);
    String deQueue();
    int getSize();
}
