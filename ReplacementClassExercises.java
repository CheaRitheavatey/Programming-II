import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReplacementClassExercises {

    
    public static void main(String[] args) {
        // star pattern
        printPattern(5);
        
        // count the word in file
        Path p = Paths.get("C:\\Users\\Nara\\Desktop\\laptop-health-check.txt");
        System.out.printf("Words count: %s",countWord(p, "on")); 
        
        System.out.println();
        
        // words and its occurrences
        // countEachWord(p);
        
        // reverse String
        System.out.println(reverseString("Xylophone"));
        
        
        Device d1 = new Device(DeviceType.COMPUTER, "MSI", "Thin", 2022);
        Device d2 = new Device(DeviceType.PHONE, "OPPO", "F7", 2020);
        System.out.println(Device.getDevices());
        
        System.out.println(Planet.MERCURY);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSum(scanner));
    }
    
    static void printPattern(int num) {
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    static void countEachWord(Path p) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(p);
            for(String line: lines) {
                /*
                String[] words = line.toLowerCase()
                                    .replace(",", "").replace("!", "")
                                    .replace("?", "").replace("?", "")
                                    .trim().split(" ");
                */
                
                // using regular expression
                String[] words = line.toLowerCase()
                                    .replace("[^a-zA-z0-9']+", "")
                                    .trim().split(" ");
                for(String word: words) {
                    if(word.length() != 0) {
                        wordCounts.put(word, wordCounts.containsKey(word) ? (wordCounts.get(word)+1) : 1);
                    }
                }
            }
            System.out.println(wordCounts);
            
            
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    static int countWord(Path p, String word) {
        int count = 0;
        try {
            List<String> lineList = Files.readAllLines(p);
            List<String> wordList = new ArrayList<>();
            
            // list of lines to list of words
            for(String l: lineList) {
                for(String w: l.split(" ")) {
                    wordList.add(w);
                }
            }
            
            // check words and count
            for(String w: wordList) {
                if(w.toLowerCase().equals(word)) {
                    count++;
                }
            }
            
            // System.out.println(wordList);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
    
    static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reverse += s.charAt(i);
        }
        
        return reverse;
    }
    
    static int getSum(Scanner scanner) {
        
        try{
            System.out.print("How many numbers do you want to enter: ");
            int count = scanner.nextInt();

            int sum = 0;
            for (int i = 1; i < count; i++) {
                System.out.print("Number " + i + ": ");
                sum += scanner.nextInt();
            }

            return sum;
        } catch (InputMismatchException imm) {
            System.out.println("Just type integer. " + imm.getMessage());
        }
        return 0;
    }
}

class Device {
    private DeviceType type;
    private String brandName;
    private String modelName;
    private int productionYear;
    
    private static List<Device> devices = new ArrayList<>();
    
    public Device(DeviceType type, String brandName, String modelName, int productionYear) {
        this.type = type;
        this.brandName = brandName;
        this.modelName = modelName;
        this.productionYear = productionYear;
        devices.add(this);
    }
    
    public static List<Device> getDevices() {
       return devices;
    }
    
    @Override
    public String toString() {
        return type + "-" + brandName + "-" + modelName + "-" + productionYear;
    }
}

enum DeviceType {
    PHONE,
    COMPUTER;
}

// creating the enum class Plant with the following attributes
enum Planet {
    MERCURY(0.24, 1407.6, 2439.7, 3.7),
    VENUS(0.61, 23.93, 6371.1, 8.87);
    
    private final double orbitalPeriod;
    private final double rotationalPeriod;
    private final double radius;
    private final double gravity;
    
    Planet(double orbitalPeriod, double rotationalPeriod, double radius, double gravity) {
        this.orbitalPeriod = orbitalPeriod;
        this.rotationalPeriod = rotationalPeriod;
        this.radius = radius;
        this.gravity = gravity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRotationalPeriod() {
        return rotationalPeriod;
    }

    public double getRadius() {
        return radius;
    }

    public double getGravity() {
        return gravity;
    }

}