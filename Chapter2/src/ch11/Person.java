package ch11;

public class Person {

    String name;
    int age;

    public Person() {
        this("no name", 1); // 다른 생성자 호출
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() { // 자신의 주소를 반환
        return this;
    }

    public String showPersion() {
        return name+", "+age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.showPersion());
        System.out.println(person.getPerson());

        Person person1 = person.getPerson();
        System.out.println(person1.getPerson());
    }
}
