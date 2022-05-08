package ch09;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("자율 주행을 시작합니다.");
        System.out.println("AI가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("AI가 스스로 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("AI가 스스로 와이퍼를 사용합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("AI가 자동차를 세차합니다.");
    }


}
