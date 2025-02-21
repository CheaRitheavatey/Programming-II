package Methodology;

import java.util.Random;

public class week2 {
    public static void main(String[] args) {
        // type conversion: widening or narrowing

        // when widening you dont have to specify anything like
        int y = 100;
        float z = y;
        System.out.println(z);
        // when narrowig you have to use type casting like double x = (int)12.3
        double x = (int) 12.3;
        System.out.println(x);

        
        int mynum = 100_000_000;
        int mynum2;

        // do the type casting for the following line
        // mynum2 =  mynum + 49.52;
        mynum2 =  mynum + (int) 149.52; // method 1
        mynum2 =  (int) (mynum + 149.52); // method 2

        // use wrapper when the type casting is not compatible, use class Integer
        String e = "123";
        int i = Integer.parseInt(e);
        System.out.println(i);


        // convert from double to string need to use Double class not double
        Double f = 2134.12;
        f.toString();

        // convert char to int, char to float and float to char
        char a = 'a';
        int b = a;
        System.out.println("b " +b);

        float c = a;
        System.out.println("c "+c);

        float d = 97.8f;
        char g = ((char)d);
        System.out.println("g " +g);


        // operator
        int o = 100;
        
        int v = o++; // 100
        int h = ++o; // 101
        

        System.out.println(v);
        System.out.println(h);


        // random
        System.out.println((int) Math.random()*10); // generate random number using Math class
        Random rand = new Random(); // generae random number using Random class
        System.out.println(rand.nextInt(1,10));
        


    }
        
    
}
