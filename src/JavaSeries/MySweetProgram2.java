package JavaSeries;
import java.util.Scanner;

public class MySweetProgram2 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner =  new Scanner(System.in);
        String personName = scanner.nextLine();
        System.out.println("Hello, " + personName + "You are Welcome to the Program");
    }
}