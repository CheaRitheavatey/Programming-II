package Methodology.week6Package;

public class TestFile {
    public static void main(String[] args) {
        // abstract class cannot be instaniated
        Dog dog1 = new Dog("Dog1 ", 3, "blue","breed1" );
        System.out.println(dog1.makeSound());

        Car car1 = new Car("ABC", 1, 4); // this way you can get method in the car class
        car1.startEngine();
        car1.accelerate();
        car1.getNumDoor(); // so using it this way you can access getNumberDoor
        car1.getVehicleType();

        Vehicle car2 = new Car("Brand2", 3, 2); // this way you can only get method in the vehicle class
        car2.startEngine(); // dont have getNumDoor() method cuz its not in the vehicle class
        
        

    }

    
}
