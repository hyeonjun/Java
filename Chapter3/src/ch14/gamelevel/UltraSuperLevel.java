package ch14.gamelevel;

public class UltraSuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("Ultra Run");
    }

    @Override
    public void jump() {
        System.out.println("Ultra Jump");
    }

    @Override
    public void turn() {
        System.out.println("Ultra Turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** Ultra 레벨입니다. ******");
    }
}
