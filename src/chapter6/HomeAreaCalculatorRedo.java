package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

/*
        the HomeAreaCalculatorRedo() is a default constructor;
        we instantiated a new object calculator and this object can call methods in this class
 */
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

//        set these variables from the getRoom() method
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();

    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

/*
    the parameters here do not have to be kitchen and bathroom defined above;
    just used to call the calculateArea method from the Rectangle class
 */
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
