public class week1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        
        // string
        String firstname = "John";
        String lastname = "Joe";

        // concatinate string
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // int
        int x = 1234;
        System.out.println(x);

        x = x- 12;
        final int y = 12; // this cannot be change

        System.out.println(x);
        System.out.println(y);
        
        // declare multiple variable in one line
        int a,b,c; // but personally i dont like this just personally preference
        a = b = c = 10;

        // another way to assign value
        int d = 12, e = 13;

        // can change the value because it is primitive type not reference type
        d = 1;
        System.out.println(d);

        System.out.println(a+b+c+d+e);

        // when you dont know what data type you use and once you use it you cannot change it
        var j = "aaa";
        
        // some data type
        byte eight = 8; // 8 bits
        short sixteen = 16; // 16 bits
        int thritytwo = 32; // 32 bits
        long sixtyfour = 64_000L; // 64 bits
        float thirtytwofloat = 32e2F; // 32 bits
        double sixtyfourdouble = 64D; // 64 bits
        char ch = 'a'; // 16 bits
        boolean bool = true; // 1 bit

        // some method or function for string
        String greething = "Hello EveryONE";
        System.out.println("length: "+ greething.length());
        System.out.println("char e: "+ greething.charAt(e));
        System.out.println("touppercase: "+ greething.toUpperCase());
        System.out.println("tolowercase: "+ greething.toLowerCase());
        System.out.println("indexOf: "+ greething.indexOf('y'));
        System.out.println("indexOf: "+ greething.indexOf("ONE"));
        System.out.println("indexOf: "+ greething.indexOf('o',6));



        



        
    }
}