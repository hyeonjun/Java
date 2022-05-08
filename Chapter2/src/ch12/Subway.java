package ch12;

public class Subway {
    int num;
    int passongerCount;
    int money;

    public Subway(int num) {
        this.num = num;
    }

    public void take(int money) {
        this.money += money;
        passongerCount++;
    }

    public void info() {
        System.out.println(num + "번 지하철의 승객은 " + passongerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
