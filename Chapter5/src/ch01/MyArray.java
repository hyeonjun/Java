package ch01;

public class MyArray {

    int[] intArr;
    int count; // 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999999;
    public static final String fullError = "not enough memory";
    public static final String indexError = "insert error";
    public static final String emptyError = "There is no element";

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println(fullError);
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {

        if (count >= ARRAY_SIZE) { // 가득 참
            System.out.println(fullError);
            return;
        }

        if (checkIndex(position)) { // index error
            System.out.println(indexError);
            return;
        }

        for (int i = count-1; i>=position; i--) {
            intArr[i+1] = intArr[i]; // 하나씩 이동
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {
        if (isEmpty()) {
            System.out.println(emptyError);
            return ERROR_NUM;
        }

        if (checkIndex(position)) { // index error
            System.out.println(indexError);
            return ERROR_NUM;
        }

        int result = intArr[position];
        for(int i=position; i<count-1; i++) {
            intArr[i] = intArr[i+1];
        }
        count--;
        return result;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getSize() {
        return count;
    }

    public boolean checkIndex(int position) {
        return position < 0 || position >= count;
    }

    public int getElement(int position) {
        if (checkIndex(position)) {
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return;
        }
        for(int i=0; i<count; i++){
            System.out.print(intArr[i]+" ");
        }
        System.out.println();
    }

    public void removeAll() {
        intArr = new int[ARRAY_SIZE];
        count = 0;
    }
}
