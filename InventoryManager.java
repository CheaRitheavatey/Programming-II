
import java.util.ArrayList;
import java.util.List;


public class InventoryManager {
    
    private List <InventoryItem> items;
    
    public InventoryManager() {
        items = new ArrayList<>();
    }
    
    public void addItem(String name, int quantity) {
        InventoryItem item = new InventoryItem(name, quantity);
        items.add(item);
    }
    
    public List<InventoryItem> getItems() {
        return items;
    }
    
    public void clearItems() {
        items.clear();
    }
    
    
    
}
