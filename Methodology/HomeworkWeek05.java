package Methodology;
import java.util.Random;
import java.util.Scanner;

public class HomeworkWeek05 {
    public static void rollDice() {
        // first random guess using Random
        Random random = new Random();
        int rand = random.nextInt(1,7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("You can exit the game by entering: exit\r\n" + "Game Started: ");

        while (true) {
            try {
                // take in user input
                System.out.print("Guess the number showing on the dice: ");
                String guess = scanner.next();


                // exit if user type exit
                if (guess.toLowerCase().equals("exit")) {
                    System.out.println("You gave up! dice was showing " + rand + " !");
                    break;
                } 

                // dice should be range between 1-6
                if (Integer.parseInt(guess) < 7 && Integer.parseInt(guess) > 0) {

                    if (Integer.parseInt(guess) == rand) {
                        System.out.println("You guessed correct!");
    
    
                        System.out.print("Do you want to continue? (y/n): ");
                        String again = scanner.next();
    
                        if (again.toLowerCase().equals("n") || again.toLowerCase().equals("exit")) {
                            System.out.println("You are exiting the game, Good Bye!");
                            break;
                        }
    
                        rand = random.nextInt(1,7);
                        continue;
                        
                    }
                
                } else {
                    System.out.println("Number between 1-6 only");
                    continue;
                }

            }
            catch (NumberFormatException e) {
                System.out.println("Enter integer or 'exit' only");
                continue;
            }




        }
        scanner.close();
        
    }
    public static void main(String[] args) {
        rollDice();
        /*
           create a method to roll the dice 
           and ask the user to guess the number on the dice
           Continue asking until getting the rights guess
           Give user the option to exit and see the result
           
           e.g.:
           
           You can exit the game by entering: exit
           Game Started:
           Guess the number showing on the dice: 4
           Guess the number showing on the dice: 5
           You gave up! dice was showing 2!
           */
        
    }
    
}
