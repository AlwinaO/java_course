package chapter6;

import java.util.Scanner;

public class PhoneBill {

//    private Scanner scanner = new Scanner(System.in);
//
//     scanner.close();

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

//    default constructor
    public PhoneBill(){
        id = 0;
        baseCost = 80.00;
        allottedMinutes = 400;
        minutesUsed = 400;
    }

//    constructor with id set
    public PhoneBill(int id){
        setId(id);
        baseCost = 80.00;
        allottedMinutes = 400;
        minutesUsed = 400;
    }

//    constructor with all fields
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

//    getter and setter methods for each fields
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverageFee(){
        if (minutesUsed <= allottedMinutes){
            return 0;
        }

        double overageFee = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        double overageFeeTotal = overageFee * overageMinutes;
        return overageFeeTotal;
    }

    public double calculatePlanTax(){
        double tax = 0.15;
        double totalTax = tax * (baseCost + calculateOverageFee());
        return totalTax;
    }

    public double calculateFinalBill(){
        double finalBill = baseCost + calculateOverageFee() + calculatePlanTax();
        return  finalBill;
    }

    public void displayBill(){
        System.out.println("Id: " + id);
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage Fee: $" + calculateOverageFee());
        System.out.println("Tax: $" + calculatePlanTax());
        System.out.println("Total: $" + calculateFinalBill());
    }
}

//        double phonePlan = getPhonePlan();
//        int overageMinutes = getOverageMinutes();
//
//
//        double overageFeeTotal = calculateOverageFee(overageFee, overageMinutes);
//        double totalTax = calculatePlanTax(tax, phonePlan, overageFeeTotal);
//        double finalBill =  calculateFinalBill(phonePlan, overageFeeTotal, totalTax);
//
//        displayBill(phonePlan, overageFeeTotal, totalTax, finalBill);
//

//    public double getPhonePlan(){
//        System.out.println("Enter base cost of the plan:");
//        double phonePlan = scanner.nextDouble();
//        return phonePlan;
//    }
//
//    public int getOverageMinutes(){
//        System.out.println("Enter overage minutes:");
//        int overageMinutes = scanner.nextInt();
//        return overageMinutes;
//    }
