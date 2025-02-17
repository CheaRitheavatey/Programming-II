public class week2 {
    public static void widening() {
        // widening = you dont need any casting it will automatically do it for you
        int i = 8;
        double x = i; // widening it automatically casting
        System.out.println("integer i: " +i);
        System.out.println("double x: " +x);
    }
    public static void narrowing() {
        // narrow down = have to do the casting
        double x = 100.2;
        int b = (int)(x); // type casting

        System.out.println("integer b: "+b);
        System.out.println("double x: "+x);
    }
    public static void wrapperClass() {
        String str = "168";
        int string = Integer.parseInt(str);
        System.out.println(string);

        // so we want to know how many number we have to have going to convert it to string
        Integer num = 11111122;
        System.out.println(num.toString().length());

    }
    public static void arithmeticOperator() {
        // division
        int f = 8/3; // this result will be in int
        float fl = 8/3F; // the result will be in float

        // System.out.println(f);
        // System.out.println(fl);

        // post increment and pre increment
        int a = 100;
        int b = a++;

        int c = ++a; //a = 102
        int d = a++;

        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c); // a will be 102 because u increment it 2 times one time in b and one time in c
        System.out.println("d "+d ); 

        // math class
        System.out.println((int)(Math.random()*10)); // Math.random alone is going to be between 0 and 1 so we need to multiply by the range
    }


    public static void main(String[] args) {
        // widening();
        // narrowing();
        // wrapperClass();
        arithmeticOperator();
    }
    
}
