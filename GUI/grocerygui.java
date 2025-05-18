package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class grocerygui extends JFrame implements ActionListener {
    // data field
    private JLabel itemname;
    private JTextField enteritem;
    private JLabel quanity;
    private JTextField enterquanity;
    private JButton add, clear;
    private JTextArea update;

    private grocerymanager gm;

    // constructure
    grocerygui() {
        gm = new grocerymanager();
        setTitle("Grocery List");

        itemname = new JLabel("Item Name");
        enteritem = new JTextField(20);

        quanity = new JLabel("Item Quanity");
        enterquanity = new JTextField(20);

        update = new JTextArea(4,10);

        add = new JButton("Add");
        clear = new JButton("Clear");

        JPanel grid = new JPanel(new GridLayout(2,2));
        grid.add(itemname);
        grid.add(enteritem);
        grid.add(quanity);
        grid.add(enterquanity);

        JPanel flow = new JPanel(new FlowLayout());
        flow.add(add);
        flow.add(clear);

        JScrollPane updateitem = new JScrollPane(update);
        
        setLayout(new BorderLayout());
        JLabel title = new JLabel("Grocery List");
        title.setHorizontalAlignment(SwingConstants.CENTER); 

        add(title, BorderLayout.NORTH);
        add(updateitem,BorderLayout.EAST);
        add(grid, BorderLayout.CENTER);
        add(flow, BorderLayout.SOUTH);

        pack();
        setVisible(true);
        setResizable(false);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // action 
        add.addActionListener(this);
        clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (enteritem.getText().isEmpty() || enterquanity.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Please fill in the field");
            System.exit(0);

           
        } else if (e.getSource() == add && enteritem.getText() != null && enterquanity.getText() != null ) {
             gm.add(new groceryitem(enteritem.getText(), Integer.parseInt(enterquanity.getText())));
            
            // update whats on the right side
            updateitem();
            
        } else if (e.getSource() == clear){
            gm.clear();
            updateitem();
        } 
    }

    public void updateitem() {
        update.setText("");
        for (groceryitem item: gm.getitem()) {
            update.append(item.toString() + "\n");
        }
        enteritem.setText("");
        enterquanity.setText("");

    }
    public static void main(String[] args) throws Exception {
        new grocerygui();
    }
    
}
