package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.List;

public class IteratingThroughAList {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        for (int i = 0; i < grades.size(); i++) {
            grades.set(i, grades.get(i) * 2);
            System.out.println(grades.get(i));
        }
    }
}
