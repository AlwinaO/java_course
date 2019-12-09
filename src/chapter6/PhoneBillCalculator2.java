package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator2 {

//    this instantiates PhoneBill

    public static void main(String args[]){

//        constructor with id-only parameter
        PhoneBill bill = new PhoneBill(20);
            bill.setMinutesUsed(1000);
            bill.displayBill();

        System.out.println();

//        default constructor
        PhoneBill bill2 = new PhoneBill();
            bill2.setId(23);
            bill2.displayBill();

        System.out.println();

//        constructor with all fields
        PhoneBill bill3 = new PhoneBill(30, 90.00, 400, 500);
        bill3.displayBill();

    }

}
