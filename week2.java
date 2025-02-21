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
        System.out.printf("age %d", age);


    }

    public static void practice3() {

        // ask user for the password 
        // if the password is correct print welcome else keep asking for password
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password = scanner.next();

        while (true) {
            System.out.println("What is your password? ");
            String verify = scanner.next();

            if (!password.equals(verify)) {
                continue;
            } else {
                System.out.println("welcome");
                break;
            }
        }

        scanner.close();
    }


    public static void main(String[] args) {
        // widening();
        // narrowing();
        // wrapperClass();
        // arithmeticOperator();
        // practice1();
        // practice2();

        // if ternary operator
        // if someone is 18 then you are eligible
       int age = 19;
       String message = age > 18 ? "you are eligible" : "you are not eligible";
       System.out.println(message);



       // switch
       int grade = 5;
       switch (grade) {
        case 1:
            System.out.println("grade 1");
            break;
        case 2:
            System.out.println("grade 2");
            break;
        case 3:
            System.out.println("grade 3");
            break;
        case 4:
            System.out.println("grade 4");
            break;
        case 5:
            System.out.println("grade 5");
            break;  
        default:
            System.out.println("default grade");
            break;
       }

       // loop
       int l = 6;
       while (l > 0) {
        System.out.println(l);
        l--;
       }

       // do while = do something while the condition is true
       do{
        System.out.println(l);
        l--;
       } while (l>0);

       // for loop
       for (int i = 0; i< 4; i++) {
            for (int j = 4; j >i;j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i;j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i;j++) {
                System.out.print("*");
            }
            System.out.println();
       }

       practice3();
       // print even number from 1 to 10
    //    for (int i = 1; i<=10; i++) {
    //     System.out.println(2*i);
    //    }
    //    for (int i = 1; i<=10; i+=2) {
    //     System.out.println(i);
    //    } // another way to print even

    

        
    }
    
}
