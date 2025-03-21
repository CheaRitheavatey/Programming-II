package Methodology.week6Package;

import week6Package.Color;

public abstract class Pet {
    // data field
    private Specices name;
    private Color color;
    private int age;

    //constructor
    Pet(Specices name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // getter and setter
    public void setName(Specices name) {
        this.name = name;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Specices getName() {
        return this.name;
    }
    public Color getColor() {
        return this.color;
    }
    public int getAge() {
        return this.age;
    }

    // abstract method
    public abstract String makeSound();

    
}
