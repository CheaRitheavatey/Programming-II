package GUI;

public class groceryitem {
    // data field
    private String item;
    private int quality;

    groceryitem(String item, int quality) {
        this.item = item;
        this.quality = quality;
    }

    // getter
    public String getItems() {
        return this.item;
    }
    public int getquality() {
        return this.quality;
    }
    public String toString() {
        return this.item + " - " + this.quality;
    }
    
}
