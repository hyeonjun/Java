package ch09;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작자여 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 밟아 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 와이퍼를 사용합니다.");
    }

}
