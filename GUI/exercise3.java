package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class exercise3 extends JFrame implements ActionListener{
    // data field
    private JTextField text;
    private JLabel label;
    private JButton button;

    // constructor 
    exercise3() {
        setTitle("Simple GUI");
        setSize(300, 200);

        text = new JTextField(20);
        button = new JButton("Submit");

        label = new JLabel();

        button.addActionListener(this);
        text.addActionListener(this); // when press enter it also show

        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.add(text);
        panel.add(button);
        panel.add(label);

       

        setLayout(new GridLayout());
        add(panel, BorderLayout.CENTER);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource() == button) || (e.getSource() == text)) {
            if (!text.getText().isEmpty()) {
                label.setText(text.getText());
            } else {
                JOptionPane.showMessageDialog(this, "cannot be empty");
            }
        }
    }


    public static void main(String[] args) {
        new exercise3();
    }
}
