/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toye.nakamurazacharyfinalproject;

/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 21 2023
 * This program allows the user to play a simplified version of roulette.
 * It's simplified because blackjack is too much of a time sink for me (adding 1 split almost doubled my code). 
 * 0 is not even or odd in roulette
 * Otherwise I would have done multi betting, rows, columns, and other things.
 * There are also buttons to transfer between GUIs
 * 
 * The possible inputs in any case are black, red, evens, odds, or a number.
 */
public class frmRoulette extends javax.swing.JFrame {

    // Declare what is valid input besides the numbers
    final String [] STRVALIDINPUT = {"red", "black", "evens", "odds"};
    // Declare the red numbers
    final int [] INTREDNUMS =   {1,3,5,7,9, 12,14,16,18,21,23,25,27,28,30,32,34,36};
    // Declare the black numbers
    final int [] INTBLACKNUMS = {2,4,6,8,10,11,13,15,17,19,20,22,24,26,29,31,33,25};
    
    int intUserMoney = 100;
    /**
     * Checks if the parameter is a valid string for roulette
     * @param strValidation - A string that the user inputs
     * @param STRVALIDINPUT - A list of strings that are valid input
     * @return True if the string is valid, otherwise it will return false
     */
    public static boolean isValid (String strValidation, String [] STRVALIDINPUT) 
    {
        // try parsing for a int
        try 
        {
            // if the string is a number between 0 and 36 return true
            if(Integer.parseInt(strValidation) >= 0 && Integer.parseInt(strValidation) <= 36) return true;
        }
        // not a int
        catch (Exception InputFormatException)
        {
            for (String strValidInput: STRVALIDINPUT)
            {
                if(strValidation.equals(strValidInput)) return true;
            }
        }
        return false;
    }
    
    /**
     * Check if a string can be parsed for a positive int
     * @param intValidation - any string
     * @return  true if the parameter is a positive integer otherwise false
     */
    public static boolean isPosInt(String strValidation)
    {
        // try parsing
        try 
        {
            // if it's a positive int return true
            if (Integer.parseInt(strValidation) > 0) return true;
        }
        // else return false
        catch (Exception InputFormatException)
        {
        }
        return false;
    }
    /**
     * 
     * @param strInput The user's choice
     * @param intWinningNum The winning number a umber between 0 and 37 inclusive
     * @param intRedNums The red numbers
     * @param intBlackNums The black numbers
     * @return 0 for the user didn't win anything, 1 for the user won on parity (even/red/odd/black) and 35 for the user winning on a num.
     */
    public static int userWinnings(String strInput, int intWinningNum, int [] intRedNums, int [] intBlackNums)
    {
        // try dealing with the numbers first
        try
        {
            // if the input is 00 and hte winning number is 37 (faux 00) then the user wins at 35:1 payout
            if (strInput.equals("00") && intWinningNum == 37) return 35;
            // if the user's input is the winning num then the user wins at 35:1 payout
            if (Integer.parseInt(strInput) == intWinningNum) return 35;
        }
        // Catch the exception but don't do anything
        catch(Exception InputFormatException)
        {
            // nothing
        }
        // if the user inputted red
        if (strInput.equals("red")) 
        {
            // if the winning num is in the red nums return that the user won at 1:1 payout
            for (int i: intRedNums) if (i == intWinningNum) return 1;
        }
        // if the user inputted black
        if (strInput.equals("black")) 
        {
            // if the winning num is in the black nums return that the user won at 1:1 payout
            for (int i: intBlackNums) if (i == intWinningNum) return 1;
        }
        // 0 is not even or odd in roulette
        // if the user bet evens and the number is a even and it's not 0 then the user won at 1:1 payout
        if (strInput.equals("evens") && intWinningNum % 2 == 0 && intWinningNum != 0) return 1;
        // if the user bet odds and the number is a odd and it's not 37 (because it's the faux 00) then the user won at 1:1 payout
        if (strInput.equals("odds") && intWinningNum % 2 == 1 && intWinningNum != 37) return 1;
        
        
        // they lost, and lose money equal to their bet
        return -1;
    }
    
