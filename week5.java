class Inheritance {
    // data field
    private int a; // can only be access in this class
    protected String b; // using protected mean child class that are going to inherit can access this string b


    Inheritance(int a) {
        this.a = a;
        
    }

    public Inheritance() {
        System.out.println("ad");
    }
    public void test() {
        System.out.println(this.a= 100);
    }

}

class Example extends Inheritance {
    // data field
    int c;
    Example(int c, int a) { 
        super(a); // have to put super() first before declare and set a new data field even if the constructor take in other first
        this.c = c;
    }

    Example() {
        super();
    }


    // override the parent method
    public void gettestfromparent() {
        super.test();
        System.out.println(super.b);
    }

    @Override
    public void test() {
        System.out.println("override parent method");
    }

  
}
public class week5{
    public static void main(String[] args) {
        Inheritance x = new Inheritance(1);
        x.test();

        System.out.println();
        Example example = new Example(10,99);
        example.test();

        Example ex = new Example();

        System.out.println();
        Inheritance tr = new Example(11,99);
        tr.test();
        
    }
    
    
    
    
    // today we learn encapsulation and inheritance
    
}
