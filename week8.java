import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Methodology.week4Package.file1;

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
    public static void main(String[] args) throws Exception {
        // example1();
        // example2();
        // example3();
        // example4();
        example5();
    }
    
}
