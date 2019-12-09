package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overageFee = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double phonePlan = getPhonePlan();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        double overageFeeTotal = calculateOverageFee(overageFee, overageMinutes);
        double totalTax = calculatePlanTax(tax, phonePlan, overageFeeTotal);
        double finalBill =  calculateFinalBill(phonePlan, overageFeeTotal, totalTax);

        displayBill(phonePlan, overageFeeTotal, totalTax, finalBill);
    }

    public static double getPhonePlan(){
        System.out.println("Enter base cost of the plan:");
        double phonePlan = scanner.nextDouble();
        return phonePlan;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double calculateOverageFee(double overageFee, int overageMinutes){
        double overageFeeTotal = overageFee * overageMinutes;
        return overageFeeTotal;
    }

    public static double calculatePlanTax(double tax, double phonePlan, double overageFeeTotal){
        double totalTax = tax * (phonePlan + overageFeeTotal);
        return totalTax;
    }

    public static double calculateFinalBill(double phonePlan, double overageFeeTotal, double totalTax){
        double finalBill = phonePlan + overageFeeTotal + totalTax;
        return  finalBill;
    }

    public static void displayBill(double phonePlan, double overageFeeTotal, double totalTax, double finalBill){
        System.out.println("Plan: $" + phonePlan);
        System.out.println("Overage Fee: $" + overageFeeTotal);
        System.out.println("Tax: $" + totalTax);
        System.out.println("Total: $" + finalBill);
    }
}
