package JavaSeries.Classes;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("Please Guess the Password");
        Scanner scanner = new Scanner(System.in);
        String guessedPassword = scanner.nextLine();
        System.out.println(password.toLowerCase().equals(guessedPassword));
        if(password.equals(guessedPassword)){
            System.out.println("Your Guess was Correct");
        } else if("Don't stop believing".toLowerCase().equals(guessedPassword)){
            System.out.println("You are welcome");
        }
        else {
            System.out.println("Your Guess was Not Correct");
        }
    }
}
