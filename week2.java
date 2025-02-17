import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

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

        System.out.println(f);
        System.out.println(fl);

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
    public static void practice1() {
        // generate random whole number between 1 and less than 20 from math class
        System.out.println((int)(Math.random()*20+1));

        // Random class
        Random rand = new Random();
        System.out.println(rand.nextInt(3)+1); // +1 so it can start from 1 instead of 0 so [1,3], without passing an argument it will generate range of int
        System.out.println(rand.nextInt(1,3)); // same as above from [1,3)
    }

    public static void practice2() {
        // ask user for their name and year of births
        // print in the console "Welcome ame you are age years old"
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What's your name? ");
        String name = scanner.nextLine(); //.next will only take it whats before space. so use .nextLine() for the whole line

        System.out.print("When were you born? ");
        int year = scanner.nextInt();

        
        int currentYear = LocalDate.now().getYear();
        int age = currentYear-year;
        // we have class to get the current time and year

        scanner.close();
        System.out.println("Welcome " + name + " you are " + age + " years old.");

    }


    public static void main(String[] args) {
        // widening();
        // narrowing();
        // wrapperClass();
        // arithmeticOperator();
        // practice1();
        practice2();


       

        
    }
    
}
