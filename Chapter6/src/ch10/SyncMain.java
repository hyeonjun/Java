package ch10;

class Bank {
    private int money = 10000;

    public void saveMoney(int saveMoney) {
        synchronized (this) { // 블록 방식
            int m = getMoney();
            try {
                Thread.sleep(3000); // 3초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setMoney(m + saveMoney);
        }
    }

    public synchronized void minusMoney(int minusMoney) {
        int m = getMoney();
        try {
            Thread.sleep(200); // 0.2초
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minusMoney);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {

    @Override
    public void run() {
        System.out.println("start save");
        SyncMain.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());
    }
}

class ParkWife extends Thread {

    @Override
    public void run() {
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
    }
}

public class SyncMain {

    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ParkWife pw = new ParkWife();
        pw.start();
    }
}
