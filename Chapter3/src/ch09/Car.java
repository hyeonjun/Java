package ch09;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}
    
    final public void run() { // 재정의 불가능한 메서드
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();

    }
    
}
