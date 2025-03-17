package week6Package;

public class Triangle extends Shape{
    // data field
    private double x;
    private double y;
    private double z;

    // constructor
    Triangle(Color color, double x, double y, double z) {
        super(color);
        
        if (x + y < z || x + z < y || z + y < x) {
            throw new IllegalArgumentException("cannot do that bro");
        } else if (x <=0 || y <= 0 || z <= 0){
            throw new IllegalArgumentException("cannot be 0");
        } else {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
    }

    @Override
    public double getArea() {
        double s = (this.x + this.y+ this.z)/2;
        return Math.sqrt(s * (s - this.x) * (s - this.y) * (s - this.z));
    }

    @Override
    public double getPerimeter() {
       return this.x + this.y + this.z;
    }

    // getter setter

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public boolean isEquilateral() {
        return this.x == this.y && this.y == this.z;
    }

    public boolean isIsocesles() {
        return this.x == this.y || this.x == this.z || this.y == this.z;
    }
    public boolean isScalene() {
        return this.x != this.y && this.y != this.z;
    }

}
