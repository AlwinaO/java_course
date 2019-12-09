package chapter6;

public class Rectangle {

/*
    these fields are different from the setLength/setWidth values; different scopes;
    follows encapsulation to make fields private and methods public
 */
    private double length;
    private double width;

//    default constructor with fields set to 0; no variables in parens because we are referring to the global variables
    public Rectangle(){
        length = 0;
        width = 0;
    }

//    constructor that allows user to include fields if known and will set to those values
    public Rectangle(double length, double width){
        setLength(length); //can be set this way
        this.width = width; //or can be set this way. these are only different here to demo alternative options
    }

//    getter and setter methods
    public double getLength(){
        return length;
    }

//    this.length refers to the class' length and length is the local variable passed in to setLength
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return  (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
