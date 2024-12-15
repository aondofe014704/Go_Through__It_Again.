package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IteratingThroughAnArray {
    public static void main(String[] args) {
        int[] grades = new int[10];
        System.out.println("please enter your grades:");
        Scanner userGrades = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            int newGrades = userGrades.nextInt();
            grades[i] = newGrades;
        }
        System.out.println(Arrays.toString(grades));
    }
}
