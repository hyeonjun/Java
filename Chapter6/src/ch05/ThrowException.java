package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fs = new FileInputStream(fileName);
        return Class.forName(className);
    }

    public static void main(String[] args) {
        ThrowException test = new ThrowException();

        try {
            test.loadClass("a.txt", "java.lang.String");
        }
        // try 한 블럭에서 예외가 여러개 있을 경우
        // 예외를 묶어서 처리 가능
        catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 각각 따로 처리 가능
        /*catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }
}
