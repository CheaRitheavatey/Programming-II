package w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {
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
        countWordsAndVowel();
        
    }
}
