
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InventoryManagerGUI extends JFrame implements ActionListener{

    
    private JLabel titleLabel;
    private JTextField itemNameTextField, itemQuantityTextField;
    private JTextArea inventoryTextArea;
    private JButton addButton, clearButton;
    private JPanel inputPanel, buttonPanel;
    
    private InventoryManager inventoryManager;
    
    public InventoryManagerGUI() {
        
        super("Inventory Manager");
        inventoryManager = new InventoryManager();
        
        setLayout(new BorderLayout());
        setSize(600,200);
        
        //title label
        titleLabel = new JLabel("Inventory Manager");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);
        
        //input label
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        itemNameTextField = new JTextField(10);
        itemQuantityTextField = new JTextField(5);
        
        inputPanel.add(new JLabel("Item Name:"));
        inputPanel.add(itemNameTextField);
        inputPanel.add(new JLabel("Item Quantity:"));
        inputPanel.add(itemQuantityTextField);
        
        add(inputPanel, BorderLayout.CENTER);
        
        //button panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        
        add(buttonPanel, BorderLayout.SOUTH);
        
        //inventory text area
        inventoryTextArea = new JTextArea(4, 10);
        inventoryTextArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(inventoryTextArea);
        
        add(scrollPane, BorderLayout.EAST);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == addButton) {
            String itemName = itemNameTextField.getText();
            int itemQuantity = Integer.parseInt(itemQuantityTextField.getText());
            
            inventoryManager.addItem(itemName, itemQuantity);
            updateInventoryTextArea();

        } else if (e.getSource() == clearButton) {
            inventoryManager.clearItems();
            updateInventoryTextArea();
        }
        
    }
    
    private void updateInventoryTextArea() {
        inventoryTextArea.setText("");
        for(InventoryItem item: inventoryManager.getItems()) {
            inventoryTextArea.append(item.getName() + " - " + item.getQuantity() + "\n");
        }
        itemNameTextField.setText("");
        itemQuantityTextField.setText("");
        
    }
    
}
