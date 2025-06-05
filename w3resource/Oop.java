package w3resource;

public class Oop {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
    }
    
}

// default constructor
class Cat {
    // data field
    private String name;
    private int age;

    Cat() {
        this.name = "Unknown";
        this.age= 0;
    }
    // getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}

// construcotr with array initialization
class Classroom {
    // data field
    private String classname;
    private String[] student;

    Classroom(String classname, String[] student) {
        this.classname = classname;
        this.student = student;
    }

    // print classroom
    public void printClassroom() {
        System.out.println("Class Name: " + classname);
        System.out.println("Students: ");
        for (String stu: student) {
            System.out.println(stu+" ");
        }
        System.out.println();
    }


}

// overload constructor: aka different data type
class Point {
    // data field
    private int x;
    private int y;

    // constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void printConstructor() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
