package JavaSeries.Classes;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("whats your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch(name){
            case "Sewuese":
                System.out.println("Welcome my daughter");
                break;
            case "Mary":
                System.out.println("You are welcome my wife");
                break;
            case "Jack":
                System.out.println("Lets all welcome father of the house");
                break;
            default:
                System.out.println("Try again later");
                break;
        }
    }
}
