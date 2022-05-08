package ch14.gamelevel;

public class PlayTest {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvanedLevel());
        player.play(2);

        player.upgradeLevel(new SuperLevel());
        player.play(3);

        player.upgradeLevel(new UltraSuperLevel());
        player.play(4);
    }
}
