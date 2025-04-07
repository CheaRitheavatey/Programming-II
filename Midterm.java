/* Name: Chea Rithea Vatey
   Neptun: E7AJB5 */
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) {
        // hashMap to sotre the rock paper and scissor
        Map<Integer, String> store = new HashMap<>();
        store.put(0, "rock");
        store.put(1, "paper");
        store.put(2, "scissors");


        // computer generate random
        Random rand = new Random();
        String randomChoice = store.get(rand.nextInt(0,3));

        // ask user for input
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter rock, paper, or scissors: ");
            String user = scanner.next();

            // if user enter other than rps ask again
            if (!store.containsValue(user.toLowerCase())) {
                System.out.println("Invalid input! Please enter rock, paper, or scissosrs");
                continue;
            }

            // logic for rps
            
            // when user enter rock
            if (user.toLowerCase().equals("rock")) {
                if (randomChoice.equals(user)) {
                    System.out.println("You tie!");
                } else if (randomChoice.equals("paper")) {
                    System.out.println("You lose!");
                } else if (randomChoice.equals("scissors")) {
                    System.out.println("You win!");
                }

                break;
            }

            // when user enter paper
            if (user.toLowerCase().equals("paper")) {
                if (randomChoice.equals(user)) {
                    System.out.println("You tie!");
                } else if (randomChoice.equals("rock")) {
                    System.out.println("You win!");
                } else if (randomChoice.equals("scissors")) {
                    System.out.println("You lose!");
                }

                break;
            }

            // when user enter scissors
            if (user.toLowerCase().equals("scissors")) {
                if (randomChoice.equals(user)) {
                    System.out.println("You tie!");
                } else if (randomChoice.equals("paper")) {
                    System.out.println("You win!");
                } else if (randomChoice.equals("rock")) {
                    System.out.println("You lose!");
                }

                break;
            }
            
        }
        System.out.println("Computer Chose: " + randomChoice);
        scanner.close();    
    
    }
}
