package firstgui;

/**
 *
 * @author ajSchmidt-Zimmel
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        namePrompt = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        sayHelloButton = new javax.swing.JButton();
        messageOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namePrompt.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        namePrompt.setForeground(new java.awt.Color(0, 204, 0));
        namePrompt.setText("Enter Your Name:");

        nameText.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 0, 0));
        nameText.setToolTipText("Enter Name");

        sayHelloButton.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        sayHelloButton.setForeground(new java.awt.Color(153, 0, 153));
        sayHelloButton.setText("Say Hello!");
        sayHelloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayHelloButtonActionPerformed(evt);
            }
        });

        messageOutput.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        messageOutput.setForeground(new java.awt.Color(0, 204, 204));
        messageOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageOutput.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namePrompt)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sayHelloButton)
                                .addGap(0, 174, Short.MAX_VALUE))
                            .addComponent(nameText))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namePrompt)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sayHelloButton)
                .addGap(18, 18, 18)
                .addComponent(messageOutput)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sayHelloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayHelloButtonActionPerformed
        //retrieve the name that was typed in
        String name = nameText.getText();
        //output name into messageOutput
        messageOutput.setText("Hello " + name + "!");
        
    }//GEN-LAST:event_sayHelloButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel messageOutput;
    private javax.swing.JLabel namePrompt;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton sayHelloButton;
    // End of variables declaration//GEN-END:variables
}
