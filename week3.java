import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedSet;

public class week3 {
    public static void hashset() {
        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(1);
        hashset.add(1); // cannot add the same so it will show only 1 one time
        hashset.add(3);
        hashset.add(4);

        System.out.println(hashset.contains(4));
        hashset.remove(4);
        System.out.println(hashset.size());

        for (int i: hashset) {
            System.out.println(i);
        }
    }
    public static void linklist_hash() {
        LinkedList<String> link = new LinkedList<>();
        link.add("apple");
        link.add("banana");
        link.add("carrot");
        link.add("dog");

        link.removeLast();
        link.addFirst("first");

        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("I", 1);
        hash.put("II", 2);
        hash.put("III", 3);
        hash.put("IV", 4);

        System.out.println(hash.keySet());
        System.out.println(hash.values());

        hash.remove("II");
        System.out.println(hash.size());

        System.out.println(hash.containsKey("II"));
        System.out.println(hash.containsValue(4));

        for (String i: hash.keySet()) {
            System.out.println("Key: "+ i + ", Value: "+ hash.get(i));
        }

        // able to use collection with link list and hash set
        
    }
    public static void practice6() {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (array.size() < 6) {
            System.out.print("Enter 6 numbers: ");
            array.add(scanner.nextInt());
        }

        for (int i: array) {
            System.out.print(i+ " ");
        }

        scanner.close();
        
    }
    public static void arraylist() {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);

        array.add(0, 5); // add number at a specific index
        System.out.println(array.size());
        System.out.println(array.get(0));
        array.remove(1);
        array.set(0, 10);

        System.out.println(array);
    }
    public static void practice5(int a, int b, int c) {
        // create a method which accept 3 int and print the odd number

        int[] num = {a,b,c};
        for (int i: num) {
            System.out.println((i % 2 != 0) ? i: null);
        }
        

    }
    public static int practice4(String str) {
        // create method that find number of vowel in a string pass in a parameter
        str = str.toLowerCase();
        char[] vowel = {'a','e','i','o','u'};
        int count = 0;

        
        for (int i = 0; i < str.length(); i++) {
            for (char c: vowel) {
                if (str.charAt(i) == c) {
                    count +=1;
                }

            }
            
        }
        
        return count;
    }
    public static void practice3(String name) {
        System.out.println("Hi " + name);
    }
    public static void practice2(int num) {
        // shape like this \
        for (int i = 0; i< num; i++) {
            for (int j = 0; j< i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        // shape like this /
        for (int i = 0; i< num; i++) {
            for (int j = num; j> i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j< i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // shape upside down
        for (int i = 0; i< num; i++) {
            // for (int j = 0; j< i; j++) {
            //     System.out.print(" ");
            // }
            for (int j = num; j> i; j--) {
                System.out.print("*");
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
        
        // hashset();
        // linklist_hash();
        // practice6();
        // arraylist();
        // practice5(3, 5, 6);
        // System.out.println(practice4("aaaa AAA bbb iii"));
        // practice3("joe");
        // practice2(6);
        // practice1();
        // int[] num = {1,2,3,4,5};

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