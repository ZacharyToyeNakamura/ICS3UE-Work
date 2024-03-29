/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toye.nakamurazacharyu2a3ast;
import java.text.DecimalFormat;
/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 3, 2023
 * A basic program to display a GUI where the user can buy macaroons and see the price they must pay.
 * Error handling for non-int isn't possible due to not being able to use try and expect
 * And this statement just straight up doesn't work (in the calculate button func) // if (txtNumLemon.getText() == "") txtNumLemon.setText("0");
 */
public class frmMarkingPurchase extends javax.swing.JFrame {
    
    // Declare the formating of the decimals, (rounded to 2 decimal places)
    DecimalFormat df2 = new DecimalFormat("0.00");
    // Declare the price of lemon macaroons
    final double DBLLEMONPRICE = 1.99;
    // Declare the price of blueberry macaroons
    final double DBLBLUEBERRYPRICE = 1.79;
    // Declare the price of raspberry macaroons
    final double DBLRASPBERRYPRICE = 1.99;
    // Declare the price of lime macaroons
    final double DBLLIMEPRICE = 1.79;
    // Declare the price of banana macaroons
    final double DBLBANANAPRICE = 2.29;
    // Declare the tax percentatge
    final double DBLTAXPERCENT = 0.13;
    
    /**
     * Creates new form frmMarkingPurchase
     */
    public frmMarkingPurchase() {
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
        lblSubtitle = new javax.swing.JLabel();
        lblSubtitle2 = new javax.swing.JLabel();
        javax.swing.JButton btnCalculate = new javax.swing.JButton();
        lblTaxes = new javax.swing.JLabel();
        lblSubtotalText = new javax.swing.JLabel();
        lblTotalText = new javax.swing.JLabel();
        lblTaxesOutput = new javax.swing.JLabel();
        lblSubtotalOutput = new javax.swing.JLabel();
        lblTotalOutput = new javax.swing.JLabel();
        lblLemonMacaroons = new javax.swing.JLabel();
        lblBlueberryMacaroons = new javax.swing.JLabel();
        lblRaspberryMacaroons = new javax.swing.JLabel();
        lblLimeMacaroons = new javax.swing.JLabel();
        lblBananaMacaroons = new javax.swing.JLabel();
        txtNumLemon = new javax.swing.JTextField();
        txtNumBlueberry = new javax.swing.JTextField();
        txtNumRaspberry = new javax.swing.JTextField();
        txtNumLime = new javax.swing.JTextField();
        txtNumBanana = new javax.swing.JTextField();
        lblMacaroonImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setText("Madeleine's Macaroons");

        lblSubtitle.setText("Enter the number of each macaroon that you would  ");

        lblSubtitle2.setText(" like to purchase and click Calculate.");

        btnCalculate.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculate.setForeground(new java.awt.Color(102, 153, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("");
        btnCalculate.setActionCommand("jButton1");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblTaxes.setText("Taxes (13%):");

        lblSubtotalText.setText("Subtotal:");

        lblTotalText.setText("Grand Total:");

        lblTaxesOutput.setText("$0.00");

        lblSubtotalOutput.setText("$0.00");

        lblTotalOutput.setText("$0.00");

        lblLemonMacaroons.setText("Lemon Macaroons ($1.99): ");

        lblBlueberryMacaroons.setText("Blueberry Macaroons ($1.79):");

        lblRaspberryMacaroons.setText("Raspberry Macaroons ($1.99):");

        lblLimeMacaroons.setText("Lime Macaroons ($1.79):");

        lblBananaMacaroons.setText("Banana Macaroons ($2.29):");

        txtNumLemon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumLemon.setText("0");
        txtNumLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumLemonActionPerformed(evt);
            }
        });

