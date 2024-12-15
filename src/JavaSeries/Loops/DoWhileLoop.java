package JavaSeries.Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        String password = "who are you";
        String guessPassword;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Guess the password");
             guessPassword = scanner.nextLine();
        } while (!guessPassword.equals(password));
        System.out.println("Congratulations, Champ...");
        scanner.close();
    }
}
