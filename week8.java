import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// create a InvalidAgeException class to handle the exception
class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String i) {
        super(i);
    }
}
public class week8 {
    public static void example1() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();

            System.out.println("You entered: " + input);
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Stack Trace: " + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Stack Trace: " + e.getStackTrace());
        } finally {
            System.out.println("final block");
        }

        
    }

    public static void example2() {
        Scanner scanner = new Scanner(System.in);
        String i = "";
        try {
            System.out.print("Enter a number: ");
            i = scanner.next();
            
            // calculate the input number
            System.out.println(Integer.parseInt(i));
        } catch (NumberFormatException e){
            try {
                System.out.println(Float.parseFloat(i));
            } catch (NumberFormatException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        finally {
            scanner.close();
            System.out.println("finally");
            }
    }

    public static void example3() throws FileNotFoundException , IOException {
        // file reader
        // create a new file
        FileReader fr = new FileReader("week8File.txt");
        BufferedReader bf = new BufferedReader(fr);

        try {
            System.out.println(bf.readLine());
        } finally {
            fr.close();
            bf.close();
        }
        
    }

    public static void example4() throws Exception{
        //autocloseable
        try 
            (FileReader fr = new FileReader("week8File.txt");
            BufferedReader bf = new BufferedReader(fr)) {
                // try to read the whole file
                String line = bf.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = bf.readLine();
                    
                }
            }
    }


    public static void example5() throws Exception{
        // write into a file
        try (FileWriter writer = new FileWriter("week8File.txt");
            PrintWriter pr = new PrintWriter(writer)) {
                ArrayList<Integer> li = new ArrayList<>();
                li.add(1);
                li.add(2);
                li.add(3);

                for (int i =0; i< li.size(); i++) {
                    pr.println("Value " + i + " : " + li.get(i));
                }

                writer.append("writer append\n");
                pr.append("printwriter append");
            }
    }

    // check if the num is positive or not
    public static void example6(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("number must be positive");
        } else {
            System.out.println(num + " is positive ");
            
        }
    }

    public static void withdraw(int balance, int withdrawAmount) {
        if (balance < withdrawAmount) {
            throw new IllegalArgumentException("Withdraw cannot be less than main balance");
        }
        balance -= withdrawAmount;
        System.out.println("Succesfully withdraw");
        System.out.println("Current balance: " + balance);
    }

    public static void getArrayItem(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println(arr[a]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        scanner.close(); 
    }

    public static void dvidie(int a, int b) {
        if (b == 0) {
            ArithmeticException myexception = new ArithmeticException("top layer exception");
            myexception.initCause(new IOException("Second layer"));

            throw myexception;
        }

        System.out.println(a/b);
    }

    public static void checkAge(int age){
        if (age < 13) {
            // IOException i = new IOException("Top layer");
            // creating our own exception
            throw new InvalidAgeException("Must be older than 18");
        } else {
            System.out.println("You ar Eligible");
        }
    }
    public static void main(String[] args) throws Exception {
        // example1();
        // example2();
        // example3();
        // example4();
        // example5();
        // example6(-9);
        // try {
        //     withdraw(1000, 10);
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
        // try {
        //     int[] arr = {15,3,2,0};
        //     getArrayItem(arr);

        //     String a = null;
        //     System.out.println(a.length());
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // } catch (NullPointerException e) {
        //     System.out.println(e.getMessage());
        // }


        // try {
        //     int c = 1000/0;
        //     System.out.println(c);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        try {
            dvidie(100, 0);
        } catch (ArithmeticException a) {
            System.out.println("Caught: " + a);
            System.out.println("Cause: " + a.getCause());
        }
        try {
            checkAge(13);        } 
        catch (InvalidAgeException a) {
            System.out.println("Caught: " + a.getMessage());
            System.out.println("Cause: " + a.getCause());
        }
    }
    
}