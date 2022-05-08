package ch01;

class OutClass2 {
    private int num = 10;
    private static int sNum = 20;

    public OutClass2() {}

    static class StaticInnerClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){   //정적 클래스의 일반 메서드
            // num += 10;    // 에러 -> 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            // static으로 선언된 내부 클래스이기 때문에 밖에 있는 OutClass2가 생성과 상관없이 만들어질 수 있기 때문에 외부 클래스의 인스턴스 변수를 사용할 수 없음
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
        }

        static void sTest() { // 정적 클래스의 static 메서드
            // num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            // inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
            // static 클래스의 static 메서드는 static 클래스가 생성되지 않아도 static 메서드가 호출될 수 있기 때문에 static 클래스의 인스턴스 변수를 사용 불가능

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

        }

    }
}

public class StaticInnerClass {

    public static void main(String[] args) {
        //외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
        OutClass2.StaticInnerClass sInClass = new OutClass2.StaticInnerClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println();

        System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
        OutClass2.StaticInnerClass.sTest();

    }
}
