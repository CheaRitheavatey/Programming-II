package Methodology.week5Package;
class InheritancePractice {
    // data field
    private int a;
    private String b;

    public void printSomething() {
        System.out.println("This is in inheritanacePractice class");
    }

    // nested class
    class nestedclass {
        // this class also a member of the inheritancePractice but it cannot be inheritance and it depend on the big class above it
    }
}

class ExampleOne extends InheritancePractice {
    // single inheritance when its one on one like that

}

class ExampleTwo extends ExampleOne {
    // this is multiple inheritance cuz A -> B -> C (A inherit B, B inherit C)
}

class ExampleThree extends InheritancePractice {
    // now its not one on one anymore cuz this class extend inheritancePractice => it is now heiracrchal inheritance
}


public class TestInheritance {
    public static void main(String[] args) {
        InheritancePractice one = new InheritancePractice();
    }
    
}


