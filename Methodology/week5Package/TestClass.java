package Methodology.week5Package;

class Pet {
    // data field
    private String name;
    private String color;
    private int age;

    //constructor
    Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // getter and setter
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getAge() {
        return this.age;
    }
}

public class TestClass {
    
}
