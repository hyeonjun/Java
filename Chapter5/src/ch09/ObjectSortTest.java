package ch09;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ObjectSortTest {

    public static void main(String[] args) {
        // Stream을 사용하여 객체 정렬

        ArrayList<Member1> memberArrayList = new ArrayList<>(Arrays.asList(
                new Member1(1001, "이순신"),
                new Member1(1002, "김유신"),
                new Member1(1003, "강감찬"),
                new Member1(1004, "홍길동")
        ));

        // 1. id로 정렬 - 내림차순
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId)).forEach(System.out::println);
        System.out.println();

        // 2. id로 정렬 - 오름차순
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId).reversed()).forEach(System.out::println);
        System.out.println();

        // 3. name으로 정렬 - 내림차순
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberName)).forEach(System.out::println);
        System.out.println();

        // 4. name으로 정렬 - 오름차순
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberName).reversed()).forEach(System.out::println);
        System.out.println();


        memberArrayList.add(new Member1(1001, "유관순"));

        // 5. id로 정렬한 후 이름으로 정렬
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId)
                .thenComparing(Member1::getMemberName)).forEach(System.out::println);
        System.out.println();

        // 6. id 역순 정렬한 후 다시 이름으로 순차 정렬
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId).reversed()
                .thenComparing(Member1::getMemberName)).forEach(System.out::println);
        System.out.println();

        // 7. id로 순차 정렬한 후 이름으로 순차정렬하고 역순
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId)
                .thenComparing(Member1::getMemberName).reversed()).forEach(System.out::println);
        System.out.println();

        // 8. id로 정렬한 후 역순으로 바꾸고 이름으로 정렬 후 역순
        memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId).reversed()
                .thenComparing(Member1::getMemberName).reversed()).forEach(System.out::println);
        System.out.println();
    
        // 정렬 후 ArrayList로 받기
        ArrayList<Member1> sortArrayList = memberArrayList.stream().sorted(Comparator.comparing(Member1::getMemberId))
                .collect(Collectors.toCollection(ArrayList::new));
        for(Member1 member: sortArrayList) {
            System.out.println(member);
        }

    }
}


class Member1 {

    private int memberId;     // 회원 아이디
    private String memberName; // 회원 이름

    public Member1(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member1{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}
