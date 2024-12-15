package JavaSeries.Classes;

import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(age);
        System.out.println("Cats or Dogs");
        String preferedPet = scanner.nextLine();
        System.out.println(preferedPet);
        if(age > 12 && !preferedPet.equals("Dogs")){
            System.out.println("You are welcome");
        }
    }
}