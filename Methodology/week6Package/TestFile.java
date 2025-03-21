package Methodology.week6Package;

import week6Package.Color;

public class TestFile {
    public static void main(String[] args) {
        // abstract class cannot be instaniated
        Dog dog1 = new Dog(2, Color.BLACK, "breed 1");
        System.out.println(dog1.makeSound());

        Car car1 = new Car("ABC", 1, 4); // this way you can get method in the car class
        car1.startEngine();
        car1.accelerate();
        car1.getNumDoor(); // so using it this way you can access getNumberDoor
        System.out.println(car1.getVehicleType());
        car1.displayInfo();

        Vehicle car2 = new Car("Brand2", 3, 2); // this way you can only get method in the vehicle class
        car2.startEngine(); // dont have getNumDoor() method cuz its not in the vehicle class
        car2.displayInfo();

        System.out.println();
        allVehicleType();
        

    }

    public static void allVehicleType() {
        // .values() return an array of the enum values
        VehicleType[] arr = VehicleType.values();
        System.out.println(arr);

        for (VehicleType r: arr) {
            System.out.println(r.ordinal()+1 + " element: " + r);
        }
        // index use .ordinal()
    }
    
}
