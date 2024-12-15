package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(5, 3, 2, 6, 3, 7);
        for (int grade : grades) {
            if(grade % 2 == 0) {
                System.out.println("Even" + grade);
            } else {
                System.out.println("Odd" + grade);
            }
            System.out.println(grade * 4);
        }
    }
}
