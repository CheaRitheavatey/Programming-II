package Methodology.week6Package;

public class Dog extends Pet {
    // data field
    private String breed;
    Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }
    @Override
    public String makeSound() {
        return "woof woof";
    }
    
}
    
