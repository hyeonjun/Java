package ch06.SecondaryStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    // FileInputStream으로 읽은 자료를 문자로 변환해주는 예
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;
            while ((i = isr.read()) != -1) // 보조 스트림으로 읽음
                System.out.println((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
