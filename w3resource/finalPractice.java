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
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    public static void main(String[] args) {
        // readConsole();
        // readfile(Paths.get("weekFile.txt"));
        // countword("weekFile.txt");

        // searchword("weekFile.txt", "this");
        // replaceword("weekFile.txt", "--", "write");

        wordcounttool("weekFile.txt", "write");
    }
}
