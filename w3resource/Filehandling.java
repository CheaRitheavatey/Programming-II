package w3resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Filehandling {
    public static void exercise9(Path path) throws IOException{
        // read the first 3 lines of file
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {
            String line; 
            int count = 0;
            while ((line = reader.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }
        } 
    }
    public static void exercise8(Path path) {
        // read from console and add it to file
        try (FileWriter writer = new FileWriter(path.toString(),true);
            Scanner scanner = new Scanner(System.in)) {
                
                System.out.print("Enter: ");
                String input = scanner.nextLine();
                writer.write(input + System.lineSeparator());
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        
    }
    public static void example4(Path path) throws IOException {
        Random ran = new Random();
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(Integer.toString(ran.nextInt(0, 6))); // Generate a random integer and convert to String
        }

        // Write all numbers to the file
        Files.write(path, numbers);
    }
    
    // replace specific word
    public static void example3(String path, String target, String replacement) throws IOException, FileNotFoundException{

        int count = 0;
        try {
            if (!Files.exists(Paths.get(path))) {
                throw new FileNotFoundException();
            }

            List<String> li = Files.readAllLines(Paths.get(path));
            for (int i =0; i<li.size(); i++) {
                if (li.get(i).contains(target)) {
                    count += 1;
                    System.out.println(li.get(i));
                }
                // li.set(i, li.get(i).replace(target, replacement));
            }
            for (int i =0; i<li.size(); i++) {
                li.set(i, li.get(i).replace(target, replacement));
            }
            System.out.println(count);
    
            Files.write(Paths.get(path), li, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
        


    }
    public static int countCharacters(String filePath) throws IOException {
    int count = 0;
    try (FileReader reader = new FileReader(filePath)) {
        int charData;
        while ((charData = reader.read()) != -1) {
            count++;
        }
    }
    return count;
}
    public static void exercise2(Path pathOriginal, Path copyto) throws FileNotFoundException, IOException{
        // Write a method that copies the contents of one text file to another. Ensure that if the destination file already exists, it is overwritten.
        try {
            if (!Files.exists(pathOriginal) && !Files.exists(copyto)) {
                throw new FileNotFoundException();
            }

            Files.copy(pathOriginal, copyto);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void exercise1(String[] li) throws IOException, FileNotFoundException {
        // 1. Write a Java program to get a list of all file/directory names in the given directory.
        File file = new File("//home//students");
        String[] fileList= file.list();
        for (String name: fileList) {
            System.out.println(name);
        }
    
    }
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // exercise2(Paths.get("week8File.txt"), Paths.get("week9File.txt"));
        // System.out.println(countCharacters("week8File.txt" ));
        
        // example3("week8File.txt", "Value","Hello");
        exercise9(Paths.get("week8File.txt"));
    }
    
}
