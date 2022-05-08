package ch15;

public class Car {

    private int carNum;
    private static int SerialNum = 10001;

    public Car() {
        carNum = SerialNum;
        SerialNum++;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
