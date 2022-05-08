package ch12;

public class Bus {
    int num;
    int passongerCount;
    int money;

    public Bus(int num) {
        this.num = num;
    }

    public void take(int money) {
        this.money += money;
        passongerCount++;
    }

    public void info() {
        System.out.println(num + "번 버스의 승객은 " + passongerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
