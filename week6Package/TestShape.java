package week6Package;

abstract class Shape {
    // data field
    private Color color;

    // constructor
    Shape(Color color) {
        this.color = color;
        System.out.println("A shaped colored: " + this.color + " is created");
    }

    // getter setter or concrete method

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // abstract method for subclass to implement their own thing
    abstract double getArea();
    abstract double getPerimeter();    


}
public class TestShape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(Color.BLUE, 10, 20);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());


        Shape s1 = new Rectangle(Color.GREEN, 5,11);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        // but cannot access getLength and getWidth 
        
    }

   
    

}
