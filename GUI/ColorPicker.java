package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPicker extends JFrame implements ActionListener {
    private JPanel colorPanel;
    private JLabel colorLabel;
    private JButton chooseColorButton;

    public ColorPicker() {
        setTitle("Color Picker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        colorPanel = new JPanel();
        colorLabel = new JLabel("Select a color:");
        chooseColorButton = new JButton("Choose Color");

        // Add action listener to the button
        chooseColorButton.addActionListener(this);

        // Set layout and add components
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(chooseColorButton);

        add(colorLabel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseColorButton) {
            // Open the color chooser dialog
            Color chosenColor = JColorChooser.showDialog(this, "Select a Color", Color.WHITE);
            if (chosenColor != null) {
                colorPanel.setBackground(chosenColor);
                colorLabel.setText("Selected Color: " + String.format("#%06X", chosenColor.getRGB() & 0xFFFFFF));
            }
        }
    }

    public static void main(String[] args) {
        new ColorPicker();
    }
}