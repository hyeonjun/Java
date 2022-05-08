package ch03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c = Class.forName("java.lang.String");

        Constructor[] constructors = c.getConstructors();
        for(Constructor cons: constructors) {
            System.out.println(cons);
        }

        Method[] methods = c.getMethods();
        for(Method m: methods) {
            System.out.println(m);
        }
    }
}
