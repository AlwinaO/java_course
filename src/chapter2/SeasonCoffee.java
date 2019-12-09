package chapter2;

import java.util.Scanner;

public class SeasonCoffee {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite season of the year:");
        String season = scanner.next();
        System.out.println("Enter the cups of coffee you drink:");
        int cups = scanner.nextInt();
        System.out.println("Enter an adjective to describe your favorite season of the year:");
        String adjective = scanner.next();
        scanner.close();
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee.");
    }
}
