/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.guiproject;

/**
 *
 * @author ebepa
 */
import javax.swing.*;

public class ProductCalculator extends javax.swing.JFrame {

    // Variables declaration
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField numberField1;
    private javax.swing.JTextField numberField2;
    
    // Constructor
    public ProductCalculator() {
        initComponents();
    }

    private void initComponents() {

        numberField1 = new javax.swing.JTextField();
        numberField2 = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Calculator");

        numberField1.setColumns(10);
        numberField2.setColumns(10);

        calculateButton.setText("Calculate Product");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        resultLabel.setText("Result: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberField1)
                            .addComponent(numberField2)
                            .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(numberField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calculateButton)
                .addGap(18, 18, 18)
                .addComponent(resultLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double number1 = Double.parseDouble(numberField1.getText());
            double number2 = Double.parseDouble(numberField2.getText());
            double product = number1 * number2;
            resultLabel.setText("Result: " + product);
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numbers.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductCalculator().setVisible(true);
            }
        });
    }
}

