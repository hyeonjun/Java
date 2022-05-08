package ch06.SecondaryStream;

import java.io.*;

public class BufferedStreamTest {
    // BufferedInputStream과 BufferedOutputStream을 이용하여 파일 복사하는 예
    public static void main(String[] args) {

        long millisecond = 0;
        try (FileInputStream fis = new FileInputStream("a.zip");
             FileOutputStream fos = new FileOutputStream("copy.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            millisecond = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1)
                bos.write(i);
            millisecond = System.currentTimeMillis() - millisecond;

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
    }
}
