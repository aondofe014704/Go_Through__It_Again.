package JavaSeries.Classes;

import java.util.Scanner;

public class IfChallenge {
    public static void main(String[] args) {
        System.out.println("whats your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name.equals("Mary")){
            System.out.println("You are welcome my wife");
        } else if (name.equals("Sewuese")){
            System.out.println("You are welcome my daughter");
        } else if (name.equals("Jack")){
            System.out.println("You are welcome father of the house");
        } else {
            System.out.println("Try again later");
        }
    }
}
