package Arrays;

import java.util.Arrays;

public class CommonArrayMethods {
    public static void main(String[] args) {
        int[] gradesOne = {1, 2, 3, 72, 5};
        int[] gradesTwo = {1, 2, 3, 72, 5};
        if (gradesOne == gradesTwo){
            System.out.println("Equals");
        }
        if (gradesOne.equals(gradesTwo)){
            System.out.println("Equals");
        }
        System.out.println(gradesOne + " " +gradesTwo);
        if (Arrays.equals(gradesOne, gradesTwo));
        System.out.println("Equals Finally");
    }
}
