package ch01;

class OutClass3 {
    int outNum = 100;
    static int sNum = 200;

    // Runnable: java.util 패키지에 있으며, 클래스를 쓰레드화할 때 필요한 run 메서드를 구현할 때 사용하는 인터페이스
    Runnable getRunnable(int i) { //
        int num = 100;

        class MyRunnable implements Runnable {

            int localNum = 10;

            @Override
            public void run() {
                // num = 200;   //에러 남. 지역변수는 상수로 바뀜
                // i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
                // getRunnable 메서드가 호출되는 시점과 MyRunnable 클래스가 생성되는 생성 주기가 다르기 때문에 오류가 난다.
                // getRunnable 메서드가 호출된 후 끝이나면 int i, num의 경우 stack 메모리에 로딩되므로 없어진다.
                // 하지만 run 메서드는 getRunnable을 통해 생성되고 나면 getRunnable과 상관없이 또 호출될 수 있다.
                // 즉, run 메서드가 다시 호출되었을 때 i, num이 없을 수 있기 때문에 값을 바꿔주지 못하기 때문에 오류가 난다.
                // 이 말은 즉, i, num은 스택에 잡히지 않도록 하여야하고 i, num을 final로 선언하여 상수화 시킨 후 값을 변경할 수 없도록 한다.
                // 그래서 현재는 final로 선언하지 않아도 컴파일러가 final로 선언되어 진다.

                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + OutClass3.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable(); // MyRunnable 클래스를 사용하기 위해 직접 생성하는 것이 아니라 getRunnable() 메서드를 호추랗여 생성된 객체를 반환 받아야 한다.
    }

}

public class LocalInnerClass {

    public static void main(String[] args) {

        OutClass3 out = new OutClass3();
        Runnable runner = out.getRunnable(10);
        runner.run();

    }

}
