package GUI.Book;

import java.util.ArrayList;

public class BookManager {
    // data field
    private ArrayList<Book> arr;
    BookManager() {
        arr = new ArrayList<>();
    }
    public void add(Book item) {
        arr.add(item);
    }
    public void clear() {
        arr.clear();
    }
    public ArrayList<Book> getitem() {
        return arr;
    } 
    
}
