package ch03;

public class TestStringConcat {

    public static void main(String[] args) {

        String s1="Hello", s2="World";
        
        // 클래스 생성 후 메서드 호출
        StringCancatImpl cancat1 = new StringCancatImpl();
        cancat1.stringConcat(s1, s2);
        
        // 람다식 구현
        StringConcat concat2 = ((x, y) -> System.out.println(x + ",, " + y));
        concat2.stringConcat(s1, s2);

        // 람다식 - 익명 객체 생성
        StringConcat concat3 = new StringConcat() {
            @Override
            public void stringConcat(String s1, String s2) {
                System.out.println(s1 + ",,, " + s2);
            }
        };
        concat3.stringConcat(s1, s2);




    }

}
