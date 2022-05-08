package ch03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("James");


        Class c1 = Class.forName("ch03.Person");
        Person person1 = (Person) c1.newInstance();
        person1.setName("Lee");
        System.out.println(person1);
        
        // 로컬에 해당 class가 없을 때 이런식으로 인스턴스를 생성함
        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p); // null

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kim = (Person) cons.newInstance(initargs);
        System.out.println(kim);

        
        
        
    }
}
