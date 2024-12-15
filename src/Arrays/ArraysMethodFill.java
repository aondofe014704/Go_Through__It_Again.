package Arrays;

import java.util.Arrays;

public class ArraysMethodFill {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.fill(grades, 23);
        System.out.println(Arrays.toString(grades));
    }
}
