package Methodology;

import java.util.Random;
import java.util.Scanner;

public class HW2 {
    
    public static void main(String[] args) {
        String[] moodList = {"Happy", "Excited", "Mad", "Down", "Bored"};
    
        
        Random ran = new Random();
       

        String moodNow = moodList[ ran.nextInt(0,moodList.length)];
        System.out.println(moodNow);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Game started!");
        while (true) {
            System.out.print("Guess moody's mood: ");
            String mood = scanner.next();

            if (mood.toLowerCase().equals("exit")) {
                System.out.print("You gave up! Moody was " + moodNow);
                break;
            }
        
            if (mood.toLowerCase().equals(moodNow.toLowerCase())) {
                System.out.println("Correct, Moody is " + moodNow);
                break;
            } else {
                continue;
            }
        
        }
        
    }
    
}
