package ch02;

import java.util.StringTokenizer;

public class StringBuilderBuffer {

    public static void main(String[] args) {
        String java = "java";
        String android = "android";

        StringBuilder builder = new StringBuilder(java);
        System.out.println(System.identityHashCode(java));
        System.out.println(System.identityHashCode(builder)); // 1324119927
        builder.append(android);
        System.out.println(System.identityHashCode(builder)); // 1324119927

        java = builder.toString();
        System.out.println(System.identityHashCode(java));

        StringBuilder builder1 = new StringBuilder();
        builder1.append("j");
        builder1.append("a");
        builder1.append("v");
        builder1.append("a");
        System.out.println(builder1);

        StringBuffer buffer = new StringBuffer();
        buffer.append("j");
        buffer.append("a");
        buffer.append("v");
        buffer.append("a");
        System.out.println(buffer);

    }




}
