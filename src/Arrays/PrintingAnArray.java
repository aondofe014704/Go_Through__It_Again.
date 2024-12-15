package Arrays;

import java.util.Arrays;

public class PrintingAnArray {
    public static void main(String[] args) {
        int[][] grades = {{9, 9, 7}, {4, 3, 1}, {4, 2, 5, 3}};
        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.deepToString(grades));
    }
}
