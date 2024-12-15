package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.List;

public class ConvertingIntArraysToArrayList {
    public static void main(String[] args) {
        int[] listToBeConverted = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> grades = Arrays.asList(5, 3, 4, 5, 6, 7);
        System.out.println(Arrays.toString(grades.toArray()));
        System.out.println(Arrays.toString(listToBeConverted));
    }
}
