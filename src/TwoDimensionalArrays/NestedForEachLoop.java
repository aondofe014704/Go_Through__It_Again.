package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedForEachLoop {
    public static void main(String[] args) {
        List<List<Integer>> alGrades = new ArrayList<>();
        alGrades.add(Arrays.asList(5, 7, 8, 9));
        alGrades.add(Arrays.asList(5, 90, 87, 65));
        alGrades.add(Arrays.asList(65, 54, 12, 43));
        System.out.println(Arrays.toString(alGrades.toArray()));

        for (List<Integer> grades : alGrades){
            for (int grade : grades){
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }
}
