package week6Package;

public class Rectangle extends Shape{

   // data field
   private double width;
   private double length;

   // constructor
   Rectangle(Color color, double width, double length) {
    super(color);
    this.width = width;
    this.length = length;
   }

   // implement all the abstract method and override it to customize and suit with rectangle
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    // getter and setter
    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    
}
