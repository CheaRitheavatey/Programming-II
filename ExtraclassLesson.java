import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ExtraclassLesson {
    public static void main(String[] args) {
        // star patter
        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
        // printPattern(5);


        // count the word in file
        // System.out.println(countWord(Paths.get("weekFile.txt"), "he"));
        
        // count word and its occurrance
        // countEachWord(Paths.get("weekFile.txt"));

        // reverse string
        // System.out.println(reverseString("Xylophone"));

        // class what to notice:
        // ArrayList<Device> 
        // private DeviceType device;
        
        Device d1 = new Device(DeviceType.COMPUTER, "MSI", "Thin", 2022);
        Device d2 = new Device(DeviceType.PHONE, "OPPO", "F7", 2020);
        System.out.println(Device.getDevice());

    }
    public static void printPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }System.out.println();
        }
        
    }

    public static int countWord(Path path, String word) {
    int count = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String w: words) {
                if (w.toLowerCase().equals(word.toLowerCase())) {
                    count++;
                }
            }
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    
    return count;
    }

    public static void countEachWord(Path path) {
        HashMap<String, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] word = line.split(" ");
                for (String w: word) {
                    if (w.isEmpty()) continue;   
                    map.put(w, map.getOrDefault(w.toLowerCase(), 0)+ 1);
                     
                }
            }
            System.out.println(map);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String reverseString(String s) { 
        return new StringBuilder(s).reverse().toString();
    }
}

class Device {
    // data field
    private String brandName;
    private String modelName;
    private int productionYear;
    private DeviceType device;
    private static ArrayList<Device> allDevices = new ArrayList<>();

    // CONSTRUCTOR
    Device(DeviceType device, String brandName, String modelName, int productionYear) {
        this.device = device;
        this.brandName = brandName;
        this.modelName = modelName;
        this.productionYear = productionYear;
        allDevices.add(this);
    }

    // getter
    public DeviceType getDeviceType() {return this.device;}
    public String getBrandName() {return this.brandName;}
    public String getModelName() {return this.modelName;}
    public int getProductionYear() {return this.productionYear;}

    // method getDevice
    public static ArrayList<Device> getDevice() {
        return allDevices;
    }
    
    @Override
    public String toString() {
        return getDeviceType() + "-" + getBrandName() + "-" + getModelName() + "-" + getProductionYear();
    }

}

enum DeviceType {
    COMPUTER,
    PHONE;
}


// creating the enum class planet with orbitalperiod, roationperiod, radius
enum Planet {
    MERCURY(0.24, 1407.6, 23, 9.7),
    VENUS(0,0,0,0);

    private final double orbitalPeriod;
    private final double roationperiod;
    private final double radius;
    private final double gravity;

    Planet(double orbitalPeriod, double roationperiod, double radius, double gravity) {
        this.orbitalPeriod = orbitalPeriod;
        this.roationperiod = roationperiod;
        this.radius = radius;
        this.gravity = gravity;
    }

        public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getRotationalPeriod() {
        return this.roationperiod;
    }

    public double getRadius() {
        return radius;
    }

    public double getGravity() {
        return gravity;
    }
}