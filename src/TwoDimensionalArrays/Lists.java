package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(5);
        grades.add(7);
        grades.add(9);
        grades.set(2, 70);
        System.out.println(grades.get(2));
        System.out.println(grades.indexOf(5));
        System.out.println(grades.indexOf(7));
        System.out.println(grades.indexOf(70));
        System.out.println(grades.contains(8));
        System.out.println(grades);
    }
}
