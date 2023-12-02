/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.EstudianteDao;
import dao.TemaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author U53R
 */
public class ProfileGui extends javax.swing.JFrame {
    
    private static String usuario;
    
    /**
     * Creates new form NewJFrame
     */
    public ProfileGui(String usuario) {
        initComponents();
        this.usuario = usuario;
        jTextPane1.setText(usuario + "!");
        jTextField1.setText(new EstudianteDao().obtenerNombre(usuario));
        jTextField2.setText(new EstudianteDao().obtenerCorreo(usuario));
        jTextField3.setText(new EstudianteDao().obtenerApellido(usuario));
        if (!"PROFESOR".equals(usuario)) {
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash-10-32.png"))); // NOI18N
        }
        
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
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        prevButton = new javax.swing.JPanel();
        prevLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        nextButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        circlesBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academy");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(239, 246, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 49, 85));
        jLabel1.setText("Apellido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rounded Mplus 1c ExtraBold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 149, 203));
        jLabel2.setText("Mi Cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 49, 85));
        jLabel3.setText("Correo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 49, 85));
        jLabel4.setText("Un vistazo a tu perfil.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(24, 49, 85));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, 60));

        prevButton.setBackground(new java.awt.Color(105, 151, 207));
        prevButton.setForeground(new java.awt.Color(255, 255, 251));
        prevButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevButtonMouseClicked(evt);
            }
        });
        prevButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prevLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        prevLabel.setForeground(new java.awt.Color(255, 255, 251));
        prevLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prevLabel.setText("Contenido");
        prevButton.add(prevLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        jPanel1.add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 47));

        jLabel7.setBackground(new java.awt.Color(171, 225, 248));
        jLabel7.setFont(new java.awt.Font("Rounded Mplus 1c ExtraBold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 49, 85));
        jLabel7.setText("¡Hola");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(171, 225, 248));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Rounded Mplus 1c ExtraBold", 0, 36)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(24, 49, 85));
        jTextPane1.setText("Usuario!");
        jTextPane1.setFocusable(false);
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 260, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(24, 49, 85));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 220, 33));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(24, 49, 85));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 220, 33));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(24, 49, 85));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 220, 33));

        nextButton.setBackground(new java.awt.Color(105, 151, 207));
        nextButton.setForeground(new java.awt.Color(255, 255, 251));
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 251));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar");
        nextButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 120, 30));

        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 130, 47));

        circlesBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgProfile.png"))); // NOI18N
        jPanel1.add(circlesBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevButtonMouseClicked
        // TODO add your handling code here:
        new ContentGui(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prevButtonMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        // TODO add your handling code here:
        new EstudianteDao().actualizarNombre(usuario, jTextField1.getText());
        new EstudianteDao().actualizarApellido(usuario, jTextField3.getText());
        new EstudianteDao().actualizarCorreo(usuario, jTextField2.getText());
        JOptionPane.showMessageDialog(this, "Usuario actualizado exitosamente.");
    }//GEN-LAST:event_nextButtonMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if (usuario != "PROFESOR") {
            int sw = new EstudianteDao().borrarUsuario(usuario);
            if (sw != 0) {
                new LoginGui().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(ProfileGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileGui(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel circlesBg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel nextButton;
    private javax.swing.JPanel prevButton;
    private javax.swing.JLabel prevLabel;
    // End of variables declaration//GEN-END:variables
}
