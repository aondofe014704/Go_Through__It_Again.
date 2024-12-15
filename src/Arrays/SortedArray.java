package Arrays;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] grades = {111, 208, 30, 72, 5, 80, 100};
//        Arrays.sort(grades);
        Arrays.parallelSort(grades);
        System.out.println(Arrays.toString(grades));
    }
}
