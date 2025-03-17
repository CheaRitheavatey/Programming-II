package week6Package;

abstract class Shape {
    // data field
    private String color;

    // constructor
    Shape(String color) {
        this.color = color;
        System.out.println("A shaped colored: " + this.color + " is created");
    }

    // getter setter or concrete method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // abstract method for subclass to implement their own thing
    abstract double getArea();
    abstract double getPerimeter();    


}
public class TestShape {
    

}
