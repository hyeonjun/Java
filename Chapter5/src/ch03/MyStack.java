package ch03;

import ch01.MyArray;

public class MyStack {

    int top;
    MyArray stack;

    public MyStack() {
        top = 0;
        stack = new MyArray();
    }

    public MyStack(int size) {
        stack = new MyArray(size);
    }

    public void push(int data) {
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        stack.addElement(data);
        top++;
    }

    public int pop() {
        if (top == 0){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return stack.removeElement(--top);
    }

    public int peek() {
        if (top == 0) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return stack.getElement(top-1);
    }

    public int getSize() {
        return top;
    }

    public boolean isFull() {
        return top == stack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printAll() {
        stack.printAll();
    }

}
