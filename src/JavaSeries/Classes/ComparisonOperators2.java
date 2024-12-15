package JavaSeries.Classes;

import java.util.Scanner;

public class ComparisonOperators2 {
    public static void main(String[] args) {
        System.out.println("How old are you");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(age);
        System.out.println("what is your prefered pet?");
        String animal = scanner.nextLine();
        if (age > 18 || animal.equals("Dogs")){
            System.out.println("You are welcome to the show");
        }

    }
}
