package Methodology;
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


        
    }
    
}
