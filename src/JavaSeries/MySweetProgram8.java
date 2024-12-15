package JavaSeries;

import java.util.Scanner;

public class MySweetProgram8 {
    public static void main(String[] args) {
        String stringMethods = "\t\nYummmmm...My Oh Chicken Pot Pie........";
        System.out.println(stringMethods.toUpperCase().stripLeading());
        System.out.println(stringMethods.toLowerCase().substring(9, 17));
        System.out.println("Enter your name");
        Scanner noSpaces = new Scanner(System.in);
        String yourName = noSpaces.nextLine();
        System.out.println(yourName.strip());


    }
}
