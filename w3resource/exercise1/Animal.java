package w3resource.exercise1;

public class Animal {
    // data field
    private String name;
    private int age;
    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter
    // method
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal make sound: ");
    }
    public void displayInfo() {
        System.out.println("Name: " + getName() + " Age: " + getAge());
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal("Animal", 3);
        animals[1] = new Dog("Doggie", 4);
        animals[2] = new Cat("Cattie", 5);

        // display info
        for (Animal animal: animals) {
            animal.displayInfo();
            animal.makeSound();
        }
    }
    
}


// subclass dog and cat
class Dog extends Animal {
    // data field
    private String name;
    private int age;

    // constructor
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    

}
class Cat extends Animal {
    // data field
    private String name;
    private int age;

    // constructor
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    

}