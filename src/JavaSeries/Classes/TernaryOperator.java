package JavaSeries.Classes;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        String name = "Sewuese";
        System.out.println("Whats your name?");
        Scanner scanner = new Scanner(System.in);
        String yourWelcome = scanner.nextLine();
        boolean welcome = yourWelcome.equals("Sewuese") ? true : false;
        System.out.println(welcome);
    }

}
