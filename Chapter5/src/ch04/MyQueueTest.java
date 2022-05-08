package ch04;

public class MyQueueTest {
    public static void main(String[] args) {

        MyQueue listQueue = new MyQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");
        listQueue.enQueue("D");
        listQueue.enQueue("E");

        System.out.println(listQueue.deQueue());
        listQueue.printAll();
    }

}
