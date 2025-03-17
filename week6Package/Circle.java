package week6Package;

public class Circle extends Shape {
    // data field
    private double radius;

    // constructor
    Circle(Color color, double raidus) {
        super(color);
        this.radius = raidus;
    }

    @Override
    public double getArea() {
        double area = Math.PI *  this.radius * this.radius;
        return Double.parseDouble(String.format("%.2f", area));
        
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return Double.parseDouble(String.format("%.2f", perimeter));
    }
    

    // getter setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
