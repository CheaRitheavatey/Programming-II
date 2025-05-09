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
        
    }
    static public <U> void previewClass(U user) {
        System.out.println("U: "+ user.getClass().getName());
    }
    static public <U,S> void previewClass(U user, S user2) {
        System.out.println("U: "+ user.getClass().getName());
        System.out.println("S: "+ user2.getClass().getName());
    }
    
}
