package w3resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    }
    public static void main(String[] args) {
        readConsole();
        // readfile(Paths.get("weekFile.txt"));
    }
}
