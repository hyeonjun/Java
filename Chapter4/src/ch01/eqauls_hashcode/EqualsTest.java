package ch01.eqauls_hashcode;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(100, "Lee");
        Student student2 = new Student(100, "Lee");

        System.out.println(student1 == student2); // false
        System.out.println(student1.equals(student2)); // true -> equals() 메서드를 재정의하여 논리적 동일함을 보기 때문

        System.out.println(student1.hashCode()); // 100
        System.out.println(student2.hashCode()); // 100 => studentId를 반환함

        Student student3 = (Student) student1.clone();
        System.out.println(student3);
        System.out.println(student1 == student3); // false

        System.out.println("=============================================");

        Integer i1=100, i2=100;
        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2)); // System.identityHashCode(): 실제 해시코드 값을 반환해주는 함수

    }

}
