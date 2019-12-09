package chapter2exercise;

import java.util.Scanner;

public class SeasonCoffee {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

//    Get the favorite season of the year
        System.out.println("Enter your favorite season of the year:");
        String season = scanner.next();

//    Get the number of cups of coffee as a whole number
        System.out.println("Enter the cups of coffee you drink:");
        int cups = scanner.nextInt();

//    Get a description for the season of the year
        System.out.println("Enter an adjective to describe your favorite season of the year:");
        String adjective = scanner.next();

        scanner.close();

//    Display the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee.");

    }
}
