package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");

    public static void main(String[] args) {
        String[] datetime = sdf.format(new Date()).split(" ");
        String menuNumber = "0003";
        String phoneNumber = "01023450001";
        int price = 35000;
        Order order = new Order(
                datetime[0]+menuNumber,
                phoneNumber,
                "서울시 강남구 역상동 111-333",
                datetime[0],
                datetime[1],
                price,
                menuNumber);
        System.out.println(order);


    }

}
