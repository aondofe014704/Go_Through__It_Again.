package JavaSeries.Loops;

import java.util.Scanner;

public class ExampleOfWhileLoop {
    public static void main(String[] args) {
        System.out.println("Please Guess the Password:");
        String password = "who are you";
        Scanner scanner = new Scanner(System.in);
        String guessPassword = scanner.nextLine().toLowerCase();
        while(!guessPassword.equals(password.toLowerCase())){
            System.out.println("Please Guess the Password");
            guessPassword = scanner.nextLine();
        }
        System.out.println("Congratulations, You have Made it");
        scanner.close();

    }
}
