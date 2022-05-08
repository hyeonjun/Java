package ch06;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//class System { // System 클래스의 표준 입출력 멤버
//    static PrintStream out;
//    static InputStream in;
//    static PrintStream err;
//}

public class SystemInTest {

    public static void main(String[] args) {

        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
        int i;
        try {
            i = System.in.read(); // 한 바이트 읽기
            System.out.println(i);
            System.out.println((char)i);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
        int j;
        try {
            while ((j = System.in.read()) != '\n') {
                System.out.print((char)j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
