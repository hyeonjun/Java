package ch08.Set_ex;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("kim");
        hashSet.add("Kim");
        hashSet.add("kim");
        hashSet.add("kang");
        hashSet.add("kam");

        System.out.println(hashSet); // [kam, kang, kim, Kim]

    }
}
