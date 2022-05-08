package ch08.List_ex;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>(); // 멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) { // 멤버 아이디로 멤버 삭제, 삭제 여부 반환
        for (int i=0; i<arrayList.size(); i++) {
            Member member = arrayList.get(i);
            if (memberId == member.getMemberId()) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;
    }

    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

}
