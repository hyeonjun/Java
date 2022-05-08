package ch05;

public class GenericTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        System.out.println(powderGenericPrinter);

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        System.out.println(plasticGenericPrinter);


        GenericPrinter diaTest1 = new GenericPrinter<>(); // 다이아몬드 배부 자료형 생략 가능
        diaTest1.setMaterial(new Powder());
        System.out.println(diaTest1);

        GenericPrinter diaTest2 = new GenericPrinter<>();
        diaTest2.setMaterial(new Plastic());
        System.out.println(diaTest2);
    }

}
