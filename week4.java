
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
     public void setSpeed(int speed) {
        this.speed = speed;
     }
     public void setGear(int gear) {
        this.gear = gear;
     }

     public int getSpeed() {
        return speed;
     }
     public int getGear() {
        return gear;
     }
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
         System.out.println("The current speed: " + getSpeed());
         System.out.println("The current gear: " + getGear());
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
