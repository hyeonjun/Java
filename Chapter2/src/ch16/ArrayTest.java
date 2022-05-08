package ch16;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int x: arr) {
            total += x;
        }
        System.out.println(total);

        // 문자 배열을 만들어 A-Z까지 배열에 저장하여 출력
        char[] alpha = new char[26];
        char ch = 'A';

        for(int i=0; i<alpha.length; i++) {
            alpha[i] = ch++;
        }

        for(char x: alpha) {
            System.out.print(x + "(" + (int)x + ") ");
        }

        System.out.println("\n=============================\n");

        // 2차원 배열
        int r=5, c=4;
        int[][] arr2 = new int[r][c];
        int size = r * c;
        for(int i=0; i<size; i++) {
            arr2[i/c][i%c] = i+1;
        }

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(", \t" + arr2.length) ;
        }

    }
}
