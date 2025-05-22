package GUI;

import java.util.ArrayList;
import java.util.List;

public class grocerymanager {
    // data field
    private List<groceryitem> arr;

    grocerymanager() {
        arr = new ArrayList<>();
    }

    // method for add and clear
    public void add(groceryitem item) {
        arr.add(item);
    }

    public void clear() {
        arr.clear();
    }

    public List<groceryitem> getitem() {
        return arr;
    } 

    public static void main(String[] args) {
        grocerymanager g = new grocerymanager();
        g.add(new groceryitem("pen", 3));
        g.add(new groceryitem("pencil", 4));
        System.out.println(g.getitem().toString());
    }

}
