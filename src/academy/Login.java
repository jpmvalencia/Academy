/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package academy;

/**
 *
 * @author U53R
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        signUp = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        pswdLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        pswdInput = new javax.swing.JPasswordField();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academy");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(239, 246, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUp.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        signUp.setForeground(new java.awt.Color(105, 151, 207));
        signUp.setText("Crear una cuenta");
        jPanel1.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 464, -1, -1));

        userLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(24, 49, 85));
        userLabel.setText("Usuario");
        jPanel1.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 168, -1, -1));

        pswdLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        pswdLabel.setForeground(new java.awt.Color(24, 49, 85));
        pswdLabel.setText("Contraseña");
        jPanel1.add(pswdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 280, -1, -1));

        userInput.setBackground(new java.awt.Color(105, 151, 207));
        userInput.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        userInput.setForeground(new java.awt.Color(255, 255, 251));
        userInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userInput.setBorder(null);
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        jPanel1.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 204, 266, 47));

        pswdInput.setBackground(new java.awt.Color(105, 151, 207));
        pswdInput.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 12)); // NOI18N
        pswdInput.setForeground(new java.awt.Color(255, 255, 251));
        pswdInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswdInput.setBorder(null);
        pswdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdInputActionPerformed(evt);
            }
        });
        jPanel1.add(pswdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 315, 266, 47));

        nextButton.setBackground(new java.awt.Color(105, 151, 207));
        nextButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 251));
        nextButton.setText("⇢");
        nextButton.setBorder(null);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 386, 47, 47));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgLogin.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void pswdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdInputActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JPasswordField pswdInput;
    private javax.swing.JLabel pswdLabel;
    private javax.swing.JLabel signUp;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}