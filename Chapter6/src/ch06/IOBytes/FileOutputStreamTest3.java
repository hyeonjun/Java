package ch06.IOBytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    // byte[] 배열의 특정 위치에서부터 정해진 길이만큼 쓰기
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] b = new byte[26];
            for (int i=0; i<b.length; i++) {
                b[i] = (byte) (65+i);
            }
            fos.write(b, 2, 10); // 배열의 2 번째 위치부터 10 개 바이트 출력하기
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
