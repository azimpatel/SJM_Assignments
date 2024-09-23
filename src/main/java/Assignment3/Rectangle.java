package Assignment3;/*Assignment 1: Class Creation
Objective: Create a simple class to model a Rectangle.

Define a class Rectangle with attributes length and width.
Implement methods to:
Calculate the area.
Calculate the perimeter.
Display the dimensions.
        Submission: Write a main method to test your class

Assignment 2: Overloading Constructors
Objective: Enhance the Rectangle class.

Add multiple constructors:
One that takes no parameters (defaults to length and width of 1).
One that takes one parameter (makes it a square).
One that takes two parameters (length and width).
Submission: Create instances using each constructor in the main method.*/

public class Rectangle {
    double length;
    double width;

    void area()
    {
        System.out.println("Area : "+length*width);
    }
    void Perimeter()
    {
        System.out.println("Perimeter : "+2*(length+width));
    }
    public void dispalydimension()
    {
        System.out.println("Dimensions : "+"\n"+"length : "+length+ "\n"+"width : "+width);
    }

    // constucter overloading
    Rectangle()
    {
        length=1;
        width=1;
    }
    Rectangle(double length)
    {
        this.length=length;
        this.width=length;
    }
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;

    }

}
