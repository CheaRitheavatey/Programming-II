import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class week3 {
    public static int practice4(String str) {
        // create method that find number of vowel in a string pass in a parameter
        str = str.toLowerCase();
        char[] vowel = {'a','e','i','o','u'};
        int count = 0;

        
        for (int i = 0; i < str.length(); i++) {
            for (char c: vowel) {
                if (str.charAt(i) == c) {
                    count +=1;
                }

            }
            
        }
        
        return count;
    }
    public static void practice3(String name) {
        System.out.println("Hi " + name);
    }
    public static void practice2(int num) {
        // shape like this \
        for (int i = 0; i< num; i++) {
            for (int j = 0; j< i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        // shape like this /
        for (int i = 0; i< num; i++) {
            for (int j = num; j> i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j< i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // shape upside down
        for (int i = 0; i< num; i++) {
            // for (int j = 0; j< i; j++) {
            //     System.out.print(" ");
            // }
            for (int j = num; j> i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void practice1() {
        Scanner scanner = new Scanner(System.in);
        
        // ask user for input
        System.out.print("Enter a whole number: ");
        int input = scanner.nextInt();

        while (input != 0) {
        if (input % 2 == 0)
            System.out.println("The number " + input + " is Even");
        
        else 
            System.out.println("The number " + input + " is Odd");
            break;
        } 

        scanner.close();
    }
    public static void main(String[] args) {
        System.out.println(practice4("aaaa AAA bbb iii"));
        // practice3("joe");
        // practice2(6);
        // practice1();
        // int[] num = {1,2,3,4,5};

        // for each
        // for (int i: num) {
        //     System.out.println(i);
        // }

        // // break statement and continue statement
        // for (int i =0; i<10; i++) {
        //     System.out.println(i);
        //     if (i == 4)
        //         continue;
        //     else
        //         System.out.println(i);
        //     System.out.println("yes");
        // }
    }
}