package ch09;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        for (int i=start; i<=end; i++) {
            total += i;
        }
    }

    public static void main(String[] args) {
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        try { // main이 수행되는 동안 두 쓰레드의 결과가 끝날때까지 기다리도록 함 => main이 non-runnable로 빠짐
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) { // 쓰레드가 다시 돌아오지 못하는 경우
            e.printStackTrace();
        }


        System.out.println(jt1.total);
        System.out.println(jt2.total);
        System.out.println(jt1.total + jt2.total);

    }
}
