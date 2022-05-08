package ch13.extends_interface;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        ((X) myClass).x();
        ((Y) myClass).y();

        myClass.x();
        myClass.y();
        myClass.myMethod();
    }
}
