package ch08;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee etiopiaCoffee = new EtiopiaAmericano();
        etiopiaCoffee.brewing();

        System.out.println();
        Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
        etiopiaLatte.brewing();

        System.out.println();
        Coffee etiopiaMocha = new Mocha(new EtiopiaAmericano());
        etiopiaMocha.brewing();

        System.out.println();
        Coffee etiopiaMochaLatte = new Mocha(new Latte(new EtiopiaAmericano()));
        etiopiaMochaLatte.brewing();

        System.out.println();
        Coffee kenyaCoffee = new KenyaAmericano();
        kenyaCoffee.brewing();

        System.out.println();
        Coffee kenyaMochaLatte = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMochaLatte.brewing();
    }
}
