package ch09;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");
        
        for (String name: treeSet) { // String 클래스는 이미 Comparable 인터페이스가 구현되어 있으므로 오름차순으로 정렬되어 출력됨
            System.out.println(name);
        }
    }
}
