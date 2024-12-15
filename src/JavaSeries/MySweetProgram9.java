package JavaSeries;

import java.util.Scanner;

public class MySweetProgram9 {
    public static void main(String[] args) {
        String realPassword = "Let me in";
        System.out.println("Guess the password");
        Scanner guessedPassword = new Scanner(System.in);
        String guess = guessedPassword.nextLine();
        System.out.println(realPassword.equals(guess));
    }
}
