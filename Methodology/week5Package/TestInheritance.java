package Methodology.week5Package;
class InheritancePractice {
    // data field
    private int a;
    private String b;

    protected InheritancePractice() {};
    // InheritancePractice() {}

    InheritancePractice(int a, String b) {
        this.a = a;
        this.b = b;
    }



    public void printSomething() {
        System.out.println("This is in inheritanacePractice class");
    }

    // nested class
    class nestedclass {
        // this class also a member of the inheritancePractice but it cannot be inheritance and it depend on the big class above it
        void display() {
            System.out.println("this is nested class");
        }
    }

    public void accessNestedClass() {
        nestedclass nested = new nestedclass();
        nested.display();
    }
}

class ExampleOne extends InheritancePractice {
    ExampleOne() {
        super();
    }
    // single inheritance when its one on one like that
    ExampleOne(int a, String b) {
        super(a, b);
    }

}

class ExampleTwo extends ExampleOne {
    // this is multiple inheritance cuz A -> B -> C (A inherit B, B inherit C)
    private String c;

    ExampleTwo() {
        super();
    }
    
    ExampleTwo(int a, String b, String c) {
        super(a,b);
        this.c = c;
    }
}

class ExampleThree extends InheritancePractice {
    // now its not one on one anymore cuz this class extend inheritancePractice => it is now heiracrchal inheritance
    ExampleThree(int a, String b) {
        super(a, b);
    }
}


public class TestInheritance {
    public static void main(String[] args) {
        InheritancePractice one = new InheritancePractice(1,"string b");
        one.printSomething();
        one.accessNestedClass();

        ExampleOne two = new ExampleOne();
        two.printSomething();
        two.accessNestedClass();

        ExampleTwo four = new ExampleTwo(0, null, null);

        ExampleThree three = new ExampleThree(2,"string c");
        three.printSomething();
        three.accessNestedClass();
        
    }
    
}