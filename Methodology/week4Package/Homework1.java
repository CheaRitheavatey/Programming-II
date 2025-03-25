package Methodology.week4Package;

import Methodology.Homework01_Package.Chat;

public class Homework1 {
    public static void main(String[] args ) {
        Chat userLily = new Chat("Lily"); 
        Chat userJack = new Chat("Jack"); 
        Chat userSam = new Chat("Sam"); 

        userLily.sendMessage(userJack, "hey");  

        userJack.sendMessage(userSam, "sup?");  
        
    }
    
}
