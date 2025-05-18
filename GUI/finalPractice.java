package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class finalPractice extends JFrame implements ActionListener {
    // data field
    private JLabel name;
    private JLabel password;
    private JTextField entername;
    private JPasswordField enterpass;
    private JButton submit;

    finalPractice() {
        setTitle("Login");
        setSize(150, 400);

        name = new JLabel("Name ");
        entername = new JTextField(20);

        password = new JLabel("Password ");
        enterpass = new JPasswordField(20);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(name);
        panel.add(entername);
        panel.add(password);
        panel.add(enterpass);
        
        // menubar
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem edit = new JMenuItem("Edit");

        menu.add(save);
        menu.add(edit);
        menu.add(copy);
        
        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        JMenuItem more = new JMenuItem("More");

        help.add(about);
        help.add(more);

        menuBar.add(menu);
        menuBar.add(help);

        setLayout(new BorderLayout());
        add(menuBar, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(submit, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new finalPractice();
    }
    
}
