package ch09;

/*
* Thread 종료하기 예제
* - 세 개의 thread를 만듬
* - 각각 무한 루프를 수행
* - 작업 내뇽은 this.sleep(100);
*
* 'A'를 입력받으면 첫 번째 thread를
* 'B'를 입력받으면 두 번째 thread를
* 'C'를 입력받으면 세 번째 thread를
* 'M'을 입력받으면 모든 thread와 main()함수를 종료
* */

import java.io.IOException;

public class TerminateThread extends Thread {

    private boolean flag = false;
    int i;

    public TerminateThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(!flag) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " end");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        TerminateThread threadC = new TerminateThread("C");

        threadA.start();
        threadB.start();
        threadC.start();

        int in;
        while(true){
            in = System.in.read();
            if ( in == 'A'){
                threadA.setFlag(true);
            }else if(in == 'B'){
                threadB.setFlag(true);
            }else if( in == 'C'){
                threadC.setFlag(true);
            }else if( in == 'M'){
                threadA.setFlag(true);
                threadB.setFlag(true);
                threadC.setFlag(true);
                break;
            }
        }
        System.out.println("main end");
    }
}
