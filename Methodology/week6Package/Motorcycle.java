package Methodology.week6Package;

public class Motorcycle extends Vehicle{
    // data field
    private int wheel;
    // constructor
    Motorcycle(String brand, int year) {
        super(brand, year, VehicleType.MOTORCYCLE);
        this.wheel = 2;
    }

    @Override
    public void startEngine() {
       System.out.println("startingi engine of the motorcycle");
    }

    @Override
    public void accelerate() {
       System.out.println("accelaerating the motorcycle");
    }

    // getter setter
    public void setWheel(int wheel) {this.wheel = wheel;}
    public int getWheel() {return this.wheel;}

}
