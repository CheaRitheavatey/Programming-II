// public class BankAccount {
//     // Private fields
//     private String accountNumber;
//     private String ownerName;
//     private double balance;

//     // Constructor to initialize the account
//     public BankAccount(String accountNumber, String ownerName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.ownerName = ownerName;
//         this.balance = initialBalance;
//     }

//     // Method to deposit money
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited " + amount + ". New balance: " + balance);
//         } else {
//             System.out.println("Deposit amount must be greater than zero.");
//         }
//     }

//     // Method to withdraw money
//     public void withdraw(double amount) {
//         if (amount > 0) {
//             if (balance >= amount) {
//                 balance -= amount;
//                 System.out.println("Withdrew " + amount + ". New balance: " + balance);
//             } else {
//                 System.out.println("Insufficient funds.");
//             }
//         } else {
//             System.out.println("Withdrawal amount must be greater than zero.");
//         }
//     }

//     // Method to get the balance
//     public double getBalance() {
//         return balance;
//     }

//     // Main method to test the BankAccount class
//     public static void main(String[] args) {
//         // Create a BankAccount object
//         BankAccount account = new BankAccount("123456789", "John Doe", 1000);

//         // Deposit and withdraw some money
//         account.deposit(500);    // Deposit 500
//         account.withdraw(200);   // Withdraw 200
//         account.withdraw(1500);  // Try to withdraw more than the balance

//         // Display the current balance
//         System.out.println("Final balance: " + account.getBalance());
//     }
// }


public class BankAccount {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}