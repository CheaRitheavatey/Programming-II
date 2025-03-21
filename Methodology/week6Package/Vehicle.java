package Methodology.week6Package;


// represent a general vehicle and define the rules
public abstract class Vehicle {
    // data field
    protected String brand;
    protected int year;
    protected VehicleType vehicleType; // we make it protected cuz we want to access it in the child class
    

    // constructor
    Vehicle(String brand, int year, VehicleType vehicleType) {
        this.brand = brand;
        this.year = year;
        this.vehicleType = vehicleType;
    }

    // getter setter
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // abstract method
    public abstract void startEngine();
    public abstract void accelerate();

    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: "+ this.year);
        System.out.println("Vehicle Type: " + this.vehicleType);
  
    
    }



}
