package ch01;

class OutClass4 {

    Runnable getRunnable(int i) {
        int num = 100;
        return new Runnable() {
            @Override
            public void run() {
                // num = 200; 에러
                // i = 10; 에러
                System.out.println(i);
                System.out.println(num);
            }
        };
    }
    
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };

}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        OutClass4 out = new OutClass4();

        Runnable runnable = out.getRunnable(10);
        runnable.run();

        out.runnable.run();
    }

}
