package ch15;

public class CompanyTest {
    public static void main(String[] args) {
        Company com1 = Company.getInstance();
        Company com2 = Company.getInstance();

        System.out.println(com1);
        System.out.println(com2); // 두 결과가 같음, 즉 하나의 인스턴스를 공유함

        //Calendar calendar = Calendar.getInstance();
    }
}
