package ch06.IOBytes;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    // 파일의 끝까지 한 바이트씩 자료 읽기
    public static void main(String[] args) {

        try(FileInputStream fs = new FileInputStream("input.txt")) {
            int i;
            while ((i = fs.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
