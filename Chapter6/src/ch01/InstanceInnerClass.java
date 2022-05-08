package ch01;

class OutClass1 {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass1(){
        inClass = new InClass(); // 내부 클래스 생성
    }

    class InClass{

        int inNum = 100;
        static int sInNum = 200;  // 인스턴스 내부 클래스에서 정적 변수와 정적 메서드를 선언하면 에러가 난다고 한다. 근데 왜 안나지?

        void inTest(){
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println(sInNum);
        }

        static void sTest(){ // 에러가 나야 하는데..
        }

    }

    public void usingClass(){
        inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
    }
}


public class InstanceInnerClass {

    public static void main(String[] args) {
        // 외부 클래스를 이용하여 내부 클래스 기능 호출
        OutClass1 outClass = new OutClass1();
        outClass.usingClass(); // 내부 클래스 기능 호출하는 메서드 호출

        System.out.println();

        // 외부 클래스를 이용하여 내부 클래스 생성
        OutClass1.InClass inClass = outClass.new InClass();
        inClass.inTest();
    }
}
