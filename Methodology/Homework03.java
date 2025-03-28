package Methodology;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type anything to continue or type exit to quit: ");
            String x = scanner.next();

            if (x.toLowerCase().equals("exit")) {
                break;
            }
            
            // Consume the newline character left by next()
            // scanner.nextLine(); 
            
            try {
                System.out.print("Name: ");
                String name = scanner.next();

                if (name.length() < 2) {
                    throw new IOException("Name is too short.");
                }

                System.out.print("Year: ");
                String year = scanner.next();

                try {

                    if (Integer.parseInt(year) < 1900 || Integer.parseInt(year) > 2025) {
                        throw new IOException("Birth year is invalid.");
                    }
                    continue;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
                
                continue;
                
            if (name.length() > 2 && (Integer.parseInt(year) > 1900 || Integer.parseInt(year) < 2025) ) {
                System.out.println("Information entered successfully.");
                break;
            }
                
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException d) {
                System.out.println(d.getMessage());
            } 
        }

        scanner.close();

    }
}