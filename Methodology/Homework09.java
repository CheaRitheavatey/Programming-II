package Methodology;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// create a method to create a file with words in different lines
// create another moethod to choose one of these words randomly
// mix the letters and provide the user with the word(with mixed letters)
// ask the user to guess the word
// it should keep running unitl getting the correct answer
// give an option for user to exit 
public class Homework09 {
    // method to create file with words in different lines
    public static void storeWord(String path, List<String> words) {

        try (FileWriter writer = new FileWriter(path)) {
            for (String word: words) {
                writer.write(word + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // method to choose one word randomly
    public static String chooseRandomWord(String path) {
        ArrayList<String> store = new ArrayList<>();
        Random rand = new Random();
    
        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNextLine()) {
                store.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    
        // check if the list is empty
        if (store.isEmpty()) {
            return null;
        }

        return store.get(rand.nextInt(store.size()));
    }

    // output from chooseRandomwrod is the input for mix letter
    public static String mixLetter(String word) {
        ArrayList<Character> charc = new ArrayList<>();
        for (char c: word.toCharArray()) {
            charc.add(c);
        }
        
        // shuffle char
        Collections.shuffle(charc);

        // put all char together into one string
        String str = "";
        for (char c: charc) {
            str += c;
        }

        return str;

    }

    public static void main(String[] args) {
        String filename = "weekFile.txt";
        List<String> words = Arrays.asList("apple", "banana", "cherry", "durian", "elephant", "fix");

        // to store the word
        storeWord(filename, words);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = chooseRandomWord(filename);
            String mixWord = mixLetter(word);

            System.out.println("Guess the word: " + mixWord);

            while (true) {
                System.out.print("Your guess or type 'exit' to quit: ");
                String user = scanner.next();
                if (user.toLowerCase().equals("exit")) {
                    System.out.println("GoodBye have a nice day :)");
                    return;
                }
                
                if (user.equals(word)) {
                    System.out.println("Correct! Well done.");
                    break;
                } else {
                    System.out.println("Incorrect, try again.");
                }
            }
        }

    }
    
}
