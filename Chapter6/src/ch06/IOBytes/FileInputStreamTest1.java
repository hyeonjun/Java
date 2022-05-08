package ch06.IOBytes;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    // 파일에서 한 바이트씩 자료 읽기
    public static void main(String[] args) {
        FileInputStream fs = null;

        try {
            fs = new FileInputStream("input.txt");

            System.out.println((char)fs.read());
            System.out.println((char)fs.read());
            System.out.println((char)fs.read());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fs != null;
                fs.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end");

    }
}
