package Methodology.week6Package;

public class Bicycle extends Vehicle {
    // data field
    private int wheel;

    // constructor
    Bicycle(String brand, int year, int wheel) {
        super(brand, year, VehicleType.BICYCLE);
        this.wheel = wheel;
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate bicycle");
    }

    @Override
    public void startEngine() {
        System.out.println("no engine to start");
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

}
