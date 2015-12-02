package firstgui;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alyson
 */
public class TemperatureConversion extends javax.swing.JFrame {

    /**
     * Creates new form TemperatureConversion
     */
    public TemperatureConversion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topLabel = new javax.swing.JLabel();
        tempText = new javax.swing.JTextField();
        tempLabel = new javax.swing.JLabel();
        celciusToFahrenheit = new javax.swing.JButton();
        fahrenheitToCelcius = new javax.swing.JButton();
        tempOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topLabel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        topLabel.setText("Temperature Conversion");

        tempText.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        tempText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTextActionPerformed(evt);
            }
        });

        tempLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        tempLabel.setText("Enter Temperature:");

        celciusToFahrenheit.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        celciusToFahrenheit.setText("To Fahrenheit");
        celciusToFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celciusToFahrenheitActionPerformed(evt);
            }
        });

        fahrenheitToCelcius.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        fahrenheitToCelcius.setText("To Celsius");
        fahrenheitToCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitToCelciusActionPerformed(evt);
            }
        });

        tempOutput.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tempOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(celciusToFahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fahrenheitToCelcius)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tempLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tempText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celciusToFahrenheit)
                    .addComponent(fahrenheitToCelcius))
                .addGap(18, 18, 18)
                .addComponent(tempOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tempTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTextActionPerformed
        
    }//GEN-LAST:event_tempTextActionPerformed

    private void celciusToFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celciusToFahrenheitActionPerformed
        String re = "[0-9]+";
        if (tempText.getText().isEmpty() || !tempText.getText().matches(re)) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                Logger.getLogger(TemperatureConversion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int c = Integer.parseInt(tempText.getText());
        
        int f = ((c * 9)/5) + 32;
        String temp = "" + f + "";
        
        tempOutput.setText(temp);
    }//GEN-LAST:event_celciusToFahrenheitActionPerformed

    private void fahrenheitToCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitToCelciusActionPerformed
        String re = "[0-9]+";
        if (tempText.getText().isEmpty() || !tempText.getText().matches(re)) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                Logger.getLogger(TemperatureConversion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int f = Integer.parseInt(tempText.getText());
        
        int c = ((f  - 32)*5)/9;
        String temp = "" + c + "";
        
        tempOutput.setText(temp);
    }//GEN-LAST:event_fahrenheitToCelciusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TemperatureConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton celciusToFahrenheit;
    private javax.swing.JButton fahrenheitToCelcius;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JLabel tempOutput;
    private javax.swing.JTextField tempText;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
