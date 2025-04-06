package w3resource;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Fiveexercise {
    public static void main(String[] args) {
        exercise1(Paths.get("week8File.txt"));
        exercise2();
    }
    // exercise: read and count words from a file
    public static void exercise1(Path path) {
        // in order to read from the file we need to get the file path
        // then we read all of the word and store it in array
        // finally we count all the word by length of arry

        // base case check if the file exist or not
        try {
            if (!Files.exists(path)) {
                throw new FileNotFoundException("File not found");
            }
            List<String> read = Files.readAllLines(path);
            // System.out.println(read.toString());
            int count = 0;

            for (String word: read) {
                for (String each: word.split(" ")) {
                    count+= 1;
                    System.out.print(each + " ");
                }
           }     
           
           System.out.println( "count: "+count);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exercise2() {
        Student[] students = {
            new Student(1, "Alice", 90),
            new Student(2, "Bob", 87),
            new Student(3, "Charlie", 78)
        };

        // werite to file
        try (PrintWriter writer = new PrintWriter("students.txt")) {
            for (Student s : students) {
                writer.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }


        // read from file
        System.out.println("Students from file: ");
        try (BufferedReader bf = new BufferedReader(new FileReader("week8File.txt"))) {
            String line;
            while ((line= bf.readLine()) != null) {
                Student s = Student.fromString(line);
                System.out.println("ID: " + s.getId() + " Name: " + s.getName() + " Score: " + s.getScore());
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }


    public static void exercise3(String source, String destination) {
        // copy content from one to another using fileinputsream
        try {
            FileInputStream input = new FileInputStream(source);
            FileOutputStream output = new FileOutputStream(destination);

            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }


    public static void exercise4(String filename, String wordSearch) {
        // enter file name and word to search
        // read file line by line
        // check if word exist in any lise (case insentive)
        // print the line number where the word appear

        try (BufferedReader read = new BufferedReader(new FileReader(filename))) {
            String line;
            int count = 1;
            boolean found = false;
            while ((line = read.readLine()) != null) {
                if (line.toLowerCase().contains(wordSearch)) {
                    System.out.println("Found in line: " + count + " " + line);
                    found = true;   
                }
                count++;
            }

            if (!found) {
                System.out.println("word not found in file");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    

    
    }
}


// exercise 2 create a student class
class Student {
    // data field
    private int id;
    private String name;
    private double score;

    Student(int id, String name, double score) {
        this.id = id;
        this.name = name; 
        this.score = score;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static Student fromString(String data) {
        String[] parts = data.split(",");
        return new Student(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[3]));
    }
}