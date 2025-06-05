package w3resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*

exercise 3

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Positive_Number_Check {
    public static void main(String[] args) {
        try {
            checkNumbersFromFile("test.txt");
            System.out.println("All numbers are non-positive.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkNumbersFromFile(String fileName) throws FileNotFoundException, PositiveNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0) {
                throw new PositiveNumberException("Positive number found: " + number);
            }
        }
        scanner.close();
    }
}
class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}
 

*/
class NoVowelException extends Exception {
    NoVowelException(String message) {
        super(message);
    }
}

public class Exceptionhandling {
    public static void exercise5() throws NoVowelException{
        // take string as input and throws exception if string doesnt contain vowel
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        String vowel = "aeiouAEIOU";
        boolean bool = false;
        for (int i = 0; i< input.length(); i++) {
            if (vowel.contains(String.valueOf(input.charAt(i)))) {
                bool = true;
                break;
            }
        }

        if (!bool) {
            throw new NoVowelException("no vowel found!");
        }

        System.out.println("yes there is a vowel");


    }
    public static void exercise4() {
        // read list of integer from user and trhow exception if number are duplicate
        Set<Integer> s = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number you want to input? ");
        int total = scanner.nextInt();
        int counter = 0;
        while (counter < total) {
            System.out.print("Enter number: ");
            int input = scanner.nextInt();

            if (s.contains(input)) {
                throw new IllegalArgumentException("cannot duplicate");
            }

            s.add(input);
            counter++;
        }
        
        System.out.println(s.toString());
    }
    public static void exercise3(Path path) throws IOException {
        //read a list of number from a file and throws exception if any of the number are positive
        if (!Files.exists(path))
            throw new FileNotFoundException("File not found");
        
        // read list and store it in list
        List<String> r = Files.readAllLines(path);

        for (String i: r) {
            if (Integer.parseInt(i) > 0)
                throw new IllegalArgumentException(i+" is positive");
            
            System.out.println(i);
        }
    }
    public static void exercise2(Path path) throws FileNotFoundException{
        // read file and throws exception if file is not found
        if (!Files.exists(path))
            throw new FileNotFoundException("File not found");

        System.out.println("File found!");
    }
    public static void exercise1(int evenNum) {
        // take int as a perameter and throws exception if number is odd
        if (evenNum % 2 == 1) 
            throw new IllegalArgumentException(evenNum +"is odd");
    }
    public static void main(String[] args) {
        // try {
        //     int x = 20;
        //     exercise1(x);
        //     System.out.println(x + " is even");
        
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
    

        // try {
        //     exercise2(Paths.get("week0File.txt"));
        // } catch (FileNotFoundException e) {
        //     System.out.println(e.getMessage());
        // }

        // try {
        //     exercise3(Paths.get("week8File.txt"));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }


        // try {
        //     exercise4();
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
        try {
            exercise5();
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }
}
