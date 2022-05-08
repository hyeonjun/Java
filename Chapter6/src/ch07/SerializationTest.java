package ch07;

import java.io.*;

class Person1 implements Serializable {

    private static final long serialVersionUID = -1503252402544036183L;

    String name;
    String job;

    public Person1() {}

    public Person1(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

public class SerializationTest {

    public static void main(String[] args) {

        Person1 personAhn = new Person1("이순신", "대표이사");
        Person1 personKim = new Person1("김유신", "상무이사");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.out"))) {
            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.out"))) {
            Person1 p1 = (Person1) ois.readObject();
            Person1 p2 = (Person1) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
