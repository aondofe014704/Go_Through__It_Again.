package TwoDimensionalArrays;

import java.util.Arrays;

public class ExampleOne {
    public static void main(String[] args) {
        int[][] grades = {
                {1, 2, 3},
                {4, 5, 6, 12, 13, 14},
                {7, 8, 9}
        };
        System.out.println(grades[1][4]);
        System.out.println(Arrays.deepToString(grades));

    }
}
