package Methodology.Homework01_Package;
// Create a chat application which from a user instance, you can call the sendMessage method by passing the message, and the user who receives the message as parameters.  

// The messages sent and received should show up with the name of the sender and receiver in the output window.  

// Create the required classes in a different package from main.  


// Example:  

// The main method:  

//         userLily.sendMessage(userJack, "hey");  

//         userJack.sendMessage(userSam, "sup?");  

 

// Output:  

// Lily 'SENT' to Jack: hey  

// Jack 'RECEIVED' from Lily: hey  

// Jack 'SENT' to Sam: sup?  

// Sam 'RECEIVED' from Jack: sup? 
public class Chat {
    // data field
    private String name;

    public Chat(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return this.name;
    }
    // method
    public void sendMessage(Chat reciever, String message) {
        // send                                   
        System.out.println(getName() + " 'SENT' to " + reciever.getName() + ": " + message);

        // the other side
        System.out.println(reciever.getName() + " 'RECIEVE' from " + getName() + ": " + message);
       

    }


}
