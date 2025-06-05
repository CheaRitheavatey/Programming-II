package Methodology.week13Package;

import java.util.ArrayList;

import Methodology.week6Package.Car;

public class week13 {
    public static void main(String[] args) {

        ArrayList name = new ArrayList<>();
        name.add("Harry");

        // the value we get from below is an object and we want to assign that object to a string which is y its not working
        // String harryname = name.get(0);
        String harryname = (String) name.get(0); //  now that we typecast it to string and assign to string then its okay


        ArrayList<String> arr = new ArrayList<>();
        arr.add("John");

        // this is okay because we already define the string in the <String> in the Arraylist and this is the generic type
        String johnname = arr.get(0);

        Cart<Integer> c1 = new Cart<>();
        c1.sett(12);
        System.out.println(c1.gett());

        Pair<Integer,String> p = new Pair<Integer,String>();
        p.setKey(1);
        p.setvalue(johnname);

        Pair<Integer, Cart> paircart = new Pair<Integer,Cart>(1, new Cart<Integer>());

        previewClass(2.3);

        previewClass("able", 1222);

        addOne(12.22);

        Integer[] li = {1,2,4,5};
        Character[] ch = {'a', 'b', 'c'};
        printArray(li);

        System.out.println("Compare " + compare(li, 1));
        System.out.println("Compare " + compare(ch, '2'));

        averager(li);
        
    }
    static public <U> void previewClass(U user) {
        System.out.println("U: "+ user.getClass().getName());
    }
    static public <U,S> void previewClass(U user, S user2) {
        System.out.println("U: "+ user.getClass().getName());
        System.out.println("S: "+ user2.getClass().getName());
    }

    // extens anything even if its an interface (not implement but extends for this one)
    static public <U extends Number> void addOne(U number) {
        System.out.println("U: " + number.getClass().getName());
        System.out.println("addOne: " + (number.doubleValue() + 1));
        
    }

    // print the number of items in an array that are greater than a parameter
    static public <T extends Comparable> int compare(T[] arrayList, T para) {
        int count = 0;
        for (T e: arrayList) {
            // >, < only compatible with primitive types so we need to implement comparable interface to compare the 2 and 
            // it return negative, 0 or poistive value depend on whether e was greater than para or not
            if (e.compareTo(para) > 0) {
                count++;
            }
        }
        return count;

                
    }

    // create a method that can process any kind of array and print the element
    static public <T> void printArray(T[] arr) {
        for (T t: arr) {
            System.out.println(t);
        }
    }

    // pass any kind of array and return the average
    public static <T extends Number> void averager(T[] arr) {
        double tempt = 0;
        for (T t: arr) {
            tempt += t.doubleValue();  
                 
        }

        System.out.println(tempt/arr.length);
    }
    
}
