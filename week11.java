
public class week11 extends javax.swing.JFrame {

    // Variables declaration
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel celsiusLabel;
    private javax.swing.JLabel fahrenheitLabel;
    private javax.swing.JTextField tempTextField;

    public week11() {
        initComponents();
    }

    private void initComponents() {
        tempTextField = new javax.swing.JTextField();
        celsiusLabel = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        fahrenheitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        celsiusLabel.setText("Celsius");

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        fahrenheitLabel.setText("Fahrenheit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(convertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(tempTextField))
                    .addGap(500, 500, 500)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(celsiusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fahrenheitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(celsiusLabel))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(convertButton)
                        .addComponent(fahrenheitLabel))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double tempCelsius = Double.parseDouble(tempTextField.getText());
            int tempFahr = (int)(tempCelsius * 1.8 + 32);
            fahrenheitLabel.setText(tempFahr + " Fahrenheit");
        } catch (NumberFormatException e) {
            fahrenheitLabel.setText("Invalid input");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new week11().setVisible(true);
            }
        });
    }
}