        txtNumBlueberry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumBlueberry.setText("0");
        txtNumBlueberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumBlueberryActionPerformed(evt);
            }
        });

        txtNumRaspberry.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumRaspberry.setText("0");
        txtNumRaspberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumRaspberryActionPerformed(evt);
            }
        });

        txtNumLime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumLime.setText("0");
        txtNumLime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumLimeActionPerformed(evt);
            }
        });

        txtNumBanana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumBanana.setText("0");
        txtNumBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumBananaActionPerformed(evt);
            }
        });

        lblMacaroonImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyu2a3ast/macaroonImage.jpg"))); // NOI18N
        lblMacaroonImage.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblLemonMacaroons))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblBlueberryMacaroons)
                                            .addGap(2, 2, 2))
                                        .addComponent(lblLimeMacaroons, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBananaMacaroons, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblRaspberryMacaroons))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumLemon)
                                    .addComponent(txtNumBlueberry)
                                    .addComponent(txtNumRaspberry)
                                    .addComponent(txtNumLime)
                                    .addComponent(txtNumBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTaxes)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblSubtotalText)
                                                .addComponent(lblTotalText)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblTaxesOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSubtotalOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCalculate)
                                        .addGap(71, 71, 71))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblSubtitle2)
                                        .addGap(23, 23, 23)))))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblMacaroonImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSubtitle)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubtitle2))
                    .addComponent(lblMacaroonImage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLemonMacaroons)
                            .addComponent(txtNumLemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBlueberryMacaroons)
                            .addComponent(txtNumBlueberry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaspberryMacaroons)
                            .addComponent(txtNumRaspberry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTaxes)
                            .addComponent(lblTaxesOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubtotalText)
                            .addComponent(lblSubtotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalText)
                            .addComponent(lblTotalOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumLime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLimeMacaroons))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumBanana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBananaMacaroons))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // The only function that matters
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        
        // First calculate the subtotal buy multiplying each item by it's price
        double dblSubtotal =    Integer.parseInt(txtNumLemon.getText()) * DBLLEMONPRICE +
                                Integer.parseInt(txtNumBlueberry.getText()) * DBLBLUEBERRYPRICE +
                                Integer.parseInt(txtNumRaspberry.getText()) * DBLRASPBERRYPRICE +
                                Integer.parseInt(txtNumLime.getText()) * DBLLIMEPRICE +
                                Integer.parseInt(txtNumBanana.getText()) * DBLBANANAPRICE;
        // Then declare and store the amount of tax calculated from subtotal
        double dblTaxAmount = dblSubtotal * DBLTAXPERCENT;
        // Then declare and store the total, which is the sum of subtotal and tax. | Fine, I'm using more variables . . .
        double dblTotal = dblSubtotal + dblTaxAmount;
        // Now display the subtotal
        lblSubtotalOutput.setText("$" + df2.format(dblSubtotal));
        // Display the amount of tax
        lblTaxesOutput.setText("$" + df2.format(dblTaxAmount));
        // Display the final total
        lblTotalOutput.setText("$" + df2.format(dblTotal));
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtNumLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumLemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumLemonActionPerformed

    private void txtNumBlueberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumBlueberryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumBlueberryActionPerformed

    private void txtNumRaspberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumRaspberryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumRaspberryActionPerformed

    private void txtNumLimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumLimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumLimeActionPerformed

    private void txtNumBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumBananaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumBananaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMarkingPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMarkingPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMarkingPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMarkingPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMarkingPurchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBananaMacaroons;
    private javax.swing.JLabel lblBlueberryMacaroons;
    private javax.swing.JLabel lblLemonMacaroons;
    private javax.swing.JLabel lblLimeMacaroons;
    private javax.swing.JLabel lblMacaroonImage;
    private javax.swing.JLabel lblRaspberryMacaroons;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblSubtitle2;
    private javax.swing.JLabel lblSubtotalOutput;
    private javax.swing.JLabel lblSubtotalText;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JLabel lblTaxesOutput;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalOutput;
    private javax.swing.JLabel lblTotalText;
    private javax.swing.JTextField txtNumBanana;
    private javax.swing.JTextField txtNumBlueberry;
    private javax.swing.JTextField txtNumLemon;
    private javax.swing.JTextField txtNumLime;
    private javax.swing.JTextField txtNumRaspberry;
    // End of variables declaration//GEN-END:variables
}
