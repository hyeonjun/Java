package ch09;

public class Member implements Comparable<Member>{

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
    public int compareTo(Member o) { // a와 b를 비교했을 때 a가 크다면 양수, 작다면 음수를, 같으면 0을 반환하여 정렬함
        // return this.memberId - o.memberId; // 오름차순
        return (this.memberId - o.memberId) * (-1); // 내림차순
    }
}
