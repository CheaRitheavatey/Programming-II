import java.util.Arrays;
import java.util.Date;
import java.awt.Point;

public class week1 {

    /**
     * @param args
     */
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
        char ca = 111;
        boolean bool = true; // 1 bit

        // some method or function for string
        String greething = "Hello EveryONE";
        System.out.println("length: "+ greething.length());

        System.out.println("char e: "+ greething.charAt(e));

        System.out.println("touppercase: "+ greething.toUpperCase());
        
        System.out.println("tolowercase: "+ greething.toLowerCase());

        System.out.println("indexOf: "+ greething.indexOf('y'));
        
        System.out.println("indexOf: "+ greething.indexOf("one")); // return -1 if no occurrance
        
        System.out.println("indexOf: "+ greething.indexOf('o',6));
        
        System.out.println("contains: "+ greething.contains("o")); // return true or false if it contain
        
        System.out.println("equals: "+ greething.equals("hello all")); // return true or false if both string are the same
        
        System.out.println("equals: "+ greething.equalsIgnoreCase("hello all")); // return true or false if both string are the same and it ignore the upper or lowercase
                
        System.out.println("replace: "+ greething.replace("e","-_-")); // to keep the whatever that we want to replace we have to initalize and assign it to new variable
        
        System.out.println("trim: "+ greething.trim()); // trim all the whitespace

        // reference type example
        Point point1 = new Point(20,50);
        Point point2 = point1;
        point1.y = 30;
        System.out.println("reference type was used to copy: "+ point2);

        // array
        String[] array = {"apple", "banana", "cat"};

        array[2] = "coconut"; 
        System.out.println(Arrays.toString(array));
        System.out.println("length of the array: "+array.length);

        Arrays.sort(array); // sort array;

        // multi-dimension
        int[][] multiArray = {
            {1,2,3}, // [0][0] [0][1] [0][2]
            {4,5,6}, // [1][0] [1][1] [1][2]
            {7,8,9}  // [2][0] [2][1] [2][2]

        };


        // to print multi-dimension array
        for (int i = 0; i<3; i++) {
            for (int k = 0; k< 3; k++) {
                System.out.print(multiArray[i][k]);
            }
            System.out.println();
        }
    }
}