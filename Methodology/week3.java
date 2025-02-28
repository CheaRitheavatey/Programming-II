package Methodology;

import java.util.Scanner;

public class week3 {
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        
    }
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j-i+" ");
            }
            System.out.println();
        }

        
    }
    public static void forloop() {
        // use for each by printing items inside array
        int[] array = {1,2,3,4};

        // using for each loop to print item inside array
        for (int i: array) {
            System.out.println(i);
        }

        // using normal for loop to print item inside array
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // print number 0-6 but want to skip even number
        for (int i =0; i <=6 ; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i); // this will print our odd number: 1 3 5
        }

        // break statement
        Scanner scanner = new Scanner(System.in);
        String pass = "12345";

        while (true) {
            System.out.print("Enter password: ");
            String str = scanner.nextLine();

            if (pass.equals(str)) {
                System.out.print("Welcom");
                break;
            }
            continue;
            
        }
        scanner.close();
    }
    public static void main(String[] args) {
        pattern2(5);
        pattern(5);
    
        
    }
}
