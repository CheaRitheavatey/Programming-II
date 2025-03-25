package week4Package;

public class Homework1 {
    public static void main(String[] args ) {
        Chat userLily = new Chat("Lily"); 
        Chat userJack = new Chat("Jack"); 
        Chat userSam = new Chat("Sam"); 

        userLily.sendMessage(userJack, "hey");  

        userJack.sendMessage(userSam, "sup?");  
        
    }
    
}
