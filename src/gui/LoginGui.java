/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.EstudianteDao;

/**
 *
 * @author U53R
 */
public class LoginGui extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginGui() {
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
        pswdRecov = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();
        nextButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        pswdLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        pswdInput = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();
        logoImg = new javax.swing.JLabel();
        circlesBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academy");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(239, 246, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswdRecov.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        pswdRecov.setForeground(new java.awt.Color(105, 151, 207));
        pswdRecov.setText("                                    ");
        pswdRecov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pswdRecov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswdRecovMouseClicked(evt);
            }
        });
        jPanel1.add(pswdRecov, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        signUp.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        signUp.setForeground(new java.awt.Color(105, 151, 207));
        signUp.setText("Crear una cuenta");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        jPanel1.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        nextButton.setBackground(new java.awt.Color(105, 151, 207));
        nextButton.setForeground(new java.awt.Color(255, 255, 251));
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 251));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar");
        nextButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 120, 30));

        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 130, 47));

        userLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(24, 49, 85));
        userLabel.setText("Usuario");
        jPanel1.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        pswdLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        pswdLabel.setForeground(new java.awt.Color(24, 49, 85));
        pswdLabel.setText("Contraseña");
        jPanel1.add(pswdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

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
        jPanel1.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 266, 47));

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
        jPanel1.add(pswdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 266, 47));

        loginLabel.setFont(new java.awt.Font("Rounded Mplus 1c ExtraBold", 1, 48)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(119, 149, 203));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Iniciar Sesión");
        jPanel1.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 340, -1));

        logoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        jPanel1.add(logoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 340, 70));

        circlesBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgLogin.png"))); // NOI18N
        jPanel1.add(circlesBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 810, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void pswdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdInputActionPerformed

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        new SignUpGui().setVisible(true);  // Instancia la clase SingUp y llama a setVisible(true) para hacerse visible
        this.dispose();                   // Cierra la ventana actual en la que se hace clic
    }//GEN-LAST:event_signUpMouseClicked

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        
            EstudianteDao dao = new EstudianteDao();
            boolean ingresoExitoso = dao.iniciarSesion(this.userInput.getText(), String.valueOf(this.pswdInput.getPassword()));

            if (ingresoExitoso && "PROFESOR".equals(this.userInput.getText())) {
                // Ingresar a ContentGui
                new OptionsGui(userInput.getText()).setVisible(true);
                this.dispose();
            } else if (ingresoExitoso){
                // Ingresar a ContentGui
                new ContentGui(userInput.getText()).setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Datos incorrectos.");
            }
        
    }//GEN-LAST:event_nextButtonMouseClicked

    private void pswdRecovMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswdRecovMouseClicked
        // TODO add your handling code here:
        System.out.println("Recuperar contraseña.");
    }//GEN-LAST:event_pswdRecovMouseClicked

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
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel circlesBg;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel logoImg;
    private javax.swing.JPanel nextButton;
    private javax.swing.JPasswordField pswdInput;
    private javax.swing.JLabel pswdLabel;
    private javax.swing.JLabel pswdRecov;
    private javax.swing.JLabel signUp;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
