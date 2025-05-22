package GUI;
import javax.swing.*;


public class SimpleCalculator extends JFrame {

    // Variables declaration
    private JTextField inputField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, button1, button2;
    private JLabel resultLabel;

    public SimpleCalculator() {
        initComponents();
    }

    private void initComponents() {
        inputField = new JTextField(10);
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        button1 = new JButton("yes");
        button2 = new JButton("no");

        resultLabel = new JLabel("Result: ");
    
        // Set up the layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        // Define the horizontal group
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(inputField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtractButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multiplyButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(divideButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2))
                    .addComponent(resultLabel))
                .addContainerGap()
        );
    
        // Define the vertical group
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputField)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(subtractButton)
                    .addComponent(button1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplyButton)
                    .addComponent(divideButton)
                    .addComponent(button2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel)
                .addContainerGap()
        );
    
        // Add action listeners for buttons
        addButton.addActionListener(e -> calculate('+'));
        subtractButton.addActionListener(e -> calculate('-'));
        multiplyButton.addActionListener(e -> calculate('*'));
        divideButton.addActionListener(e -> calculate('/'));
    
        // Frame settings
        setTitle("Simple Calculator");
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    

    private void calculate(char operation) {
        try {
            String[] inputs = inputField.getText().split(",");
            double num1 = Double.parseDouble(inputs[0]);
            double num2 = Double.parseDouble(inputs[1]);
            double result = 0;

            switch (operation) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            resultLabel.setText("Result: " + result);
        } catch (Exception e) {
            resultLabel.setText("Invalid input");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}