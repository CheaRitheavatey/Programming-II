package Methodology.week13Package;

import java.util.ArrayList;

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
    }
    
}
