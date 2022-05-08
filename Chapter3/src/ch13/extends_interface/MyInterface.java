package ch13.extends_interface;

interface X {
    void x();
}

interface Y {
    void y();
}

public interface MyInterface extends X, Y { // X, Y 인터페이스를 모두 상속받아 모든 메서드를 받음
    void myMethod();
}
