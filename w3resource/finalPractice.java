package w3resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class finalPractice {
    public static void readConsole() {
        // read from console and then write it in the new file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type here: ");
        String type = scanner.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("weekFile.txt", true)); // true = yes append 
            writer.write(type);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    // read from file
    public static void readfile(Path path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // another way to write try ()

        // try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
        //     String line;
        //     while ((line = reader.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }

    public static void copyfile() {
        File source = new File("week8File.txt");
        File copyto = new File("weekFile.txt");

        try (FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(copyto)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0 , len);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
      
    }

    public static void countword(String filename) {
        // count how many word in the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println("length: " + line.split(" ").length);
                i += line.split(" ").length;
            }

            System.out.println("total word count: " + i);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        
    }

    public static void searchword(String filename, String originalword) {
        try {
            // first read file then append by writing
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(originalword)) {
                    System.out.println("Found: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void replaceword(String filename, String oldword, String newword) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = reader.readLine()) != null) {
        
                    builder.append(line.replace(oldword, newword)).append("\n");
                
            } 

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
                writer.write(builder.toString());
            
           writer.close();  
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void wordcounttool(String filename, String word) {
        // count the number of the occurrences of a specific word in a text file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    count += 1;
                }
            }
            System.out.println("Total of the word: '" + word + "' appeared is: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

     public static void analyzeLogFile(String filename, String outputFilename) {
        Map<String, Integer> errorCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    String errorType = line.split(" ")[1]; // Assuming error type is the second word
                    errorCounts.put(errorType, errorCounts.getOrDefault(errorType, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the log file: " + e.getMessage());
            return;
        }

        // Write the results to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
            writer.write("Error Type Count\n");
            for (Map.Entry<String, Integer> entry : errorCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            System.out.println("Analysis written to " + outputFilename);
        } catch (IOException e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }
    }

    // 5 exercise from poe
    public static void exercise2(String filename) {
        // read a text file containing list of names
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
        
            while ((line = reader.readLine()) != null) {
                str.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    // take arraylist return hashmap
    public static HashMap<String, Integer> exercise6(ArrayList<String> array) {
        HashMap<String, Integer> map = new HashMap<>();
        // string is the element, integer is the time it appear

        for (String i: array) {
            map.put(i, map.getOrDefault(i,0)+ 1 );
        }

        return map;
    }

    public static void readInt() {
        while (true) {
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter Interger: ");
            try {

            int x= scanner.nextInt();

            System.out.println("You enter: " + x);
            break;
        } catch (InputMismatchException e) {
            System.out.println("Please enter integer");
            continue;
        }
            
        }
        
    }

    public static void createXML(){
        try {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.newDocument();

        Element root = d.createElement("books"); 
        d.appendChild(root);

        Element book = d.createElement("book");
        root.appendChild(book);

        Element title = d.createElement("title");
        title.setTextContent("The Great Gatsby");
        book.appendChild(title);

        Element author = d.createElement("author");
        author.setTextContent("Author 1");
        book.appendChild(author);

        Element book1 = d.createElement("book");
        root.appendChild(book1);

        Element title1 = d.createElement("title");
        title1.setTextContent("The Great Gatsby II");
        book1.appendChild(title1);

        Element author1 = d.createElement("author");
        author1.setTextContent("Author 2");
        book1.appendChild(author1);

        // show on terminal
        TransformerFactory tff = TransformerFactory.newInstance();
        Transformer tf = tff.newTransformer();

        DOMSource source = new DOMSource(d);
        StreamResult target = new StreamResult(System.out);

        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        tf.transform(source, target);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        


        
    }
    public static void main(String[] args) {
        // readConsole();
        // readfile(Paths.get("weekFile.txt"));
        // countword("weekFile.txt");

        // searchword("weekFile.txt", "this");
        // replaceword("weekFile.txt", "--", "write");

        // wordcounttool("weekFile.txt", "write");

        Car car = new Car("Toyota", "M200", 2020);
        // car.displayInfo();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("apple");
        arr.add("banana");
        arr.add("banana");
        arr.add("banana");
        arr.add("cucumber");
        arr.add("cucumber");
        arr.add("cucumber");
        arr.add("cucumber");

        // exercise6(arr);
        // readInt();

        createXML();
    }
}


// create a simple class Car with the following attributes: make, model, and year. Include a constructor and a method to display the car's details.
class Car {
    // data field
    private String make;
    private String model;
    private int year;
    
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }

    // method to display detail
    public void displayInfo() {
        System.out.println("Car make: " + this.make + " Model: " + this.model + " Year: " + this.year);
    }
}


// class eum called day and method isweekend
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend(Day day) {
        return (day.equals(SUNDAY) || day.equals(SATURDAY));
    }

    // print message for each day
    public void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
        }
    }
}

// generic class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return this.item;
    }
}