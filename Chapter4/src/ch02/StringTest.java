package ch02;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc"); // Heap 메모리에 저장됨
        String str3 = "abc";
        String str4 = "abc"; // 힙 영역 안에 String pool이라는 곳에 String 객체를 모아둠

        System.out.println(str1 == str2); // false
        System.out.println(str3 == str4); // true

        String str5 = "cba";
        str3 = "cba";
        str2 = "cba";

        System.out.println(str3 +", "+str4 +", "+ (str3 == str4) +", "+ (str3 == str5)); // cba, abc, false, true
        System.out.println(str2);

        System.out.println("========================================================");

        String java = "java";
        String android = "android";
        System.out.println(System.identityHashCode(java)); // 1531448569

        java = java.concat(android);
        System.out.println(System.identityHashCode(java)); // 1867083167 => 새로운 문자열 생성


    }
}
