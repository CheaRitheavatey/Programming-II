package Methodology.week6Package;

public class Car extends Vehicle {
    // data field
    private int numDoor;

    // constructor
    public Car(String brand, int year, int numDoor) {
        super(brand, year, VehicleType.CAR);
        this.numDoor = numDoor;
    }

    // getter
    public int getNumDoor() {
        return this.numDoor;
    }
    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("starting the car engine");
    }

    @Override
    public void accelerate() {
        throw new UnsupportedOperationException("accelerating the car");
    }

    
}
