/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toye.nakamurazacharyfinalproject;

/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 19, 2023
 * 
 * A short program that will allow the user to explore gambling based games.
 * Each game GUI can be accessed by clicking a button on this GUI.
 * 
 */
public class frmTitlePage extends javax.swing.JFrame {

    /**
     * Creates new form frmTitlePage
     */
    public frmTitlePage() {
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

        lblTitle = new javax.swing.JLabel();
        btnGoToBJ = new javax.swing.JButton();
        btnGoToRoulette = new javax.swing.JButton();
        btnGoToSlots = new javax.swing.JButton();
        btnGoToPick4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTitle.setText("Gambling Simulator");

        btnGoToBJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/blackjack.jpg"))); // NOI18N
        btnGoToBJ.setText("Blackjack / 21");
        btnGoToBJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToBJActionPerformed(evt);
            }
        });

        btnGoToRoulette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/roulette.jpg"))); // NOI18N
        btnGoToRoulette.setText("Roulette");
        btnGoToRoulette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToRouletteActionPerformed(evt);
            }
        });

        btnGoToSlots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/slots.jpg"))); // NOI18N
        btnGoToSlots.setText("Slots");
        btnGoToSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToSlotsActionPerformed(evt);
            }
        });

        btnGoToPick4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/pick4.png"))); // NOI18N
        btnGoToPick4.setText("Pick4");
        btnGoToPick4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToPick4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Play the games below to see how they work, then learn the odds behind them and why you shouldn't gamble.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGoToBJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGoToRoulette, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGoToSlots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGoToPick4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitle))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGoToBJ)
                    .addComponent(btnGoToSlots))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoToRoulette)
                    .addComponent(btnGoToPick4))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToBJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToBJActionPerformed
        // TODO add your handling code here:
        // The user wants to go to black jack
        // Set the blackjack frame to visible
        new frmBlackjack().setVisible(true);
        // Get rid of this frame, making the blackjack frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_btnGoToBJActionPerformed

    private void btnGoToRouletteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToRouletteActionPerformed
        // TODO add your handling code here:
        // The user wants to go to roulette
        // Set the roulette frame to visible
        new frmRoulette().setVisible(true);
        // Get rid of this frame, making the blackjack frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_btnGoToRouletteActionPerformed

    private void btnGoToSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToSlotsActionPerformed
        // TODO add your handling code here:
        // The user wants to go to slots
        // Set the slots frame to visible
        new frmSlots().setVisible(true);
        // Get rid of this frame, making the blackjack frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_btnGoToSlotsActionPerformed

    private void btnGoToPick4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToPick4ActionPerformed
        // TODO add your handling code here:
        // The user wants to go to pick4
        // Set the pick4 frame to visible
        new frmPick4().setVisible(true);
        // Get rid of this frame, making the blackjack frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_btnGoToPick4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTitlePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTitlePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoToBJ;
    private javax.swing.JButton btnGoToPick4;
    private javax.swing.JButton btnGoToRoulette;
    private javax.swing.JButton btnGoToSlots;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
