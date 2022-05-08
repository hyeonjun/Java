package ch07;

public class Person {

    int height;
    int weight;
    int age;
    String name;

    public Person() {}

    public Person(int height, int weight, int age, String name) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
