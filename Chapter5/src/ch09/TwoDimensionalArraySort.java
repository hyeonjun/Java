package ch09;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class TwoDimensionalArraySort {

    public static void main(String[] args) {

        Integer[] arr = {4,23,33,15,17,19};
        Arrays.sort(arr); // 오름차순
        System.out.println(Arrays.toString(arr)); // [4, 15, 17, 19, 23, 33]

        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순
        System.out.println(Arrays.toString(arr)); // [33, 23, 19, 17, 15, 4]

        // 일부분 정렬
        Arrays.sort(arr, 0, 3); // 0번부터 3번까지 요소만 정렬 -> 33, 23, 19
        System.out.println(Arrays.toString(arr)); // [19, 23, 33, 17, 15, 4]


        Integer[][] arrays = { { 0, 3 }, { 2, 6 }, { 1, 9 }, { 1, 8 } };
        Arrays.sort(arrays, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) { // 0번째 인덱스의 수가 같으면 1번째 인덱스 수로 비교하여 내림차순
                if (Objects.equals(o1[0], o2[0]))
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });
        System.out.println(Arrays.deepToString(arrays));

        arrays = new Integer[][]{{0, 3}, {2, 6}, {1, 9}, {1, 8}};
        Arrays.sort(arrays, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) { // 0번째 인덱스의 수가 같으면 1번째 인덱스 수로 비교하여 내림차순
                if (Objects.equals(o1[0], o2[0]))
                    return o2[1] - o1[1];
                else
                    return o1[0] - o2[0];
            }
        });
        System.out.println(Arrays.deepToString(arrays));


        // 람다식으로 구현
        arrays = new Integer[][]{{0, 3}, {2, 6}, {1, 9}, {1, 8}};
        Arrays.sort(arrays, (o1, o2) -> Objects.equals(o1[0], o2[0]) ? o1[1] - o2[1] : o1[0] - o2[0]);
        System.out.println(Arrays.deepToString(arrays));

        arrays = new Integer[][]{{0, 3}, {2, 6}, {1, 9}, {1, 8}};
        Arrays.sort(arrays, (o1, o2) -> Objects.equals(o1[0], o2[0]) ? o2[1] - o1[1] : o1[0] - o2[0]);
        System.out.println(Arrays.deepToString(arrays));
    }

}
