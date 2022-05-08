package ch08.Map_ex;

public class Member {

    private int memberId;     // 회원 아이디
    private String memberName; // 회원 이름

    public Member(int memberId, String memberName) {
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
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member member) {
            return this.memberId == member.getMemberId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }
}
