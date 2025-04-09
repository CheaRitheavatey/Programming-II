package Methodology;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
    public static void chooseRandomWord() {
        
    }

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("apple", "banana", "carrot");
        storeWord("weekFile.txt", arr);
    }
    
}
