import java.util.Scanner;

public class week3 {
    public static void practice2(int num) {
        for (int i = 0; i< num; i++) {
            for (int j = 0; j< i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void practice1() {
        Scanner scanner = new Scanner(System.in);
        
        // ask user for input
        System.out.print("Enter a whole number: ");
        int input = scanner.nextInt();

        while (input != 0) {
        if (input % 2 == 0)
            System.out.println("The number " + input + " is Even");
        
        else 
            System.out.println("The number " + input + " is Odd");
            break;
        } 

        scanner.close();
    }
    public static void main(String[] args) {
        practice2(6);
        // practice1();
        int[] num = {1,2,3,4,5};

        // for each
        // for (int i: num) {
        //     System.out.println(i);
        // }

        // // break statement and continue statement
        // for (int i =0; i<10; i++) {
        //     System.out.println(i);
        //     if (i == 4)
        //         continue;
        //     else
        //         System.out.println(i);
        //     System.out.println("yes");
        // }
    }
}