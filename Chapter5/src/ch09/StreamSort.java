package ch09;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StreamSort {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());

        set.add("aaaa");
        set.add("bb");
        set.add("ccccc");

        set.stream().sorted().forEach(System.out::print); // 오름차순, aaaabbccccc
        System.out.println();
        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print); // 내림차순, cccccbbaaaa
        System.out.println();
        set.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::print); // 길이 오름차순, bbaaaaccccc
        System.out.println();
        set.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::print); // 길이 내림차순, cccccaaaabb
    }

}
