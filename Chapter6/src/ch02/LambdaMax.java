package ch02;

@FunctionalInterface // 함수형 인터페이스라는 의미
public interface LambdaMax { // 람다식을 선언하기 위한 인터페이스, 익명함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만 선언 가능
    int max(int x, int y);
}