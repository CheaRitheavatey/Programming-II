package Methodology;

import java.util.Random;
import java.util.Scanner;

public class week2 {
    // asking input from user
    public static void askInput() {
        
        while (true) {
            Scanner scanner = new Scanner(System.in);

            String password;

            // ask user for name
            System.out.print("What is your name?: ");
            String name = scanner.nextLine();

            
            while (true) {
                System.out.print("What is your password (length >= 6 length): ");
                password = scanner.nextLine();

                if (password.length() < 6) {
                    System.out.println("Please enter password more than length 6");
                    continue;
                }
                break;
            }

            // ask user to input their password length of more than 6 characters if its right then say welcome name if not ask again and again
            while (true) {
                System.out.print("Enter Password: ");
                String verify = scanner.nextLine();

                

                if (password.equals(verify)) {
                    System.out.println("Welcome " + name + " !!!!");
                    break;
                } else {
                    continue;
                }

            }
        
            // as user again
            System.out.println("Do you want to enter again? (y/n): ");
            String again = scanner.next();

            if (again.equals("y")) {
                break;
            }

            scanner.close();
        }
    }
    public static void main(String[] args) {
        askInput();
        // type conversion: widening or narrowing

        // when widening you dont have to specify anything like
        int y = 100;
        float z = y;
        System.out.println(z);
        // when narrowig you have to use type casting like double x = (int)12.3
        double x = (int) 12.3;
        System.out.println(x);

        
        int mynum = 100_000_000;
        int mynum2;

        // do the type casting for the following line
        // mynum2 =  mynum + 49.52;
        mynum2 =  mynum + (int) 149.52; // method 1
        mynum2 =  (int) (mynum + 149.52); // method 2

        // use wrapper when the type casting is not compatible, use class Integer
        String e = "123";
        int i = Integer.parseInt(e);
        System.out.println(i);


        // convert from double to string need to use Double class not double
        Double f = 2134.12;
        f.toString();

        // convert char to int, char to float and float to char
        char a = 'a';
        int b = a;
        System.out.println("b " +b);

        float c = a;
        System.out.println("c "+c);

        float d = 97.8f;
        char g = ((char)d);
        System.out.println("g " +g);


        // operator
        int o = 100;
        
        int v = o++; // 100
        int h = ++o; // 101
        

        System.out.println(v);
        System.out.println(h);


        // random
        System.out.println((int) Math.random()*10); // generate random number using Math class
        Random rand = new Random(); // generae random number using Random class
        System.out.println(rand.nextInt(1,10)); 
        // for float is rand.nextFloat(), ,nextBoolean(), etc...

    }
        
    
}
