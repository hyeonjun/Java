package ch06.IOBytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    // 파일에 한 바이트씩 쓰기
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(65);  //A
            fos.write(66);  //B
            fos.write(67);  //C
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");

    }
}