    /**
     * Creates new form frmRoulette
     */
    public frmRoulette() {
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
        lblRouletteImage = new javax.swing.JLabel();
        lblExplanation2 = new javax.swing.JLabel();
        btnSpin = new javax.swing.JButton();
        txtUserChoice = new javax.swing.JTextField();
        txtUserBet = new javax.swing.JTextField();
        lblBetAmountTitle = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        lblExplanation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTitle.setText("Welcome to Simplified Roulettle");

        lblRouletteImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/rouletteTable.jpg"))); // NOI18N

        lblExplanation2.setText("Enter a number below (including 0 and 00), or red or black, or odds, or evens. Then click spin to play!");

        btnSpin.setText("Spin!");
        btnSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinActionPerformed(evt);
            }
        });

        txtUserBet.setText("1");
        txtUserBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserBetActionPerformed(evt);
            }
        });

        lblBetAmountTitle.setText("Bet Amount:");

        lblMoney.setText("Money: $100");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnInfo.setText("Learn More!");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        lblExplanation.setText("If it lands on what you bet on you win, otherwise you lose. Please note that 0 (and 00) is not even or odd in roulette.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBetAmountTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserBet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMoney)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSpin)
                                .addGap(18, 18, 18)
                                .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblRouletteImage)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblExplanation2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblExplanation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMoney))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBetAmountTitle))))
                .addGap(18, 18, 18)
                .addComponent(lblRouletteImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        // Make the title page visible
        new frmTitlePage().setVisible(true);
        // Get rid of this frame, making the title page frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        // Make the roulette info visible
        new frmRouletteInfo().setVisible(true);
        // Get rid of this frame, making the roulette info frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinActionPerformed
        // TODO add your handling code here:
        
        // the user wants to spin
        // Check if the string is not valid
        if (!isValid(txtUserChoice.getText().toLowerCase(), STRVALIDINPUT)) 
        {
            // display a error 
            lblResult.setText("Error: Please enter a valid choice. red,black,evens,odds, or a number from 0 to 36 or 00");
            //stop
            return;
        }
        // check that the bet is a positive int
        if (!isPosInt(txtUserBet.getText()))
        {
            // display a error message
            lblResult.setText("Error: Please enter a positive integer value for your bet.");
            // stop
            return;
        }
        
        
        // generate the winning number
        int intWinningNum = (int)(Math.random() * 38); // 37 is 00
        // store the string of a winning num
        String strWinningNum = intWinningNum+"";
        // if number is 00 then set it as that
        if (intWinningNum == 37) strWinningNum = "00";
        // store the past winnings
        int intWinMultiplier = userWinnings(txtUserChoice.getText().toLowerCase(), intWinningNum, INTREDNUMS, INTBLACKNUMS);
        // if the user didnt win display a lose message
        if (intWinMultiplier == -1) lblResult.setText("You lost your bet. The winning number was " + strWinningNum);
        // if they won on parity display a win message
        else if (intWinMultiplier == 1) lblResult.setText("You won your bet, and doubled your bet! The winning number was " + strWinningNum);
        // if they they won on numbers display a win message but diferrent
        else if (intWinMultiplier == 35) lblResult.setText("You won your bet, and increased your bet by 35 fold! The winning number was " + strWinningNum);
        // Increase the user's money
        intUserMoney += intWinMultiplier * Integer.parseInt(txtUserBet.getText());
        
        // display the user's money
        lblMoney.setText("Money: $"+intUserMoney);
    }//GEN-LAST:event_btnSpinActionPerformed

    private void txtUserBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserBetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserBetActionPerformed

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
            java.util.logging.Logger.getLogger(frmRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRoulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRoulette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnSpin;
    private javax.swing.JLabel lblBetAmountTitle;
    private javax.swing.JLabel lblExplanation;
    private javax.swing.JLabel lblExplanation2;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblRouletteImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtUserBet;
    private javax.swing.JTextField txtUserChoice;
    // End of variables declaration//GEN-END:variables
}
