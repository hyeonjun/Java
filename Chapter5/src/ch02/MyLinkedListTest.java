package ch02;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addNode("A");
        list.addNode("B");
        list.addNode("C");
        list.printAll();
        list.insertNode(3, "D");
        list.printAll();
        list.removeNode(0);
        list.printAll();
        list.removeNode(1);
        list.printAll();

        list.insertNode(0, "A-1");
        list.printAll();
        System.out.println(list.getSize());

        list.removeNode(0);
        list.printAll();
        System.out.println(list.getSize());

        list.removeAll();
        list.printAll();
        list.addNode("A");
        list.printAll();
        System.out.println(list.getElement(0));
        list.removeNode(0);

    }
}
