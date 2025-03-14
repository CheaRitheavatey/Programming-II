package Methodology.week5Package;

class Pet {
    // data field
    private String name;
    private String typeOfPet;
    private int age;

    // getter and setter
    public void setName(String name) {
        this.name = name;
    }
    public void setTypeOfPet(String typeOfPet) {
        this.typeOfPet = typeOfPet;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public String gettypeOfPet() {
        return this.typeOfPet;
    }
    public int getAge() {
        return this.age;
    }
}

public class TestClass {
    
}
