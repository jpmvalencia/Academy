/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package academy;

/**
 *
 * @author U53R
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
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
        jLabel1 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        questLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        prevButton = new javax.swing.JPanel();
        prevLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JPanel();
        nextLabel = new javax.swing.JLabel();
        bgTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(239, 246, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rounded Mplus 1c ExtraBold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(119, 149, 203));
        jLabel1.setText("Test");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 60, -1, -1));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, 60));

        titleLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 251));
        titleLabel.setText("Estructuras");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 123, -1, -1));

        questLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        questLabel.setForeground(new java.awt.Color(255, 255, 251));
        questLabel.setText("¿Qué estructura de control se utiliza para tomar decisiones basadas en una condición en programación?");
        jPanel1.add(questLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 251));
        jRadioButton1.setText("Función");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 251));
        jRadioButton2.setText("Bucle");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 251));
        jRadioButton3.setText("Selección");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 251));
        jRadioButton4.setText("Secuencia");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        prevButton.setBackground(new java.awt.Color(171, 225, 248));
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
        prevLabel.setText("Atrás");
        prevButton.add(prevLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        jPanel1.add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 90, 47));

        nextButton.setBackground(new java.awt.Color(171, 225, 248));
        nextButton.setForeground(new java.awt.Color(255, 255, 251));
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextLabel.setFont(new java.awt.Font("Rounded Mplus 1c Medium", 0, 18)); // NOI18N
        nextLabel.setForeground(new java.awt.Color(255, 255, 251));
        nextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLabel.setText("Sig.");
        nextButton.add(nextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 80, 30));

        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 90, 47));

        bgTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgTest.png"))); // NOI18N
        jPanel1.add(bgTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonMouseClicked

    private void prevButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_prevButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel nextButton;
    private javax.swing.JLabel nextLabel;
    private javax.swing.JPanel prevButton;
    private javax.swing.JLabel prevLabel;
    private javax.swing.JLabel questLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
