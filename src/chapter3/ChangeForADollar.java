package chapter3;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String args[]){

//        Initialize the known values
        double pennies = .01;
        double nickels = .05;
        double dimes = .10;
        double quarters = .25;
        int dollar = 1;

//        Ask the user for the quantities of each coin
        Scanner scanner = new Scanner((System.in));

        System.out.println("How many pennies would you like?");
        double pennyAmount = scanner.nextDouble();

        System.out.println("How many nickels would you like?");
        double nickelAmount = scanner.nextDouble();

        System.out.println("How many dimes would you like?");
        double dimeAmount = scanner.nextDouble();

        System.out.println("How many quarters would you like?");
        double quarterAmount = scanner.nextDouble();

        scanner.close();

//        Count the values
        double totalPennies = pennies * pennyAmount;
        double totalNickels = nickels * nickelAmount;
        double totalDimes = dimes * dimeAmount;
        double totalQuarters = quarters * quarterAmount;
        double total = totalPennies + totalNickels + totalDimes + totalQuarters;
        double overAmount = total - dollar;
        double underAmount = dollar - total;

//        Decision structure
        if(total == dollar){
            System.out.println("Congrats! You won the game!");
        }
        else if(total != dollar && total > dollar){
            System.out.println("You went over one dollar by " + overAmount);
        }
        else if(total != dollar && total < dollar){
            System.out.println("You are under one dollar by " + underAmount);
        }
    }
}
