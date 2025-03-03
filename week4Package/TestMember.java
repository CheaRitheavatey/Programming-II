package week4Package;

class Member {
    // data field: name age specializtion
    private String name;
    private int age;
    private String specialization;

    // constructor
    Member() {
        this("Default name", 0, "Default Specialization");
    }
    Member(String name, int age, String specialization) {
        this.name = (!name.trim().equals("")) ? name.trim() : "unkown";
        this.age = age;
        this.specialization = specialization;

    }
    // to create an instance all field values should be passed = create a constructor that take in the data field

    // getter and setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getSpecialization() {
        return this.specialization;
    }

    // method to print out the information
    public void printInfo() {
        System.out.println(" Name: " + getName() + " Age: " + getAge() + " Specialize: " + getSpecialization());
    }
    
}


public class TestMember {
    public static void main(String[] args) {
        // create an instance
        Member member1 = new Member("Joe", 12, "Doctor");
        member1.printInfo();

        System.out.println();

        // change his age
        member1.setAge(26);
        member1.printInfo();

        System.out.println();

        // change his specialization
        member1.setSpecialization("Dentist");
        member1.printInfo();

        System.out.println();

        // change his name
        member1.setName("Jooooo");
        member1.printInfo();

    }
}