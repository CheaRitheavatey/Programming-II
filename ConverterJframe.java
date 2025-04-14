import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConverterJframe {
    // data field
    private JFrame frame;
    private JButton convertButton;
    private JLabel celsiusLable;
    private JLabel fahrenheitLabel;
    private JTextField textField;

    // constructor
    ConverterJframe() {
        initComponent();
    }

   
    private void initComponent() {
        frame = new JFrame();
        textField = new JTextField();
        celsiusLable = new JLabel();
        fahrenheitLabel = new JLabel();
        convertButton = new JButton();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Temperature Converter");

        celsiusLable.setText("Celsius");
        convertButton.setText("Convert");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        fahrenheitLabel.setText("Fahrenheit");
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(convertButton, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(textField))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(celsiusLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fahrenheitLabel, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(celsiusLable))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(convertButton)
                        .addComponent(fahrenheitLabel))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame.pack();
        frame.setVisible(true);
    }
    

    private void convertButtonActionPerformed(ActionEvent evt) {
        try {
            double tempCelsius = Double.parseDouble(textField.getText());
            int tempFahr = (int)(tempCelsius * 1.8 + 32);
            fahrenheitLabel.setText(tempFahr + " Fahrenheit");
        } catch (NumberFormatException e) {
            fahrenheitLabel.setText("Invalid input");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterJframe();
            }
        });
    }


   
}