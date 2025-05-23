// Name: Chea Rithea Vatey
// Neptun: E7AJB5
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FinalExam {
    // exercise 1
    public static void generateRandom() {
        try {
            Random rand = new Random();
            float average = 0;
            int sum = 0;

            // store 5 random number
            int[] store = new int[5]; 

            for (int i = 0; i< store.length; i++) {
                // randomly generate 5 numbers
                store[i] = rand.nextInt(42,121);
                sum += store[i];
            
            }

            // print the list of generated numbers
            System.out.println("List of 5 random numbers: " + Arrays.toString(store));

            // print their average as a float
            average = sum / 5F;
            System.out.println("Average: " + average);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // exercise 2
    public static void askForN(Path path) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))){
            // ask user to enter a whole number n
            System.out.print("Enter a whole number: ");
            int n = scanner.nextInt();
            while (count < n) {
                System.out.print("Enter word: ");
                String word = scanner.next();

                // add word to list
                list.add(word); 
                count++;
            }

            // print list of entered word
            System.out.println("The word you entered: " + list.toString());
            scanner.close();

            // add words in a txt file one word per line
            if (!Files.exists(path)) {
                Files.write(path, list,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } else {
                Files.write(path, list,StandardOpenOption.APPEND);
            }

            // read file to terminal
            String line;
            System.out.println("Read what is on the file: ");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }   

        } catch (InputMismatchException e) {
            System.out.println("Enter whole number only");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
                
    }

    public static void main(String[] args) {
        generateRandom();
        askForN(Paths.get("week8File.txt"));
    }
}
