package ch06.IOBytes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamTest3 {
    // 파일에서 바이트 배열로 자료 읽기 (배열에 남아있는 자료가 있을 수 있음에 유의)
    public static void main(String[] args) {

        try (FileInputStream fs = new FileInputStream(":input.txt")) {
            byte[] b = new byte[10];
            int i;
            while ((i = fs.read(b)) != -1) {
                for (byte bs: b) {
                    System.out.println(bs);
                }
                System.out.println(": "+i+"바이트 읽음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
