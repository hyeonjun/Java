package ch09;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay date = new BirthDay();

        date.setYear(2022);
        date.setMonth(12);
        date.setDay(30);
        date.showDate();

        date.setMonth(13);
        date.showDate();
    }
}
