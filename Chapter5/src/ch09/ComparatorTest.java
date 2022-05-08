package ch09;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
//        return o1.compareTo(o2) * -1; // 내림차순
        return o1.compareTo(o2); // 오름차순
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>(new MyCompare());

        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");

        System.out.println(set1);

    }
}
