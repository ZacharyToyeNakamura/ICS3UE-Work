/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package u3summativetoye.nakamurazachary;
import java.text.DecimalFormat;
/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 15, 2023
 * 
 * A short program to make a GUI that plays rock, paper scissors with the user n times and outputs stats.
 * This is assuming the user will not play more than 1000 rounds at once.(out of memory in the storage arrays) 
 * 
 * I tried turning The output for display into a method but it just gave me errors
 * Possible Improvements: - Increased error handling, export storage arrays to a csv file maybe if they want to store the data?
 * 
 */
public class frmU3Summative extends javax.swing.JFrame {
    // Declare a constant for max rounds
    final int INTMAXROUNDS = 1000;
    // Declaring the decimal format (2 decimal points)
    DecimalFormat df2 = new DecimalFormat("0.00");
    
    // Declare a variable to hold the number of rounds left. defaults to 5.
    int intRoundsLeft = 5;
    // Declare a variable to hold the number of rounds total. Defaults to 5.
    int intRoundsTot = 5;
    // Declaring rock, paper and scissors in a string array
    String [] strRPS = {"rock","paper","scissors"};
    
    // Declare variables for wins, ties and losses, also rocks, papers and scissors played
    int intWins = 0, intTies = 0, intLosses = 0, intRocks = 0, intPapers = 0, intScissors = 0;
    
    // Declare a array that holds the user and computers past objects. Also the results of the past games. I assume no user will play >1000 rounds
    int [] intUsersPastObj = new int[INTMAXROUNDS], intComputerPastObj = new int[INTMAXROUNDS], intPastResults = new int[INTMAXROUNDS];
    
    /**
     * This method compares the computer's and user's choice and finds out who won.
     * 
     * @param intComputerObj The computer's object number, where the object is intRPS[intComputerObj]
     * @param intUserObj     The user's object number, where the object is intRPS[intUserObj]
     * @return 0 if the computer won, 1 if the user won, and 2 if they tied
     */
    public static int whoWon(int intUserObj, int intComputerObj)
    {
        // Compare them to see who won this round
        // RPS
        // Paper beats rock     1 > 0
        // Scissors beats paper 2 > 1
        // rock beats scissors  0 > 2
        
        // 0 means compter wins, 1 means player wins, 2 means a tie, -1 means undefined
        
        // If they are equal, then tie
        if (intUserObj == intComputerObj) return 2;
        // User's object has a higher number than the computer
        else if (intUserObj > intComputerObj)
        {
            // 2 > 0 but it doesn't win so if statements solve this
            // If the user plays scissors while the compter plays rock, the computer wins.
            if (intUserObj == 2 && intComputerObj == 0) return 0;
            // otherwise the player wins. (cases are  computer has paper and player has scissors) 2 > 1
            // and (computer has rock and player has paper) 1 > 0
            else return 1;
        }
        // If the computer's object has a higher number than the user
        else if (intUserObj < intComputerObj)
        {
            // If the computer played scissors, and the user played rock the player wins
            if (intUserObj == 0 && intComputerObj == 2) return 1;
            // otherwise the computer wins. (cases are  player has paper and computer has scissors) 1 < 2
            // and (player has rock and computer has paper) 0 < 1
            else return 0;
        }
        // There has been a error somehow, and a if statement didn't trigger properly
        return -1;
    }
    
