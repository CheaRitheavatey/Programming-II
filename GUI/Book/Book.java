package GUI.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Book {
    // data field
    private String title;
    private String author;
    private int yearPublished;
    private Genre genre;

    private static ArrayList<Book> listOfBook = new ArrayList<>(); 

    // constructor
    Book(String title, String author, int yearPublished, Genre genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
        listOfBook.add(this);
    }
    Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        listOfBook.add(this);
    }

    @Override
    public String toString() {
        return this.title + "-" + this.author + "-" + this.yearPublished + "-" + this.genre;
    }

    // return list of book
    public static ArrayList<Book> getAllBook() {
        return listOfBook;
    }

    // set for array
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
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public static ArrayList<Book> getListOfBook() {
        return listOfBook;
    }
    public static void setListOfBook(ArrayList<Book> listOfBook) {
        Book.listOfBook = listOfBook;
    }
    // remove book
    public static void removeBook(Book book){
        if (listOfBook.isEmpty()) {
            System.out.println("The list of book is empty");
        }

        if (listOfBook.contains(book)) {
            listOfBook.remove(book);
            System.out.println(book + " is removed");
            System.out.println(listOfBook.toString());
        }
    }

    // main method
    public static void main(String[] args) {
        // Book book1 = new Book("When I Fly Toward You", "James Jone", 1990, Genre.ROMANCE);
        // Book book2 = new Book("Great Gatsby", "Anna Elsa", 2000, Genre.HORROR);
        // Book book3 = new Book("Your Name", "Mitsutani", 1998, Genre.ANIME);

        // System.out.println(Book.getAllBook());
        
        // System.out.println("want to remove Greate Gatsby");
        // Book.removeBook(book2);

        // Ebook ebook1 = new Ebook("Daylight", "Sund duns", 1980, Genre.FANTASY, 10);
        // Ebook ebook2 = new Ebook("WonderLand", "Alice", 2022, Genre.ROMANCE, 50);
        // Ebook ebook3 = new Ebook("CarpetMan", "Bazzi", 2023, Genre.ANIME, 34);
        // Ebook.getAllBook();
        // Ebook.removeBook(ebook1);


        ReadBook.readAndWriteBooks(Paths.get("week9File.txt"), Paths.get("weekFile.txt"));
        
    }
    
}

enum Genre {
    HORROR,
    ROMANCE,
    FANTASY,
    ANIME;
}

// inheritance
class Ebook extends Book {
    // data field
    private int fileSizeMB;

    Ebook(String title, String author, int yearPublished, Genre genre, int fileSizeMB) {
        super(title, author, yearPublished, genre);
        this.fileSizeMB =fileSizeMB;
    }   
    
    @Override
    public String toString() {
        return super.toString() + "-" + this.fileSizeMB + "MB";
    }

}


class ReadBook {
    public static void readAndWriteBooks(Path originalPath, Path newPath) {
        // read first 
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(originalPath.toString()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // write to another file
        try (FileWriter writer = new FileWriter(newPath.toString())) {
            writer.write(str.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}