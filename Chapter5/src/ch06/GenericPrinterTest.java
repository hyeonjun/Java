package ch06;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>(); // Powder는 Material을 상속받고 있기 때문에 T 자료형에 사용 가능
        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial(); // 형 변환 안해도 됨 -> (Powder)powderPrinter.getMaterial()
        System.out.println(powder);

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>(); // Plastic은 Material을 상속받고 있기 때문에 T 자료형에 사용 가능
        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial(); // 형 변환 안해도 됨
        System.out.println(plastic);

    }




}
