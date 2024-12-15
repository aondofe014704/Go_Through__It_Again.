package TwoDimensionalArrays;

public class IteratingThroughATwoDimensionalArray {
    public static void main(String[] args) {
        int[][] grades = {
                {1, 2, 3},
                {4, 5, 6, 3, 4, 5},
                {7, 8, 9},
                {},
                {10, 11},
                {1, 2, 3, 4, 5}
        };

        for (int row = 0; row < grades.length; row++) {
            for (int column = 0; column < grades[row].length; column++) {
                System.out.print(grades[row][column] + " ");
            }
            System.out.println();
        }
    }
}
