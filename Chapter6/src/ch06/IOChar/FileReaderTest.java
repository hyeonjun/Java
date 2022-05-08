package ch06.IOChar;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    // 파일에서 문자 읽기
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("reader.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
