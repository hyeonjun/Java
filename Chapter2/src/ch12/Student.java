package ch12;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void  takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi, int money) {
        taxi.take(money);
        this.money -= money;
    }

    public void info() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }


}
