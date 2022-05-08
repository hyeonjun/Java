package ch08;

public class Latte extends Decorator {

    public Latte(Coffee coffee) { // 상위 클래스인 Decorator에서 기본 생성자가 없기 때문에 매개변수가 있는 생성자를 명시적으로 만들어 줘야 함
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Milk");
    }
}
