package JavaSeries.Classes;

import java.util.Scanner;

public class SringComparison {
    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("Guess the password");
        Scanner scanner = new Scanner(System.in);
        String guessedPassword = scanner.nextLine();
        System.out.println(password.equals(guessedPassword));
        System.out.println(password == guessedPassword);


        String a = new String("hi");
        String b = new String("hi");
        System.out.println(a == b);

        int x = 10;
        int y = 1;
        System.out.println(x == y);
    }
}
