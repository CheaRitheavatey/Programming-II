package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginGUI extends JFrame implements ActionListener {
    // data field
    private JTextField writename;
    private JPasswordField writepassword;
    private JLabel name;
    private JLabel password;
    private JButton submit;

    LoginGUI() {
        setTitle("Login");
        setPreferredSize(new Dimension(300,150));
        name = new JLabel("Name: ");
        name.setForeground(Color.RED); // meaning "Name" is in red

        password = new JLabel("Password: ");
        
        writename = new JTextField(20);
        writename.setBackground(Color.GREEN);

        writepassword = new JPasswordField(20);
        
        submit = new JButton("Login");
        submit.setBackground(new Color(23,43,11));

        // listener
        submit.addActionListener(this);

        // set layout because we know how many row and col we have we can use gridlayput
        JPanel infopanel = new JPanel(new GridLayout(2,2));
        infopanel.add(name);
        infopanel.add(writename);

        infopanel.add(password);
        infopanel.add(writepassword);
        
        setLayout(new BorderLayout());
        add(infopanel,BorderLayout.NORTH);
        add(submit, BorderLayout.SOUTH);

        // when pressed enter, this button will be detected
        getRootPane().setDefaultButton(submit);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        // check if it is a login button or not
        if (e.getSource() == submit) {
            String username = writename.getText();
            String userpassword = new String (writepassword.getPassword());

            if (username.equals("admin") && userpassword.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Password or username");
                writename.setText("");
                writepassword.setText("");
            }
        }

    }
    
    
}
