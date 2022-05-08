package ch04;

import ch02.MyLinkedList;
import ch02.MyListNode;

interface iQueue {
    public void enQueue(String data);
    public String deQueue();
    public void printAll();
}

public class MyQueue extends MyLinkedList implements iQueue {

    MyListNode front;
    MyListNode rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode node;
        if(isEmpty()) {
            node = addNode(data);
            front = node;
            rear = node;
        } else {
            node = addNode(data);
            rear = node;
        }
        System.out.println(node.getData() + " added");
    }

    @Override
    public String deQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        String data = front.getData();
        front = front.next;
        if (front == null) // 마지막 항목
            rear = null;
        return data;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        MyListNode tmp = front;
        while(tmp != null) {
            System.out.print(tmp.getData() + ", ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