    /**
     * Creates new form frmU3Summative
     */
    public frmU3Summative() {
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
        lblNumRoundsTitle = new javax.swing.JLabel();
        btnConfirmNumRounds = new javax.swing.JButton();
        lblNumRoundsErrorMsg = new javax.swing.JLabel();
        lblRoundTitle = new javax.swing.JLabel();
        txtUsersObject = new javax.swing.JTextField();
        btnConfirmChoice = new javax.swing.JButton();
        lblObjectErrorMsg = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblStaticsticsTitle = new javax.swing.JLabel();
        lblScissorsPlayed = new javax.swing.JLabel();
        lblRocksPlayed = new javax.swing.JLabel();
        lblPapersPlayed = new javax.swing.JLabel();
        lblWins = new javax.swing.JLabel();
        lblTies = new javax.swing.JLabel();
        lblLosses = new javax.swing.JLabel();
        lblWinPercent = new javax.swing.JLabel();
        lblTiePercent = new javax.swing.JLabel();
        lblLossPercent = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        txtNumRounds = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTitle.setText("Rock, Paper, Scissors!");

        lblNumRoundsTitle.setText("Enter the number of rounds of RPS you want to play against the computer");

        btnConfirmNumRounds.setText("Play!");
        btnConfirmNumRounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmNumRoundsActionPerformed(evt);
            }
        });

        lblRoundTitle.setText("Round <n>! Enter your object and click the button below");

        txtUsersObject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnConfirmChoice.setText("Enter");
        btnConfirmChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmChoiceActionPerformed(evt);
            }
        });

        lblResult.setText("Round n: Computer played <object>. You played <object>. <Computer/Player> Won!");

        lblStaticsticsTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblStaticsticsTitle.setText("RPS Staticstics");

        lblScissorsPlayed.setText("Number of times Scissors have been played: ");

        lblRocksPlayed.setText("Number of times Rock has been played: ");

        lblPapersPlayed.setText("Number of times Paper has been played: ");

        lblWins.setText("Wins: ");

        lblTies.setText("Ties:");

        lblLosses.setText("Losses: ");

        lblWinPercent.setText("Win %:");

        lblTiePercent.setText("Tie %:");

        lblLossPercent.setText("Loss %:");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtNumRounds.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumRounds.setText("5");
        txtNumRounds.setToolTipText("");
        txtNumRounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumRoundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsersObject, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmChoice)
                        .addGap(18, 18, 18)
                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblStaticsticsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblScissorsPlayed, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(lblPapersPlayed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblRocksPlayed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblLosses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(lblTies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblWins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblTiePercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblWinPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblLossPercent, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))))
                            .addComponent(lblRoundTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmNumRounds))
                            .addComponent(lblNumRoundsTitle)
                            .addComponent(lblNumRoundsErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblObjectErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(lblNumRoundsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmNumRounds)
                    .addComponent(txtNumRounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumRoundsErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRoundTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsersObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmChoice)
                    .addComponent(lblResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObjectErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStaticsticsTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWins)
                    .addComponent(lblWinPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiePercent)
                    .addComponent(lblTies, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosses)
                    .addComponent(lblLossPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRocksPlayed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPapersPlayed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScissorsPlayed)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmNumRoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmNumRoundsActionPerformed
        // TODO add your handling code here:
        // Make sure that it's a int (otherwise will throw a error that I don't know how to handle)
        if(Integer.parseInt(txtNumRounds.getText()) > 0) 
        {
            // Set the total rounds and the default rounds to whatever the user entered, I think this double equals works
            intRoundsLeft = intRoundsTot = Integer.parseInt(txtNumRounds.getText());
            // Reset everything
            intWins = intTies = intLosses = intRocks = intPapers = intScissors = 0;
            // reset everything to -1 meaning undefined
            for (int i = 0; i < INTMAXROUNDS; i++) intUsersPastObj[i] = intComputerPastObj[i] = intPastResults[i] = -1;
            
            // Don't let them change the number of rounds anymore
            btnConfirmNumRounds.setVisible(false);
        }
        // if it's not right, display a error message
        else lblNumRoundsErrorMsg.setText("ERROR: Number of rounds must be a positive integer amount.");
    }//GEN-LAST:event_btnConfirmNumRoundsActionPerformed

    private void btnConfirmChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmChoiceActionPerformed
        // TODO add your handling code here:
        // User clicks button to play a round
        
        // out of rounds
        if (intRoundsLeft <= 0)
        {
            // display a error message
            lblObjectErrorMsg.setText("This game is over, please enter the number of rounds you would like to play and click play!");
            // stop
            return;
        }
            
        // Declare a variable to hold the users choice as a number, and there choice is strRPS[intUserChoice]
        int intUserChoice = -1; // -1 for undefined
        
        // loop over rps to check which object the user choose.
        for (int i = 0; i < strRPS.length; i++) // screw it I'm using .length from now on, it's trival to learn
        {
            // If is one of the objects, set intUserChoice to the index of the object
            if (txtUsersObject.getText().toLowerCase().equals(strRPS[i])) intUserChoice = i;
        }
        // If the user's choice is invalid
        if (intUserChoice == -1)
        {
            // Display a error message for the user
            lblObjectErrorMsg.setText("ERROR: Object must \"rock\", \"paper\", or \"scissors\".");
            // It should stop running because the user didn't enter a valid choice
            // Never said we can't use return statements
            return;
        }
        // Basically the else statement from here on out
        
        // There is no error, so display nothing is the error field
        lblObjectErrorMsg.setText("");
        // store the users obj in a storage array
        intUsersPastObj[intRoundsLeft] = intUserChoice;
        // have the computer generate it's object using Math.random, store it in the its storage array
        intComputerPastObj[intRoundsLeft] = (int)(Math.random() * 3);
        // Compare the choices and store the result int the storage array.
        intPastResults[intRoundsLeft] = whoWon(intUserChoice, intComputerPastObj[intRoundsLeft]);
        
        // Display to the user the outcome of the round and what the computer played.
        if (intPastResults[intRoundsLeft] == 0) lblResult.setText("Round "+(intRoundsTot-intRoundsLeft+1)+": Computer played "+strRPS[intComputerPastObj[intRoundsLeft]]+". You played "+strRPS[intUserChoice]+". Computer Won!");
        // Else if the player won
        else if (intPastResults[intRoundsLeft] == 1) lblResult.setText("Round "+(intRoundsTot-intRoundsLeft+1)+": Computer played "+strRPS[intComputerPastObj[intRoundsLeft]]+". You played "+strRPS[intUserChoice]+". Player Won!");
        // Else if it's a tie
        else if (intPastResults[intRoundsLeft] == 2) lblResult.setText("Round "+(intRoundsTot-intRoundsLeft+1)+": Computer played "+strRPS[intComputerPastObj[intRoundsLeft]]+". You played "+strRPS[intUserChoice]+". You Tied!");
        // If it's not a result then display a error message
        else lblResult.setText("Error has occured !!!");
        
        //display the roound number
        if (intRoundsLeft != 1) lblRoundTitle.setText("Round "+(intRoundsTot-intRoundsLeft+2)+"! Enter your object and click the button below");
        // if it's the final round, then display the fact that there are no more rounds
        else lblRoundTitle.setText("No more rounds left!");
        // Now display stats to the user
        // Yes it's not efficent, and I store the extra information incase I want to expand this project.
        // Couldn't find a way to do it using a method.
        
        // Check if it's a rock
        if(intUsersPastObj[intRoundsLeft] == 0) intRocks++;
        // Check if it's a paper
        else if(intUsersPastObj[intRoundsLeft] == 1) intPapers++;
        // Check if it's a scissors
        else if(intUsersPastObj[intRoundsLeft] == 2) intScissors++;
        // Check if it's a rock
        if(intComputerPastObj[intRoundsLeft] == 0) intRocks++;
        // Check if it's a paper
        else if(intComputerPastObj[intRoundsLeft] == 1) intPapers++;
        // Check if it's a scissors
        else if(intComputerPastObj[intRoundsLeft] == 2) intScissors++;
        // Tally up wins, losses and ties
        if (intPastResults[intRoundsLeft] == 0) intLosses++;
        // Tally up wins, losses and ties
        else if (intPastResults[intRoundsLeft] == 1) intWins++;
        // Tally up wins, losses and ties
        else if (intPastResults[intRoundsLeft] == 2) intTies++;

        // Display the stats to the user
        lblWins.setText("Wins: " + intWins);
        // Display the stats to the user
        lblLosses.setText("Losses: " + intLosses);
        // Display the stats to the user
        lblTies.setText("Ties: " + intTies);
        // Display the stats to the user
        lblWinPercent.setText("Win %: " + df2.format((double)intWins/(double)(intWins+intLosses+intTies)*100.0)+"%");
        // Display the stats to the user
        lblLossPercent.setText("Loss %: " + df2.format((double)intLosses/(double)(intWins+intLosses+intTies)*100.0)+"%");
        // Display the stats to the user
        lblTiePercent.setText("Tie %: " + df2.format((double)intTies/(double)(intWins+intLosses+intTies)*100.0)+"%");
        // Display the stats to the user
        lblRocksPlayed.setText("Number of times Rock has been played: " + intRocks);
        // Display the stats to the user
        lblPapersPlayed.setText("Number of times Paper has been played: " + intPapers);
        // Display the stats to the user
        lblScissorsPlayed.setText("Number of times Scissors has been played: " + intScissors);

        
        intRoundsLeft--;
        // If the end of the rounds is done, then make the set number of rounds to visible again
        if (intRoundsLeft == 0) btnConfirmNumRounds.setVisible(true);
        
    }//GEN-LAST:event_btnConfirmChoiceActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        // Reset everything
        intWins = intTies = intLosses = intRocks = intPapers = intScissors = 0;
        // reset everything to -1 meaning undefined
        for (int i = 0; i < INTMAXROUNDS; i++) intUsersPastObj[i] = intComputerPastObj[i] = intPastResults[i] = -1;
        // reset the num of rounds to 5
        intRoundsTot = 5; intRoundsLeft = 5;
        // RESET DISPLAY STATS
        // Display the stats to the user
        lblWins.setText("Wins: 0");
        // Display the stats to the user
        lblLosses.setText("Losses: 0");
        // Display the stats to the user
        lblTies.setText("Ties: 0");
        // Display the stats to the user
        lblWinPercent.setText("Win %: 0.00");
        // Display the stats to the user
        lblLossPercent.setText("Loss %: 0.00");
        // Display the stats to the user
        lblTiePercent.setText("Tie %: 0.00");
        // Display the stats to the user
        lblRocksPlayed.setText("Number of times Rock has been played: 0");
        // Display the stats to the user
        lblPapersPlayed.setText("Number of times Paper has been played: 0");
        // Display the stats to the user
        lblScissorsPlayed.setText("Number of times Scissors has been played: 0");
        // Reset the result text
        lblResult.setText("Round n: Computer played <object>. You played <object>. <Computer/Player> Won!");
        // There is no error, so display nothing is the error field
        lblObjectErrorMsg.setText("");
        // There is no error, so display nothing is the error field
        lblNumRoundsErrorMsg.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtNumRoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumRoundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumRoundsActionPerformed

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
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmU3Summative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmChoice;
    private javax.swing.JButton btnConfirmNumRounds;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblLossPercent;
    private javax.swing.JLabel lblLosses;
    private javax.swing.JLabel lblNumRoundsErrorMsg;
    private javax.swing.JLabel lblNumRoundsTitle;
    private javax.swing.JLabel lblObjectErrorMsg;
    private javax.swing.JLabel lblPapersPlayed;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblRocksPlayed;
    private javax.swing.JLabel lblRoundTitle;
    private javax.swing.JLabel lblScissorsPlayed;
    private javax.swing.JLabel lblStaticsticsTitle;
    private javax.swing.JLabel lblTiePercent;
    private javax.swing.JLabel lblTies;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWinPercent;
    private javax.swing.JLabel lblWins;
    private javax.swing.JTextField txtNumRounds;
    private javax.swing.JTextField txtUsersObject;
    // End of variables declaration//GEN-END:variables
}
