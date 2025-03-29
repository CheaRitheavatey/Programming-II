package Methodology;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Task:

// Create a method to ask for the user’s name and birth year.

// The application should inform the user in the beginning of each run to:

// “type anything to continue or type exit to quit!”


// If the user enters a name which has less than 2 characters, an IOException should be thrown with message:

// "Name is too short."


// If the user enters a birth year not in range 1900 to 2025, an IOException should be thrown with message:

// "Birth year is invalid."


// All exceptions should be handled explicitly; providing the error message printed out for the user and running the method over and over until getting the correct inputs or “exit” being typed.


// Sample output 1:

// _______

// type anything to continue or type exit to quit!

// d

// Name: max

// Birth year: as

// For input string: "as"

// _______

// type anything to continue or type exit to quit!

// s

// Name: sa

// Name is too short.

// _______

// type anything to continue or type exit to quit!

// exit

// BUILD SUCCESSFUL

// Sample output 2:

// _______

// type anything to continue or type exit to quit!

// x

// Name: max

// Birth year: 1888

// Birth year is invalid.

// _______

// type anything to continue or type exit to quit!

// a

// Name: max

// Birth year: 1980

// Information entered successfully

// BUILD SUCCESSFU

public class Homework03 {
    public
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