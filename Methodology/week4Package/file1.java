package Methodology.week4Package;

class Car {
    // data field
    private int speed;
    private int gear;
    private String model;
    private String color;

    // constructor
    Car(int speed, int gear, String model, String color) {
        this.speed = speed;
        this.gear = gear;
        this.model = model;
        this.color = color;
    }

    Car() {
        this(0, 1, "BMW", "blue");
    }

    // method'
    public void increaseSpeed(int increase) {
        this.speed += increase;
    }
    public void decreaseSpeed(int decrease) {
        if (this.speed < decrease) {
            System.out.println("Cannot decrease anymore");
        } else {
            this.speed -= decrease;
        }
    }

    public void chageGear(int change) {
        if (this.gear != change) {
            this.gear =  change;
        } else {
            System.out.println("you are in this gear already");
        }
    }

    public void printall() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " Km\\h");
        System.out.println("Gear: " + this.gear);
    }


}
public class file1 {
    public static void main(String[] args) {
        Car[] car = new Car[2];
        car[0] = new Car(56, 3, "Toyota", "red");
        car[1] = new Car();


        for (int i = 0; i < car.length; i++) {
            System.out.println("Car " + i+1 + ": ");		
            car[i].printall();

            car[i].increaseSpeed(10);
            car[i].printall();

            car[i].decreaseSpeed(5);
            car[i].printall();
            
            car[i].chageGear(2);
            car[i].printall();

        }

    }
}
