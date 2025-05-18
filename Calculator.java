import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculator extends JFrame implements ActionListener {

    private JButton button0, button1, button2, button3, button4, button5,
            button6, button7, button8, button9;
    private JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide,
            buttonEquals, buttonClear;
    private JTextField textField;
    private double num1, num2, result;
    private String operator;
    
    public Calculator() {
        
        //we set the title here
        super("Calculator");
        
        textField = new JTextField();
        //setting the textField to not editable to prevent user from editing by typing
        //something invalid
        textField.setEditable(false);
        
        //create the numbers buttons
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button9 = new JButton("9");
        
        //Create the operators buttons
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("x");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");
        
        //add the action listener to the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);
        
        //CREATE THE LAYOUTS
        
        //With gridLayout we can specify num of rows and columns
        JPanel inputPanel = new JPanel(new GridLayout(4, 3));
        inputPanel.add(button1);
        inputPanel.add(button2);
        inputPanel.add(button3);
        inputPanel.add(button4);
        inputPanel.add(button5);
        inputPanel.add(button6);
        inputPanel.add(button7);
        inputPanel.add(button8);
        inputPanel.add(button9);
        inputPanel.add(buttonClear);
        inputPanel.add(button0);
        inputPanel.add(buttonEquals);
        
        JPanel operatorPanel = new JPanel(new GridLayout(4, 1));
        operatorPanel.add(buttonPlus);
        operatorPanel.add(buttonMinus);
        operatorPanel.add(buttonMultiply);
        operatorPanel.add(buttonDivide);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(textField, BorderLayout.NORTH);
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(operatorPanel, BorderLayout.EAST);
        
        //Add the panel to the JFrame
        add(mainPanel);
        
        setSize(250, 200);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == buttonPlus) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }  else if (e.getSource() == buttonMinus) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }  else if (e.getSource() == buttonDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }  else if (e.getSource() == buttonMultiply) {
            num1 = Double.parseDouble(textField.getText());
            operator = "x";
            textField.setText("");
        }  else if (e.getSource() == buttonEquals) {
            num2 = Double.parseDouble(textField.getText());
            if( operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("x")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }
            textField.setText(String.valueOf(result));
        } else if (e.getSource() == buttonClear) {
            textField.setText("");
        }

        
    }
    public static void main(String[] args) {
        new Calculator();
    }
    
    
    
}
