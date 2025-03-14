package Methodology.week4Package;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Book {
    // data field
    private String title;
    private String author = "Unknown";
    private float price;
    private String publisher;

    private static int numberOfBooks;
    private ArrayList<String> genre = new ArrayList<>();

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
    // getter and setter
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public float getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }


    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public ArrayList<String> getGenre() {
        return genre;
    }


    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    @Override
    public String toString() {
        return this.getTitle() + " " + this.getPublisher();
    }


}

public class file2 {
    public static void main(String[] args) {
        Book.howToCreateBook();
        Book.getNumberOfBooks(); 
        
        ArrayList<Book> mylist = new ArrayList<>();
        mylist.add(new Book("Title 1", "Publsher 1"));
        mylist.add(new Book("Title 2", "Publsher 2"));
        mylist.add(new Book("Title 3", "Publsher 3"));

        for (Book i: mylist) {
            System.out.println(i.toString());
        }
    }
    



}