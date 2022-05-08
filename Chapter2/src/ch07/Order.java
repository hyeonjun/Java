package ch07;

public class Order {

    String id;
    String phoneNumber;
    String address;
    String date;
    String time;
    int price;
    String menuNumber;

    public Order(String id, String phoneNumber, String address, String date, String time, int price, String menuNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                ", menuNumber='" + menuNumber + '\'' +
                '}';
    }
}
