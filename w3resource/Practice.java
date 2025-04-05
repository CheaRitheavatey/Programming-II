package w3resource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {
    
    public static void transpose2DArray(int[][] array) {
        int[][] newarr = new int[array[0].length][array.length];
        // given
        // 10 20 30
        // 40 50 60 

        // change to
        // 10 40
        // 20 50
        // 30 60

        for (int i = 0; i< array.length; i++) {
            for (int j = 0 ; j < array[0].length ; j++) {
                newarr[j][i] = array[i][j];
            
                
            }
            System.out.println();
        }

        for (int i = 0; i<newarr.length; i++) {
            for (int j = 0; j <newarr[0].length;j++) {
                System.out.print(newarr[i][j]+ " ");
            }

            System.out.println();
        }

       
        

       
    }
    // count words and vowels that is input and how many vowel in total
    public static void countWordsAndVowel() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas enter a string: ");
        String input = scanner.nextLine();

        System.out.println(input);
        // store the input in array
        String[] word = input.split(" ");
        System.out.println(Arrays.toString(word));

        int vowelCount = 0;

        // count the vowel
        Set<Character>vowel = new HashSet<>();
        for (char c: "aeiouAEIOU".toCharArray()) {
            vowel.add(c);
        }
        // char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for (String w : word) {
            for (char c: w.toCharArray()) {
                if (vowel.contains(c)) {
                    vowelCount++;
                }
            }
        }
        System.out.println(word.length);
        System.out.println(vowelCount);


    }
    public static void main(String[] args) {
        // countWordsAndVowel();
        int[][] arr = {
            {1,2,3},
            {4,5,6}};
        transpose2DArray(arr);
        
    }
}
