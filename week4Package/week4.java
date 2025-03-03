package week4Package;
class Car {
     // data field
     private int speed;
     private int gear;
     // constructor
     Car() {
         this(0, 1);
     }
     
     Car(int speed, int gear ) {
         this.speed = speed;
         this.gear = gear;
     }
 
     // getter setter
     // methods
     public void changeGear(int newValue) {
         this.gear = newValue;
     }
 
     public void increaseSpeed(int increase) {
         this.speed += increase;
     }
 
     public void breaking(int decrease) {
         if (this.speed >= decrease) {
             this.speed -= decrease;
         } else {
             System.out.println("cannot decrease anymore");
         }
         
     }
 
     public void printState() {
         System.out.println("The current speed: " + this.speed);
         System.out.println("The current gear: " + this.gear);
     }

}
public class week4 {
    public static void main(String[] args) {
        Car suv = new Car();
        suv.printState();

        Car roll = new Car(20, 3);
        roll.printState();

        roll.changeGear(1);
        roll.printState();

        roll.increaseSpeed(60);
        roll.printState();

        roll.breaking(15);
        roll.printState();

    }
   
    
}
