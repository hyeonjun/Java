package ch06.IOBytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    // byte[] 배열에 A-Z 까지 넣고 배열을 한꺼번에 파일에 쓰기
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("output.txt", true);
        try (fos) { // java 9부터 제공되는 기능
            byte[] b = new byte[26];
            for (int i=0; i <b.length; i++) {
                b[i] = (byte) (65+i);
            }
            fos.write(b); //배열 한꺼번에 출력하기
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
