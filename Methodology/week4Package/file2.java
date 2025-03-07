package Methodology.week4Package;

class Book {
    // data field
    String title;
    String genre;
    String author = "Unknown";
    float price;
    String publisher;

    static int numberOfBooks;

    // constructor
    Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        numberOfBooks += 1;
    }
    
    Book(String title, String publisher) {        
        this.title = title;
        this.publisher = publisher;
        numberOfBooks += 1;

    }

    // method
    static void howToCreateBook() {
        System.out.println("Passed Title and author and publisher");
    }

}

public class file2 {
    public static void main(String[] args) {
        Book.howToCreateBook();
    }
    
}