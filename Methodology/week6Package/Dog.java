package Methodology.week6Package;

import week6Package.Color;

public class Dog extends Pet {
    // data field
    private String breed;
    Dog(int age, Color color, String breed) {
        super(Specices.DOG, age, color);
        this.breed = breed;
    }
    @Override
    public String makeSound() {
        return "woof woof";
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
    
