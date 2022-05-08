package ch08.Set_ex;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복 => 이를 구현하기위해 Member의 hashCode와 equals 메서드를 재정의
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();

    }
}
