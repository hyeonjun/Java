package ch08.List_ex;

public class MemberArrayListTest {

    public static void main(String[] args) {
        MemberArrayList arrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        arrayList.addMember(memberLee);
        arrayList.addMember(memberKim);
        arrayList.addMember(memberKang);
        arrayList.addMember(memberHong);

        arrayList.showAllMember();

        arrayList.removeMember(memberHong.getMemberId());
        arrayList.showAllMember();

    }

}
