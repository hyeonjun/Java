package ch12;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("James", 5000);
        Student s2 = new Student("Tomas", 10000);
        Student s3 = new Student("Edward", 20000);

        Bus bus = new Bus(100);
        Subway subway = new Subway(2);
        Taxi taxi = new Taxi("잘나간다 운수");

        s1.takeBus(bus);
        s2.takeSubway(subway);
        s3.takeTaxi(taxi, 10000);

        s1.info(); s2.info(); s3.info();
        bus.info(); subway.info(); taxi.info();
    }
}
