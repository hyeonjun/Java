package ch03;

public class StringCancatImpl implements StringConcat{
    @Override
    public void stringConcat(String s1, String s2) {
        System.out.println(s1 + ", " + s2);
    }
}
