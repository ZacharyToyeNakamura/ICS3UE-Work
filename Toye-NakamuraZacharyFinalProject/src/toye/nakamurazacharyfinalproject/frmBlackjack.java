/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toye.nakamurazacharyfinalproject;

/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 19 2023
 * This program lets the user play blackjack against the computer.
 * 
 * Some things to note:
 * The dealer will stand when they have 17 or more.
 * The dealer can have a max of 9 cards if they get [2,2,2,2,3,3],1,1,x the [] cards in any order for a total of 14 + 1 + 1 = 16 then the last card will force the dealer to stand
 * 
 * The player can have a max of 5 cards (because of the 5 card rule)
 * 
 * 
 * Found out how to change icons 
 * label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/IMAGE NAME"))); // NOI18N
 * Found it in the pre-generated code
 * 
 * I wrote most of this while being in a flow state, so when trying to reading it user and player both refer to the person using the program
 * left hand, and main hand are the same. Split hand and right hand are the same.
 * There may be redundant variables and unoptimized parts.
 */ 
public class frmBlackjack extends javax.swing.JFrame {

    /**
     * Creates new form frmBlackjack
     */
    
    // Declare a string to hold the deck, this will be used to match a card string to it's icon
    final String [] STRFIXEDDECK = {
        "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK", "HA",
        "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "SA",
        "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "DA",
        "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK", "CA",
    };
    // Declare a string to hold the icon paths of all of the cards for displaying the icones
    final String [] STRPATHS = {
        "/toye/nakamurazacharyfinalproject/Hearts2.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts3.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts4.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts5.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts6.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts7.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts8.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts9.jpg",
        "/toye/nakamurazacharyfinalproject/Hearts10.jpg",
        "/toye/nakamurazacharyfinalproject/HeartsJ.jpg",
        "/toye/nakamurazacharyfinalproject/HeartsQ.jpg",
        "/toye/nakamurazacharyfinalproject/HeartsK.jpg",
        "/toye/nakamurazacharyfinalproject/HeartsA.jpg",
        "/toye/nakamurazacharyfinalproject/Spades2.jpg",
        "/toye/nakamurazacharyfinalproject/Spades3.jpg",
        "/toye/nakamurazacharyfinalproject/Spades4.jpg",
        "/toye/nakamurazacharyfinalproject/Spades5.jpg",
        "/toye/nakamurazacharyfinalproject/Spades6.jpg",
        "/toye/nakamurazacharyfinalproject/Spades7.jpg",
        "/toye/nakamurazacharyfinalproject/Spades8.jpg",
        "/toye/nakamurazacharyfinalproject/Spades9.jpg",
        "/toye/nakamurazacharyfinalproject/Spades10.jpg",
        "/toye/nakamurazacharyfinalproject/SpadesJ.jpg",
        "/toye/nakamurazacharyfinalproject/SpadesQ.jpg",
        "/toye/nakamurazacharyfinalproject/SpadesK.jpg",
        "/toye/nakamurazacharyfinalproject/SpadesA.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond2.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond3.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond4.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond5.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond6.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond7.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond8.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond9.jpg",
        "/toye/nakamurazacharyfinalproject/Diamond10.jpg",
        "/toye/nakamurazacharyfinalproject/DiamondJ.jpg",
        "/toye/nakamurazacharyfinalproject/DiamondQ.jpg",
        "/toye/nakamurazacharyfinalproject/DiamondK.jpg",
        "/toye/nakamurazacharyfinalproject/DiamondA.jpg",
        "/toye/nakamurazacharyfinalproject/Club2.jpg",
        "/toye/nakamurazacharyfinalproject/Club3.jpg",
        "/toye/nakamurazacharyfinalproject/Club4.jpg",
        "/toye/nakamurazacharyfinalproject/Club5.jpg",
        "/toye/nakamurazacharyfinalproject/Club6.jpg",
        "/toye/nakamurazacharyfinalproject/Club7.jpg",
        "/toye/nakamurazacharyfinalproject/Club8.jpg",
        "/toye/nakamurazacharyfinalproject/Club9.jpg",
        "/toye/nakamurazacharyfinalproject/Club10.jpg",
        "/toye/nakamurazacharyfinalproject/ClubJ.jpg",
        "/toye/nakamurazacharyfinalproject/ClubQ.jpg",
        "/toye/nakamurazacharyfinalproject/ClubK.jpg",
        "/toye/nakamurazacharyfinalproject/ClubA.jpg",
        "/toye/nakamurazacharyfinalproject/faceDown.jpg",
    };
    
    // Declare a variable to hold the current deck
    String [] strDeck = {
        "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK", "HA",
        "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "SA",
        "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "DA",
        "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK", "CA",
    };
    // Declare a variable to hold if the game is going on
    boolean boolIsPlaying = false;
    // Declare a variable to hold the user's money
    int intUserMoney = 100;
    // Declare a variable to hold the user's bet
    int intUserBet = 0;
    // Declare a var to hold the user's split bet (the bet on the split hand)
    int intSplitBet = 0;
    // Declare a variable to hold the user's total
    int intUserTot = 0;
    // Declare a variable to hold the user's split total
    int intUserSplitTot = 0;
    // Declare a variable to hold the dealer's total
    int intDealerTot = 0;
    // Declare a variable to hold the user's number of aces
    int intUserAces = 0;
    // Declare a variable to hold the user's split number of aces
    int intSplitAces = 0;
    // Declare a variable to hold the number of aces the dealer has
    int intDealerAces = 0;
    
    
    // Declare a variable to hold the user's hand
    String [] strUserHand = new String[5];
    // Declare a variable to hold the user's split hand
    String [] strUserSplitHand = new String[5];
    // Declare a variable to hold the dealer's split hand
    String [] strDealerHand = new String[10]; // extra space just incase something goes wrong
    
    // declare the number of cards the user has
    int intUserNumCards = 0;
    // declare the number of cards the users split hand has
    int intSplitNumCards = 0;
    // declare the number of cards the dealer has
    int intDealerNumCards = 0;
    // declare a variable to track if the other hand is confirmed yet (aka it's finished)
    boolean boolSplitConfirmed = false;
    // Declare a variable to track if the main hand has been confirmed yet (aka it's finished)
    boolean boolMainConfirmed = false;
    // Declare a variable to track if the user has raised their right hand yet
    boolean boolSplitRaised = false;
    // Declare a variable to track if the user has raised their left/main hand yet
    boolean boolMainRaised = false;
    // Declare a variable to track if the main hand has won by the 5 card rule
    boolean boolUser5Card = false;
    // Declare a variable to track if the split hand has won by the 5 card rule
    boolean boolSplit5Card = false;
    
    // Declare a variable to track if the main hand is standing, used to calc for the dealer if right hand goes bust
    boolean boolMainStanding = false;
    // Declare a variable to track if the right hand is standing, used to determine whether to calc for the dealer if left hand goes bust
    boolean boolSplitStanding = false;
    
    
    /**
     * This method will randomly shuffle a list that is passed into it (because I'm not sure if I'm allowed to use .shuffle() or a java equivalent)
     * It will not be completely random because I just can't do that
     * 
     * @param strDeck a array of strings
     * @return the array of strings but in a random order
     */
    public static String[] shuffle(String [] strDeck) {
        // Declare a variable that says how many times to shuffle
        int intShufflesCount = 3;
        // For extra randomness shuffle multiple times
        for (int intShuffles = 0; intShuffles < intShufflesCount; intShuffles++)
        {
            // for every card in the deck
            for (int i = 0; i < strDeck.length; i++) 
            {
                // Generate a random number between 0 and the 51, (equal chance of every card in the deck)
                int intRandSeed = (int)(Math.random() * strDeck.length);
                // Swap the cards in position i and RandSeed
                // Store the string at randseed in a temp variable
                String strTemp = strDeck[intRandSeed];
                // Set the card at randseed to i
                strDeck[intRandSeed] = strDeck[i];
                // Set the card that was at i to the card that was at randseed
                strDeck[i] = strTemp;
            }
        }
        
        // return the deck
        return strDeck;
    }
    
    
    /**
     * This method tests to see if a string is valid (a positive int)
     * @param strValidation Any string - It will be checked to see if it's a positive int
     * @return True if the input string is valid, else it will output false
     */
    public static boolean isValid (String strValidation) 
    {
        try 
        {
            // If it's a positive int return true
            if (Integer.parseInt(strValidation) > 0) return true;
            // else return false
            return false;
        }
        // if there is a error
        catch (Exception InputFormatException)
        {
            // return false;
            return false;
        }
    }
    
    /**
     * This method removes the first element of the deck
     * @param strDeck An array of strings, which in this case will always be strDeck
     * @return The same array but with all of the elements shifted forwards once, putting the last element at the back (just in case, but it will probably never be used)
     */
    public static String [] pop(String [] strDeck) 
    {
        // Store the first element for later
        String strTemp = strDeck[0];
        // Shift all of the elements forwards once
        for (int i = 1; i < strDeck.length; i++) strDeck[i-1] = strDeck[i];
        // At the last element to the back
        strDeck[strDeck.length - 1] = strTemp;
        // return the array of strings back
        return strDeck;
    }
    
    
    /**
     * Takes in a card that is found in the deck and returns the path file
     * @param strCard A 2 or 3 character long string that can be found in STRFIXEDDECK
     * @param STRFIXEDDECK The list of all of the card ids that are used in the game
     * @param STRPATHS The list of all of the file paths to the icons that are used, STRPATHS[i] has the icon for STRFIXEDDECK[i]
     * @return the file path of the icon that represents the card, if it can't find the card it returns error
     */
    public static String findPath(String strCard, String [] STRFIXEDDECK, String [] STRPATHS)
    {
        // No dictionary or map data struct and I'm not dealing with hash collisions today, so it's inefficent
        
        // For all of the elements in fixed deck, if the passed in card is equal to it return the path stored at paths[i]
        for (int i = 0; i < STRFIXEDDECK.length; i++) if (STRFIXEDDECK[i].equals(strCard)) return STRPATHS[i];
        // If this function was called and it doesn't find the card in STRFIXEDDECK then return a error code.
        return "ERROR";
    }
    
    
    /**
     * This function returns the value of the card passed to it
     * @param strCard A 2 or 3 character string that can be found in STRRIXEDDECK
     * @return A integer between 1 and 11 that it the cards value, -1 returned means a error
     */
    public static int getValue(String strCard) 
    {
        try 
        {
            // If the length of the string is 2 then check the last character for a digit, if found return the int
            if (strCard.length() == 2) return Integer.parseInt(strCard.substring(1,2));
            // If the lenght of the string is 3 long then chec the last 2 characters for 10, if found return the int
            else if (strCard.length() == 3) return Integer.parseInt(strCard.substring(1,3));
        }
        // If there is a error
        catch (Exception InputFormatException)
        {
            // If the card is a face card then return 10
            if(strCard.substring(1,2).equals("J") || strCard.substring(1,2).equals("Q") || strCard.substring(1,2).equals("K")) return 10;
            // return 11 for aces, but we should track them aswell to subtract 10 if they are going over.
            if(strCard.substring(1,2).equals("A")) return 11;
        }
        // If nothing has been returned then there is a error and return a error flag
        return -1;
    }
    
    
    /**
     * This method returns if a hand of 2 cards are splittable. Meaning the have the same number / face eg H9, C9 == true but HK, H2 == false
     * @param strCard1 A string (that can be found in STRFIXEDDECK)
     * @param strCard2 A string (that can be found in STRFIXEDDECK)
     * @return If the cards are the same after the first letter
     */
    public static boolean splittable(String strCard1, String strCard2) 
    {
        // Return true if the rank of the cards are the same.
        return strCard1.substring(1,strCard1.length()).equals(strCard2.substring(1,strCard2.length()));
    }
            
    public frmBlackjack() {
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
        btnBack = new javax.swing.JButton();
        lblExplainationTitle = new javax.swing.JLabel();
        lblExplanation1 = new javax.swing.JLabel();
        lblExplanation2 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        lblDealersHandTitle = new javax.swing.JLabel();
        lblDCard1 = new javax.swing.JLabel();
        lblDCard2 = new javax.swing.JLabel();
        lblDCard3 = new javax.swing.JLabel();
        lblDCard4 = new javax.swing.JLabel();
        lblDCard5 = new javax.swing.JLabel();
        lblDCard6 = new javax.swing.JLabel();
        lblDCard7 = new javax.swing.JLabel();
        lblDCard8 = new javax.swing.JLabel();
        lblDCard9 = new javax.swing.JLabel();
        lblGoToBJStats = new javax.swing.JButton();
        lblDealerTot = new javax.swing.JLabel();
        lblPlayerHandTitle = new javax.swing.JLabel();
        lblPlayerTot = new javax.swing.JLabel();
        lblPCard1 = new javax.swing.JLabel();
        lblPCard2 = new javax.swing.JLabel();
        lblPCard3 = new javax.swing.JLabel();
        lblPCard4 = new javax.swing.JLabel();
        lblPCard5 = new javax.swing.JLabel();
        lblSplitHandTitle = new javax.swing.JLabel();
        lblSplitTot = new javax.swing.JLabel();
        lblSCard1 = new javax.swing.JLabel();
        lblSCard2 = new javax.swing.JLabel();
        lblSCard3 = new javax.swing.JLabel();
        lblSCard4 = new javax.swing.JLabel();
        lblSCard5 = new javax.swing.JLabel();
        btnHit = new javax.swing.JButton();
        btnStand = new javax.swing.JButton();
        btnSplit = new javax.swing.JButton();
        btnRaise = new javax.swing.JButton();
        btnSplitStand = new javax.swing.JButton();
        btnSplitHit = new javax.swing.JButton();
        btnSplitRaise = new javax.swing.JButton();
        lblErrorMsg = new javax.swing.JLabel();
        lblExplanation3 = new javax.swing.JLabel();
        lblExplanation4 = new javax.swing.JLabel();
        lblExplanation5 = new javax.swing.JLabel();
        txtBet = new javax.swing.JTextField();
        lblBetAmountTitle = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblOutcome = new javax.swing.JLabel();
        lblUserHandErrorMsg = new javax.swing.JLabel();
        lblSplitHandErrorMsg = new javax.swing.JLabel();
        lblPlayerBetAmount = new javax.swing.JLabel();
        lblSplitBetAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTitle.setText("Welcome to Blackjack!");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblExplainationTitle.setText("Blackjack is a game where you try to increase the value of your hand while not going over 21");

        lblExplanation1.setText("You win if your total is higher than the dealers (without going over 21) then you win. The dealer wins on ties.");

        lblExplanation2.setText("The value of your hand is equal to the sum of the face values of your cards (with all face cards being 10). Aces are worth 1 or 11.");

        btnPlay.setText("Play!");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        lblDealersHandTitle.setText("Dealer's hand");

        lblGoToBJStats.setText("Learn more!");
        lblGoToBJStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblGoToBJStatsActionPerformed(evt);
            }
        });

        lblDealerTot.setText("Total:");

        lblPlayerHandTitle.setText("Your hand");

        lblPlayerTot.setText("Total:");

        lblSplitHandTitle.setText("Your second hand");

        lblSplitTot.setText("Total:");

        btnHit.setText("Hit");
        btnHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitActionPerformed(evt);
            }
        });

        btnStand.setText("Stand");
        btnStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStandActionPerformed(evt);
            }
        });

        btnSplit.setText("Split");
        btnSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSplitActionPerformed(evt);
            }
        });

        btnRaise.setText("Raise");
        btnRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseActionPerformed(evt);
            }
        });

        btnSplitStand.setText("Stand");
        btnSplitStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSplitStandActionPerformed(evt);
            }
        });

        btnSplitHit.setText("Hit");
        btnSplitHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSplitHitActionPerformed(evt);
            }
        });

        btnSplitRaise.setText("Raise");
        btnSplitRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSplitRaiseActionPerformed(evt);
            }
        });

        lblExplanation3.setText("After getting your first 2 cards you can choose to raise (before hitting or standing), which doubles your bet. If your first 2 cards are the same rank you can \"split\".");

        lblExplanation4.setText("Spliting gives you 2 hands which are independant, and are both played against the dealer. You must finish playing both hands before the dealer plays.");

        lblExplanation5.setText("Enter a bet below and hit play to get started. After playing a few rounds click Learn More! to learn about the odds.");

        txtBet.setText("5");
        txtBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBetActionPerformed(evt);
            }
        });

        lblBetAmountTitle.setText("Bet Amount");

        lblMoney.setText("Money: $100");

        lblOutcome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPlayerBetAmount.setText("Bet Amount: $");

        lblSplitBetAmount.setText("Bet Amount: $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGoToBJStats))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHit)
                                .addGap(31, 31, 31)
                                .addComponent(btnStand)
                                .addGap(32, 32, 32)
                                .addComponent(btnRaise)
                                .addGap(18, 18, 18)
                                .addComponent(btnSplit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlayerBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblUserHandErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSplitHandErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSplitHandTitle)
                                        .addGap(36, 36, 36)
                                        .addComponent(lblSplitTot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblSCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSplitHit))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(btnSplitStand)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnSplitRaise))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblSCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblSCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblSplitBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblSCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblSCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDealersHandTitle)
                                .addGap(18, 18, 18)
                                .addComponent(lblDealerTot, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlayerHandTitle)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPlayerTot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDCard9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBetAmountTitle)
                                    .addComponent(txtBet, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(569, 569, 569))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPlay)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(lblOutcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitle)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblExplainationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblExplanation3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblExplanation4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblExplanation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblExplanation2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExplanation5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblExplainationTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExplanation5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBetAmountTitle)
                    .addComponent(lblMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDealersHandTitle)
                    .addComponent(lblDealerTot))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDCard9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDCard6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDCard7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDCard8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPlayerHandTitle)
                                .addComponent(lblPlayerTot))
                            .addComponent(lblPlayerBetAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPCard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSplitHandTitle)
                            .addComponent(lblSplitTot)
                            .addComponent(lblSplitBetAmount))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSCard1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lblSCard5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSCard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSCard3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSCard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHit)
                    .addComponent(btnStand)
                    .addComponent(btnSplit)
                    .addComponent(btnRaise)
                    .addComponent(btnSplitHit)
                    .addComponent(btnSplitStand)
                    .addComponent(btnSplitRaise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSplitHandErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserHandErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGoToBJStats)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        // The user wants to go back to the main screen
        
        // Set the title frame to visible
        new frmTitlePage().setVisible(true);
        // Get rid of this frame, making the blackjack frame the current "main" frame.
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitActionPerformed
        // TODO add your handling code here:
        
        // If the user hasn't clicked play
        if (!boolIsPlaying)
        {
            // Display a error message
            lblErrorMsg.setText("Error: please click play before using hit. The game hasn't begun yet.");
            // Stop
            return;
        }
        // If the hand is already finished
        if (boolMainConfirmed)
        {
            // Display a error msg
            lblUserHandErrorMsg.setText("Error: This hand is already finished.");
            // stop
            return;
        }
        
        // The user want another card
        
        // Add the card to their hand
        strUserHand[intUserNumCards] = strDeck[0];
        // Pop the deck
        pop(strDeck);
        // Add the values of the cards to the total of each hand
        int intTemp = getValue(strUserHand[intUserNumCards]);
        // If its a ace increase the number of aces the user has
        if (intTemp == 11) intUserAces++;
        // Increase the user's total by the value of their card
        intUserTot += intTemp;
        // increase the number of cards the user has
        intUserNumCards++;

        // Update the user's total
        lblPlayerTot.setText("Total: " + intUserTot);
        // Display the user's new card (by brute force)
        // If the user has more than 0 cards, display the first card
        if (intUserNumCards > 0) lblPCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[0], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 1 card, display the second card
        if (intUserNumCards > 1) lblPCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[1], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 2 cards, display the third card
        if (intUserNumCards > 2) lblPCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[2], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 3 cards, display the 4th card
        if (intUserNumCards > 3) lblPCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[3], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 4 cards  , display the 5ht card
        if (intUserNumCards > 4) lblPCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[4], STRFIXEDDECK, STRPATHS))));
        
        // If the user's total is over 21, but has a ace left, use it and reduce the total by 21
        while (intUserTot > 21 && intUserAces > 0)
        {
            // Reduce the number of aces that can subtract 10
            intUserAces--;
            // subtract 10 from the user's total
            intUserTot -= 10;
            // Display the user's total
            lblPlayerTot.setText("Total: " + intUserTot);
        }
        // check if the user went bust
        if (intUserTot > 21) 
        {
            // subtract the money from their total
            intUserMoney -= intUserBet;
            // Display a lose message
            if (intSplitNumCards == 0) lblOutcome.setText("You went bust and lost.");
            // display different message for if you have a split
            else lblOutcome.setText("Your left hand went bust and lost.");
            // display the user's new total
            lblPlayerTot.setText("Total: " + intUserTot);
            // Display the user's updated money
            lblMoney.setText("Money: $"+intUserMoney);

            // The main is confirmed and finished
            boolMainConfirmed = true;

            // If the split is finished or there is no split
            if (boolSplitConfirmed || intSplitNumCards == 0)
            {
                // Display the dealer's total
                lblDealerTot.setText("Total: "+intDealerTot);
                // display the dealers first card
                lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
                // Set playing to false because the game is over
                boolIsPlaying = false;
                // Set the play button to visible
                btnPlay.setVisible(true);
            }
        }
        // other wise check for the 5 card rule
        else 
        {
            // if the user has 5 cards that are = to 21 or under
            if (intUserNumCards == 5)
            {
                // set the user 5 card rule to true
                boolUser5Card = true;
                // give the user money for winning
                intUserMoney += intUserBet;
                // The main hand is now complete
                boolMainConfirmed = true;
                // if there is no split hand
                if (intSplitNumCards == 0) 
                {
                    // display message
                    lblOutcome.setText("You have gotten 5 cards without going bust. You won!");
                    // no longer playing as the round is over due to winning
                    boolIsPlaying = false;
                    // show the play button
                    btnPlay.setVisible(true);
                    System.out.println("HERE");
                }
                // else just display the message
                else 
                {
                    lblOutcome.setText("You have gotten 5 cards in your left hand without going bust. You won (the left hand)!");
                    // If the other hand is done the we are no longer playing
                    if (boolSplitConfirmed == true)
                    {
                        // not playing anymore
                        boolIsPlaying = false;
                        // let the user click play again
                        btnPlay.setVisible(true);
                    }
                }
            }
        }
        
        // if the other hand is standing
        if (!boolSplitStanding || !boolMainConfirmed) return;
        // otherwise hand the dealer play agianst the split hand
        // Otherwise the computer will play
        // while the dealer has less than 17 keep drawing
        while (intDealerTot < 17) {
            // Add a card to the dealer's hand
            strDealerHand[intDealerNumCards] = strDeck[0];
            // pop the top of the deck
            pop(strDeck);
            // add the value of the dealers new card
            intTemp = getValue(strDealerHand[intDealerNumCards]);
            // If it's a ace increase the number of aces the dealer has
            if (intTemp == 11) intDealerAces++;
            // Increase the dealer's total by the value of their card
            intDealerTot += intTemp;

            // If the dealer would go bust but they have a ace, subtract 10, this is because a ace may be a 1 or 11
            if (intDealerTot > 21 && intDealerAces > 0)
            {
                // decrease the dealers total by 10
                intDealerTot -= 10;
                // decrease the number of aces that can be used
                intDealerAces--;
            }
            // Incraese the number of cards the dealer has
            intDealerNumCards++;
        }

        // Now check if the dealer when bust
        if (intDealerTot > 21) 
        {
            // Give the user the money they won
            intUserMoney += intSplitBet;
            // display a win message if no split
            lblOutcome.setText(lblOutcome.getText() + " The dealer went bust! You won!");
        }
        // Otherwise comapare the user's value to the dealer's value
        else 
        {
            // user only wins if they have a greater total. Dealer wins ties
            if (intDealerTot < intUserSplitTot)
            {
                // Give the user the money they won
                intUserMoney += intSplitBet;
                // display a win message
                lblOutcome.setText(lblOutcome.getText() + " Your right hand's total was higher than the dealers. You won!");
            }
            // Otherwise display a lose message
            else if(intDealerTot > intUserSplitTot)
            {
                // take the bet money away from the user
                intUserMoney -= intSplitBet;
                // display a lose message, if there was no split
                lblOutcome.setText(lblOutcome.getText() +" Your right hand's total was lower than the dealers. You lost!");
            }
            // display a different lose message for ties
            else
            {
                // take the bet money away from the user
                intUserMoney -= intSplitBet;
                // display a lose message
                lblOutcome.setText(lblOutcome.getText() +" Your right hand's lost, as it tied with the dealer. You lost!");
            }
        }
        // display the dealer's cards and total
        // Display the totals of the dealer and user
        lblDealerTot.setText("Total: " + intDealerTot);
        // Display the totals of the dealer and user
        lblPlayerTot.setText("Total: " + intUserTot);
        // Display the split total
        lblSplitTot.setText("Total: "+intUserSplitTot);


        // display the users money
        lblMoney.setText("Money: $" + intUserMoney);
        // Display the dealer's cards
        // If the dealer has more than 0 cards, display the first card
        if (intDealerNumCards > 0) lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 1 card, display the second card
        if (intDealerNumCards > 1) lblDCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[1], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 2 cards, display the third card
        if (intDealerNumCards > 2) lblDCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[2], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 3 cards, display the 4th card
        if (intDealerNumCards > 3) lblDCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[3], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 4 cards  , display the 5ht card
        if (intDealerNumCards > 4) lblDCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[4], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 5 cards, display the 6th card
        if (intDealerNumCards > 5) lblDCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[5], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 6 cards, display the 7th card
        if (intDealerNumCards > 6) lblDCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[6], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 7 cards, display the 8th card
        if (intDealerNumCards > 7) lblDCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[7], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 8 cards, display the 9th card
        if (intDealerNumCards > 8) lblDCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[8], STRFIXEDDECK, STRPATHS))));

        
    }//GEN-LAST:event_btnHitActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        
        // If the bet amount is invalid then display a error message
        if (!isValid(txtBet.getText())) 
        {
            // Display the error message
            lblErrorMsg.setText("Error: bet must be a positive integer amount.");
            // Stop
            return;
        }
        // Reset all of the variables
        intUserTot = 0;
        // Reset all of the variables
        intDealerTot = 0;
        // Reset all of the variables
        intUserSplitTot = 0;
        // Reset all of the variables
        intUserNumCards = 0;
        // Reset all of the variables
        intDealerNumCards = 0;
        // Reset all of the variables
        intSplitNumCards = 0;
        // Reset all of the variables
        for (int i = 0; i < strUserHand.length; i++) strUserHand[i] = "";
        // Reset all of the variables
        for (int i = 0; i < strUserSplitHand.length; i++) strUserSplitHand[i] = "";
        // Reset all of the variables
        for (int i = 0; i < strDealerHand.length; i++) strDealerHand[i] = "";
        // Reset all of the variables
        intUserAces = 0;
        // Reset all of the variables
        intDealerAces = 0;
        // Reset all of the variables
        intSplitAces = 0;
        // Reset all of the variables
        boolSplitConfirmed = false;
        // Reset all of the variables
        boolMainConfirmed = false;
        // reset the split bet
        intSplitBet = 0;
        // reset if they have raised split bet
        boolSplitRaised = false;
        // reset if they have raised main
        boolMainRaised = false;
        // reset all of the variables
        boolUser5Card = false;
        // reset all var
        boolSplit5Card = false;
        // reset all var
        boolSplitStanding = false;
        // reset
        boolMainStanding = false;
        
        // Reset icons
        // When giving setIcon a path that doesn't exist it doesn't display the icon so I assume null does the same thing
        lblDCard1.setIcon(null);
        // Reset icons
        lblDCard2.setIcon(null);
        // Reset icons
        lblDCard3.setIcon(null);
        // Reset icons
        lblDCard4.setIcon(null);
        // Reset icons
        lblDCard5.setIcon(null);
        // Reset icons
        lblDCard6.setIcon(null);
        // Reset icons
        lblDCard7.setIcon(null);
        // Reset icons
        lblDCard8.setIcon(null);
        // Reset icons
        lblDCard9.setIcon(null);
        // Reset icons
        lblPCard1.setIcon(null);
        // Reset icons
        lblPCard2.setIcon(null);
        // Reset icons
        lblPCard3.setIcon(null);
        // Reset icons
        lblPCard4.setIcon(null);
        // Reset icons
        lblPCard5.setIcon(null);
        // Reset icons
        lblSCard1.setIcon(null);
        // Reset icons
        lblSCard2.setIcon(null);
        // Reset icons
        lblSCard3.setIcon(null);
        // Reset icons
        lblSCard4.setIcon(null);
        // Reset icons
        lblSCard5.setIcon(null);
        // Reset the Display the totals of the dealer and user
        lblDealerTot.setText("Total: ?");
        // Reset the Display the totals of the dealer and user
        lblPlayerTot.setText("Total: ");
        // Reset the outcome
        lblOutcome.setText("");
        // Reset the error message
        lblErrorMsg.setText("");
        // Display the user's money
        lblMoney.setText("Money: $"+intUserMoney);
        // Reset user hand error message
        lblUserHandErrorMsg.setText("");
        // reset error msg
        lblSplitHandErrorMsg.setText("");
        // reset the bet amounts display
        lblPlayerBetAmount.setText("Bet Amount: $");
        // reset the bet amounts display
        lblSplitBetAmount.setText("Bet Amount: $");
        
        
        // Read in the user's bet
        intUserBet = Integer.parseInt(txtBet.getText());
        // display the user's bet
        lblPlayerBetAmount.setText("Bet Amount: $"+intUserBet);
        
        // Declare a variable that is the original deck
        String [] strTempDeck = {"H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK", "HA","S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "SA","D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "DA","C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK", "CA"};
        // Reset every element of the deck
        for (int i  = 0; i < strDeck.length; i++) strDeck[i] = strTempDeck[i];

        // Make the button invisible
        btnPlay.setVisible(false);
        // Set playing to true
        boolIsPlaying = true;
        // shuffle the deck
        strDeck = shuffle(strDeck);
        
        
        // Deal the first card to the user
        strUserHand[0] = strDeck[0];
        // pop the top of the deck
        pop(strDeck);
        // Deal the second card to the dealer
        strDealerHand[0] = strDeck[0];
        // pop the top of the deck
        pop(strDeck);
        // Deal the third card to the user
        strUserHand[1] = strDeck[0];
        // pop the top of the deck
        pop(strDeck);
        // Deal the fourth card to the dealer
        strDealerHand[1] = strDeck[0];
        // pop the top of the deck
        pop(strDeck);
        
        // Add the values of the cards to the total of each hand
        int intTemp = getValue(strUserHand[0]);
        // If its a ace increase the number of aces the user has
        if (intTemp == 11) intUserAces++;
        // Increase the user's total by the value of their card
        intUserTot += intTemp;
        // Add the values of the cards to the total of each hand
        intTemp = getValue(strUserHand[1]);
        // If its a ace increase the number of aces the user has
        if (intTemp == 11) intUserAces++;
        // Increase the user's total by the value of their card
        intUserTot += intTemp;
        
        // Add the values of the cards to the total of each hand
        intTemp = getValue(strDealerHand[0]);
        // If its a ace increase the number of aces the dealer has
        if (intTemp == 11) intDealerAces++;
        // Increase the dealer's total by the value of their card
        intDealerTot += intTemp;
        // Add the values of the cards to the total of each hand
        intTemp = getValue(strDealerHand[1]);
        // If its a ace increase the number of aces the dealer has
        if (intTemp == 11) intDealerAces++;
        // Increase the dealer's total by the value of their card
        intDealerTot += intTemp;
        
        
        // Check edge case of having 2 aces for the dealer and play
        if (intDealerTot > 21)
        {
            // decrease the number of aces that can subtract 10
            intDealerAces--;
            // subtract the 10 from the total
            intDealerTot -= 10;
        }
        // Check edge case of having 2 aces for the dealer and play
        if (intUserTot > 21)
        {
            // decrease the number of aces that can subtract 10
            intUserAces--;
            // subtract the 10 from the total
            intUserTot -= 10;
        }
        
        
        // Update the number of cards both the player and dealer has
        intUserNumCards = 2;
        // Update the number of cards both the player and dealer has
        intDealerNumCards = 2;
        
        
        // Reset the Display the totals of the dealer and user
        lblPlayerTot.setText("Total: " + intUserTot);
        // Now display cards to the user, would love to make this a method but I can't because static it says
        
        // Dealers first card is always face down
        lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toye/nakamurazacharyfinalproject/faceDown.jpg")));
        // Dealers second card, first find the path
        String strIconPath = findPath(strDealerHand[1], STRFIXEDDECK, STRPATHS);
        // If there is no error in finding the path then display it
        if (!strIconPath.equals("ERROR")) lblDCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(strIconPath)));
        // Else print a error message to console
        else System.out.println("ERROR: Dealer 2nd card not displayed properly, path of card ID not found");
        
        // Display the user's first card, first find the path
        strIconPath = findPath(strUserHand[0], STRFIXEDDECK, STRPATHS);
        // If there is no error in finding the path then display it
        if (!strIconPath.equals("ERROR")) lblPCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(strIconPath)));
        // Else print a error message to console
        else System.out.println("ERROR: User's 1st card not displayed properly, path of card ID not found");
        
        // Display the user's second card, first find the path
        strIconPath = findPath(strUserHand[1], STRFIXEDDECK, STRPATHS);
        // If there is no error in finding the path then display it
        if (!strIconPath.equals("ERROR")) lblPCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(strIconPath)));
        // Else print a error message to console
        else System.out.println("ERROR: User's 2nd card not displayed properly, path of card ID not found");
 

    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStandActionPerformed
        // TODO add your handling code here:
        
        // If the user hasn't clicked play
        if (!boolIsPlaying)
        {
            // Display a error message
            lblErrorMsg.setText("Error: please click play before using stand. The game hasn't begun yet.");
            // Stop
            return;
        }
        // If the hand is done
        if (boolMainConfirmed)
        {
            // display message
            lblUserHandErrorMsg.setText("Error: This hand is already completed. Please complete your other hand");
            // stop
            return;
        }
        
        // The main hand is now standing
        boolMainStanding = true;
        // The main hand is finished
        boolMainConfirmed = true;
        
        // If the split is done processing or there is no split
        if (boolSplitConfirmed || intSplitNumCards == 0) 
        {
            // The game is over so display the play button again
            btnPlay.setVisible(true);
            // The round is over now
            boolIsPlaying = false;
        }
        
        // Declare a variables to see if any of the hands are bust already
        boolean boolMainBust = (intUserTot > 21);
        // Declare a variables to see if any of the hands are bust already
        boolean boolSplitBust = (intUserSplitTot > 21);
        
        // if the user is bust on both hands
        // This is here because it looks better when the user just shows its hand when the player loses anyways instead of doing it "ai"
        if (boolSplitBust && boolMainBust)
        {
            // display lose message
            lblOutcome.setText("Both of your hands went bust. You lost!");
            // Show the dealers first card
            lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
            // stop, because there are no more hands that the dealer can play against
            return;
        }
        // if the user is already bust on left hand
        else if (boolMainBust) 
        {
            // display a lose message
            if (intSplitNumCards != 0) lblOutcome.setText("Your left hand went bust. You lost!");
            // display a different lose message if they dont have a split
            // This is here because it looks better when the user just shows its hand when the player loses anyways instead of doing it "ai"
            else 
            {
                // display lose message
                lblOutcome.setText("You went bust, you lost!");
                // Show the dealers first card
                lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
                // stop, because there is no split hand to check
                return;
            }
        }
        
        
        // Calculate the user's total and make the computer move.

        // If there is no split or the split hand is finished
        if (intSplitNumCards == 0 || boolSplitConfirmed) {
            // Otherwise the computer will play
            // while the dealer has less than 17 keep drawing
            while (intDealerTot < 17) {
                // Add a card to the dealer's hand
                strDealerHand[intDealerNumCards] = strDeck[0];
                // pop the top of the deck
                pop(strDeck);
                // add the value of the dealers new card
                int intTemp = getValue(strDealerHand[intDealerNumCards]);
                // If it's a ace increase the number of aces the dealer has
                if (intTemp == 11) intDealerAces++;
                // Increase the dealer's total by the value of their card
                intDealerTot += intTemp;

                // If the dealer would go bust but they have a ace, subtract 10, this is because a ace may be a 1 or 11
                if (intDealerTot > 21 && intDealerAces > 0)
                {
                    // decrease the dealers total by 10
                    intDealerTot -= 10;
                    // decrease the number of aces that can be used
                    intDealerAces--;
                }
                // Incraese the number of cards the dealer has
                intDealerNumCards++;
            }

            // Now check if the dealer when bust
            if (intDealerTot > 21) 
            {
                // if they aren't but and no split and the five card rule isn't used
                if (!boolMainBust && intSplitNumCards == 0 && !boolUser5Card)
                {
                    // Give the user the money they won
                    intUserMoney += intUserBet;
                    // display a win message if no split
                    lblOutcome.setText("The dealer went bust! You won!");
                }
                // split, but no busts
                else if (!boolMainBust && !boolSplitBust)
                {
                    // Give the user the money they won if they didn't get it already
                    if (!boolUser5Card)intUserMoney += intUserBet ;
                    // give the user the money if they didnt get it alredy
                    if (!boolSplit5Card)intUserMoney+= intSplitBet;
                    // display win message
                    lblOutcome.setText("The dealer went bust! You won both hands.");
                }
                // split but right bust, and no 5 card rule
                else if (!boolMainBust && boolSplitBust && !boolUser5Card)
                {
                    // Give the user the money they won
                    intUserMoney += intUserBet;
                    // display win message
                    lblOutcome.setText( "The dealer went bust! You won your left hand.");
                }
                // split but left bust and no 5 card rule
                else if (boolMainBust && !boolSplitBust && !boolSplit5Card)
                {
                    // Give the user the money they won
                    intUserMoney += intSplitBet;
                    // display win message
                    lblOutcome.setText(lblOutcome.getText() + "The dealer went bust! You won your right hand.");
                }
                // split full bust, or just bust no split
                else if (boolMainBust && boolSplitBust)
                {
                    // display lose message if no split
                    if (intSplitNumCards == 0)lblOutcome.setText("You went bust. You lost!");
                    // display different lose message if split
                    else  lblOutcome.setText("You went bust on both hands. You lost!");
                }
                
            }
            // Otherwise comapare the user's value to the dealer's value
            else 
            {
                // If the user didn't bust, and did do the 5 card rule
                if (!boolMainBust && !boolUser5Card) 
                {
                    // user only wins if they have a greater total. Dealer wins ties
                    if (intDealerTot < intUserTot)
                    {
                        // Give the user the money they won
                        intUserMoney += intUserBet;
                        // display a win message
                        if (intSplitNumCards == 0 ) lblOutcome.setText("Your total was higher than the dealers. You won!");
                        // if there is a split display a different message
                        else lblOutcome.setText("Your left hand's total was higher than the dealers. You won!");
                    }
                    // Otherwise display a lose message
                    else if(intDealerTot > intUserTot)
                    {
                        // take the bet money away from the user
                        intUserMoney -= intUserBet;
                        // display a lose message, if there was no split
                        if (intSplitNumCards == 0) lblOutcome.setText("The dealer's total was higher than your. You lose!");
                         // if there is a split display a different message
                        else lblOutcome.setText("Your left hand's total was lower than the dealers. You lost!");
                    }
                    // display a different lose message for ties
                    else
                    {
                        // take the bet money away from the user
                        intUserMoney -= intUserBet;
                        // display a lose message
                        if (intSplitNumCards == 0) lblOutcome.setText("You tied, but the dealer wins on ties. You lose!");
                        // if there is a split display a different message
                        else lblOutcome.setText("Your left hand's lost, as it tied with the dealer. You lost!");
                    }
                }
                
                // Now do the same thing for the right hand if there was a split, and the right side hasn't bust
                // and no 5 card rule
                if (intSplitNumCards > 0 && !boolSplitBust && !boolSplit5Card)
                {
                    // user only wins if they have a greater total. Dealer wins ties
                    if (intDealerTot < intUserSplitTot)
                    {
                        // Give the user the money they won
                        intUserMoney += intSplitBet;
                        // display a win message
                        lblOutcome.setText(lblOutcome.getText() + " Your right hand's total was higher than the dealers'. You lost!");
                    }
                    // Otherwise display a lose message
                    else if(intDealerTot > intUserSplitTot)
                    {
                        // take the bet money away from the user
                        intUserMoney -= intSplitBet;
                        // display a lose message, if there was no split
                        lblOutcome.setText(lblOutcome.getText() +  " The dealer's total was higher than your right hand's. You lose!");
                    }
                    // display a different lose message for ties
                    else
                    {
                        // take the bet money away from the user
                        intUserMoney -= intUserBet;
                        // display a lose message
                        lblOutcome.setText(lblOutcome.getText() +  " Your right hand's total was tied with the dealers, but the dealer wins ties. You lost!");
                    }
                }

            }
            
            // if the user is busted on the right hand
            if (boolSplitBust)
            {
                // display a loss message
                lblOutcome.setText(lblOutcome.getText() + "Your right hand when bust. You lost!");
            }
            
            // Display the totals of the dealer and user
            lblDealerTot.setText("Total: " + intDealerTot);
            // Display the totals of the dealer and user
            lblPlayerTot.setText("Total: " + intUserTot);
            // Display the split total
            lblSplitTot.setText("Total: "+intUserSplitTot);
            

            // display the users money
            lblMoney.setText("Money: $" + intUserMoney);
            // Display the dealer's cards
            // If the dealer has more than 0 cards, display the first card
            if (intDealerNumCards > 0) lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 1 card, display the second card
            if (intDealerNumCards > 1) lblDCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[1], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 2 cards, display the third card
            if (intDealerNumCards > 2) lblDCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[2], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 3 cards, display the 4th card
            if (intDealerNumCards > 3) lblDCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[3], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 4 cards  , display the 5ht card
            if (intDealerNumCards > 4) lblDCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[4], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 5 cards, display the 6th card
            if (intDealerNumCards > 5) lblDCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[5], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 6 cards, display the 7th card
            if (intDealerNumCards > 6) lblDCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[6], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 7 cards, display the 8th card
            if (intDealerNumCards > 7) lblDCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[7], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 8 cards, display the 9th card
            if (intDealerNumCards > 8) lblDCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[8], STRFIXEDDECK, STRPATHS))));
            
        }
    }//GEN-LAST:event_btnStandActionPerformed

    private void txtBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBetActionPerformed

    private void btnSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSplitActionPerformed
        // TODO add your handling code here:
        // The user wants to split their hand
        
        // If the user hasn't clicked play
        if (!boolIsPlaying)
        {
            // Display a error message
            lblErrorMsg.setText("Error: please click play before using stand. The game hasn't begun yet.");
            // Stop
            return;
        }
        // if there is already a split
        if (intSplitNumCards != 0 )
        {
            // display a error message
            lblUserHandErrorMsg.setText("Error: You have already split!");
            //stop
            return;
        }
        
        if(intUserNumCards > 2)
        {
            // display a error message
            lblUserHandErrorMsg.setText("Error: You can only split before you stand/hit.");
            // stop
            return;
        }
        // Check if the hand is not splittable or has more than 2 card eg. they already hit.
        if (!splittable(strUserHand[0], strUserHand[1]))
        {
            // display a error message
            lblUserHandErrorMsg.setText("You can't split your hand. Your 2 cards must have the same rank.");
            // stop
            return;
        }
        
        // Now do the split
        
        
        // Move a card to the second hand
        strUserSplitHand[0] = strUserHand[1];
        
        // Draw a card for the split hand
        strUserSplitHand[1] = strDeck[0];
        // pop the deck
        pop(strDeck);
        // Define split hands total| the value of one of the previous hands cards + the new card
        intUserSplitTot = getValue(strUserSplitHand[1]) + intUserTot / 2; 
        // draw the card for the main hand
        strUserHand[1] = strDeck[0];
        // pop the deck
        pop(strDeck);
        // Define the user hands total | the value of of one the previous cards in hand + the new card
        intUserTot = getValue(strUserHand[1]) + intUserTot / 2;
         
        // Check the edge case of having 2 aces for the main hand
        if (intUserTot > 21)
        {
            // decrease the number of aces that can subtract 10
            intUserAces--;
            // subtract the 10 from the total
            intUserTot -= 10;
        }
        // Check the edge case of having 2 aces for the split hand
        if (intUserSplitTot > 21)
        {
            // decrease the number of aces that can subtract 10
            intSplitAces--;
            // subtract the 10 from the total
            intUserSplitTot -= 10;
        }
        
        // increase the number of cards the split hand has
        intSplitNumCards = 2;
        
        // set the bet off the split to the same as the main hand
        intSplitBet = intUserBet;
        
        // display the bet amount
        lblSplitBetAmount.setText("Bet Amount: $"+intUserBet);
        
        // Display the totals for both hands
        lblPlayerTot.setText("Total: "+intUserTot);
        // Display the totals for both hands
        lblSplitTot.setText("Total: " + intUserSplitTot);
        
        // Display the cards (without extra error handling)
        // Display the user's first card
        lblPCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[0], STRFIXEDDECK, STRPATHS))));
        // Display the user's second card
        lblPCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserHand[1], STRFIXEDDECK, STRPATHS))));
        // Display the user's split first card
        lblSCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[0], STRFIXEDDECK, STRPATHS))));
        // Display the user's split second card
        lblSCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[1], STRFIXEDDECK, STRPATHS))));
        
    }//GEN-LAST:event_btnSplitActionPerformed

    private void btnSplitHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSplitHitActionPerformed
        // TODO add your handling code here:
                // If the user hasn't clicked play
        if (!boolIsPlaying)
        {
            // Display a error message
            lblErrorMsg.setText("Error: please click play before using hit. The game hasn't begun yet.");
            // Stop
            return;
        }
        // if there isn't a split hand
        if (intSplitNumCards == 0)
        {
            // display a error message
            lblErrorMsg.setText("Error: You didn't split your hand. Please use split (if you can) before hitting on split.");
            // stop
            return;
        }
        // If the split hand is done
        if (boolSplitConfirmed)
        {
            // Output a error msg
            lblSplitHandErrorMsg.setText("Error: You have already completed this hand. Please complete your other hand.");
            // stop
            return;
        }
        
        // The user want another card
        
        // Add the card to their hand
        strUserSplitHand[intSplitNumCards] = strDeck[0];
        // Pop the deck
        pop(strDeck);
        // Add the values of the cards to the total of each hand
        int intTemp = getValue(strUserSplitHand[intSplitNumCards]);
        // If its a ace increase the number of aces the user has
        if (intTemp == 11) intSplitAces++;
        // Increase the user's total by the value of their card
        intUserSplitTot += intTemp;
        // increase the number of cards the user has
        intSplitNumCards++;

        // Update the user's total
        lblSplitTot.setText("Total: " + intUserSplitTot);
        // Display the user's new card (by brute force)
        // If the user has more than 0 cards, display the first card
        if (intSplitNumCards > 0) lblSCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[0], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 1 card, display the second card
        if (intSplitNumCards > 1) lblSCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[1], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 2 cards, display the third card
        if (intSplitNumCards > 2) lblSCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[2], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 3 cards, display the 4th card
        if (intSplitNumCards > 3) lblSCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[3], STRFIXEDDECK, STRPATHS))));
        // If the user has more than 4 cards  , display the 5ht card
        if (intSplitNumCards > 4) lblSCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strUserSplitHand[4], STRFIXEDDECK, STRPATHS))));
        
        // If the user's total is over 21, but has a ace left, use it and reduce the total by 21
        if (intUserSplitTot > 21)
        {
            if (intSplitAces > 0) 
            {
                // Reduce the number of aces that can subtract 10
                intSplitAces--;
                // subtract 10 from the user's total
                intUserSplitTot -= 10;
                // Display the user's total
                lblSplitTot.setText("Total: " + intUserSplitTot);
            }
            // Otherwise goes bust
            else 
            {
                // subtract the money from their total
                intUserMoney -= intSplitBet;
                // Display a lose message
                if (intSplitNumCards == 0) lblOutcome.setText("You went bust and lost.");
                // display different message for if you have a split
                else lblOutcome.setText("Your right hand went bust and lost.");
                // display the user's new total
                lblSplitTot.setText("Total: " + intUserSplitTot);
                // Display the user's updated money
                lblMoney.setText("Money: $" + intUserMoney);
                
                // The main is confirmed and finished
                boolSplitConfirmed = true;
                
                // If the main hand is finished
                if (boolMainConfirmed)
                {
                    // Display the dealer's total
                    lblDealerTot.setText("Total: "+intDealerTot);
                    // display the dealers first card
                    lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
                    // Set playing to false because the game is over
                    boolIsPlaying = false;
                    // Set the play button to visible
                    btnPlay.setVisible(true);
                }                
            }
        }
        // the total is less than or equal to 21
        else 
        {
            // If split has 5 cards then 
            if (intSplitNumCards == 5)
            {
                // Set the 5 card rule to true
                boolSplit5Card = true;
                // give the user their money
                intUserMoney += intSplitBet;
                // Display a win message
                lblOutcome.setText("Your right hand has gotten 5 cards without going bust. You won (the right hand)!");
                // The split hand is finished
                boolSplitConfirmed = true;
                if (boolMainConfirmed == true) 
                {
                    // set the button to visible
                    btnPlay.setVisible(true);
                    // not playing anymore
                    boolIsPlaying = false;
                }
            }
        }
        
        
        // if the other hand is standing and this hand is finished
        if (!boolMainStanding) return;
        // otherwise hand the dealer play agianst the split hand
        
        // computer plays agianst THE MAIN STANDING HAND
        // while the dealer has less than 17 keep drawing
        while (intDealerTot < 17) {
            // Add a card to the dealer's hand
            strDealerHand[intDealerNumCards] = strDeck[0];
            // pop the top of the deck
            pop(strDeck);
            // add the value of the dealers new card
            intTemp = getValue(strDealerHand[intDealerNumCards]);
            // If it's a ace increase the number of aces the dealer has
            if (intTemp == 11) intDealerAces++;
            // Increase the dealer's total by the value of their card
            intDealerTot += intTemp;

            // If the dealer would go bust but they have a ace, subtract 10, this is because a ace may be a 1 or 11
            if (intDealerTot > 21 && intDealerAces > 0)
            {
                // decrease the dealers total by 10
                intDealerTot -= 10;
                // decrease the number of aces that can be used
                intDealerAces--;
            }
            // Incraese the number of cards the dealer has
            intDealerNumCards++;
        }

        // Now check if the dealer when bust
        if (intDealerTot > 21) 
        {
            // Give the user the money they won
            intUserMoney += intUserBet;
            // display a win message if no split
            lblOutcome.setText(lblOutcome.getText() + " The dealer went bust! You won!");
        }
        // Otherwise comapare the user's value to the dealer's value
        else 
        {
            // user only wins if they have a greater total. Dealer wins ties
            if (intDealerTot < intUserTot)
            {
                // Give the user the money they won
                intUserMoney += intUserBet;
                // display a win message
                lblOutcome.setText("Your left hand's total was higher than the dealers. You won! "+lblOutcome.getText());
            }
            // Otherwise display a lose message
            else if(intDealerTot > intUserTot)
            {
                // take the bet money away from the user
                intUserMoney -= intUserBet;
                // display a lose message, if there was no split
                lblOutcome.setText("Your left hand's total was lower than the dealers. You lost! "+lblOutcome.getText());
            }
            // display a different lose message for ties
            else
            {
                // take the bet money away from the user
                intUserMoney -= intUserBet;
                // display a lose message
                lblOutcome.setText("Your left hand's lost, as it tied with the dealer. You lost! "+lblOutcome.getText());
            }
        }
        // display the dealer's cards and total
        // Display the totals of the dealer and user
        lblDealerTot.setText("Total: " + intDealerTot);
        // Display the totals of the dealer and user
        lblPlayerTot.setText("Total: " + intUserTot);
        // Display the split total
        lblSplitTot.setText("Total: "+intUserSplitTot);


        // display the users money
        lblMoney.setText("Money: $" + intUserMoney);
        // Display the dealer's cards
        // If the dealer has more than 0 cards, display the first card
        if (intDealerNumCards > 0) lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 1 card, display the second card
        if (intDealerNumCards > 1) lblDCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[1], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 2 cards, display the third card
        if (intDealerNumCards > 2) lblDCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[2], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 3 cards, display the 4th card
        if (intDealerNumCards > 3) lblDCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[3], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 4 cards  , display the 5ht card
        if (intDealerNumCards > 4) lblDCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[4], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 5 cards, display the 6th card
        if (intDealerNumCards > 5) lblDCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[5], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 6 cards, display the 7th card
        if (intDealerNumCards > 6) lblDCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[6], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 7 cards, display the 8th card
        if (intDealerNumCards > 7) lblDCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[7], STRFIXEDDECK, STRPATHS))));
        // If the dealer has more than 8 cards, display the 9th card
        if (intDealerNumCards > 8) lblDCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[8], STRFIXEDDECK, STRPATHS))));

        
    }//GEN-LAST:event_btnSplitHitActionPerformed

    private void btnSplitStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSplitStandActionPerformed
        // TODO add your handling code here:
        
        // If the user hasn't clicked play
        if (!boolIsPlaying)
        {
            // Display a error message
            lblErrorMsg.setText("Error: please click play before using stand. The game hasn't begun yet.");
            // Stop
            return;
        }
        // if there isn't a split hand
        if (intSplitNumCards == 0)
        {
            // display a error message
            lblSplitHandErrorMsg.setText("Error: You didn't split your hand. Please use split (if you can) before standing the split hand.");
            // stop
            return;
        }
        // hand already confirmed
        if (boolSplitConfirmed == true)
        {
            // display a error message
            lblSplitHandErrorMsg.setText("Error: This hand is already complete. Please finish your other hand.");
            // stop
            return;
        }
        
        //The split hand is now standing
        boolSplitStanding = true;
        // The split hand is finished
        boolSplitConfirmed = true;
        
        // If the main is done
        if (boolMainConfirmed) 
        {
            // The game is over so display the play button again
            btnPlay.setVisible(true);
            // The round is over now
            boolIsPlaying = false;
        }
        
        // Declare a variables to see if any of the hands are bust already
        boolean boolMainBust = (intUserTot > 21);
        // Declare a variables to see if any of the hands are bust already
        boolean boolSplitBust = (intUserSplitTot > 21);
        
        // if the user is bust on both hands
        // This is here because it looks better when the user just shows its hand when the player loses anyways instead of doing it "ai"
        if (boolSplitBust && boolMainBust)
        {
            // display lose message
            lblOutcome.setText("Both of your hands went bust. You lost!");
            // Display the dealer's total
            lblDealerTot.setText("Total: "+intDealerTot);
            // Show the dealers first card
            lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
            // stop, because there are no more hands that the dealer can play against
            return;
        }
        // if the user is already bust on left hand
        else if (boolMainBust) 
        {
            // display a lose message
            if (intSplitNumCards != 0) lblOutcome.setText("Your left hand went bust. You lost!");
            // display a different lose message if they dont have a split
            // This is here because it looks better when the user just shows its hand when the player loses anyways instead of doing it "ai"
            else 
            {
                // display lose message
                lblOutcome.setText("You went bust, you lost!");
                // Display the dealer's total
                lblDealerTot.setText("Total: "+intDealerTot);
                // Show the dealers first card
                lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
                // stop, because there is no split hand to check
                return;
            }
        }
        
        // Calculate the user's total and make the computer move.
        // If the main hand is done
        if (boolMainConfirmed) {
            // Otherwise the computer will play
            // while the dealer has less than 17 keep drawing
            while (intDealerTot < 17) {
                // Add a card to the dealer's hand
                strDealerHand[intDealerNumCards] = strDeck[0];
                // pop the top of the deck
                pop(strDeck);
                // add the value of the dealers new card
                int intTemp = getValue(strDealerHand[intDealerNumCards]);
                // If it's a ace increase the number of aces the dealer has
                if (intTemp == 11) intDealerAces++;
                // Increase the dealer's total by the value of their card
                intDealerTot += intTemp;

                // If the dealer would go bust but they have a ace, subtract 10, this is because a ace may be a 1 or 11
                if (intDealerTot > 21 && intDealerAces > 0)
                {
                    // decrease the dealers total by 10
                    intDealerTot -= 10;
                    // decrease the number of aces that can be used
                    intDealerAces--;
                }
                // Incraese the number of cards the dealer has
                intDealerNumCards++;
            }

            // Now check if the dealer when bust
            if (intDealerTot > 21) 
            {
                // if they aren't but and no split and no 5 card rule
                if (!boolMainBust && intSplitNumCards == 0 && !boolUser5Card)
                {
                    // Give the user the money they won
                    intUserMoney += intUserBet;
                    // display a win message if no split
                    lblOutcome.setText("The dealer went bust! You won!");
                }
                // split, but no busts
                else if (!boolMainBust && !boolSplitBust)
                {
                    // Give the user the money they won if no 5 card rule
                    if(!boolUser5Card)intUserMoney += intUserBet;
                    // give the user the money if they didnt already get it from 5 card rule
                    if(!boolSplit5Card)intUserMoney += intSplitBet;
                    // display win message
                    lblOutcome.setText("The dealer went bust! You won both hands.");
                }
                // split but right bust, and no 5 card rulee
                else if (!boolMainBust && boolSplitBust && !boolUser5Card)
                {
                    // Give the user the money they won
                    intUserMoney += intUserBet;
                    // display win message
                    lblOutcome.setText( "The dealer went bust! You won your left hand.");
                }
                // split but left bust and no 5 card rule
                else if (boolMainBust && !boolSplitBust && !boolSplit5Card)
                {
                    // Give the user the money they won
                    intUserMoney += intSplitBet;
                    // display win message
                    lblOutcome.setText(lblOutcome.getText() + "The dealer went bust! You won your right hand.");
                }
                // split full bust, or just bust no split
                else if (!boolMainBust && !boolSplitBust)
                {
                    // display lose message if no split
                    if (intSplitNumCards == 0)lblOutcome.setText("You went bust. You lost!");
                    // display different lose message if split
                    else  lblOutcome.setText("You went bust on both hands. You lost!");
                }
                
            }
            // Otherwise comapare the user's value to the dealer's value
            else 
            {
                // If the user didn't bust and no 5 card rule
                if (!boolMainBust && !boolUser5Card) 
                {
                    // user only wins if they have a greater total. Dealer wins ties
                    if (intDealerTot < intUserTot)
                    {
                        // Give the user the money they won
                        intUserMoney += intUserBet;
                        // display a win message
                        if (intSplitNumCards == 0 ) lblOutcome.setText("Your total was higher than the dealers. You won!");
                        // if there is a split display a different message
                        else lblOutcome.setText("Your left hand's total was higher than the dealers. You won!");
                    }
                    // Otherwise display a lose message
                    else if(intDealerTot > intUserTot)
                    {
                        // take the bet money away from the user
                        intUserMoney -= intUserBet;
                        // display a lose message, if there was no split
                        if (intSplitNumCards == 0) lblOutcome.setText("The dealer's total was higher than your. You lose!");
                         // if there is a split display a different message
                        else lblOutcome.setText("Your left hand's total was lower than the dealers. You lost!");
                    }
                    // display a different lose message for ties
                    else
                    {
                        // take the bet money away from the user
                        intUserMoney -= intUserBet;
                        // display a lose message
                        if (intSplitNumCards == 0) lblOutcome.setText("You tied, but the dealer wins on ties. You lose!");
                        // if there is a split display a different message
                        else lblOutcome.setText("Your left hand's lost, as it tied with the dealer. You lost!");
                    }
                }
                
                // Now do the same thing for the right hand if there was a split, and the right side hasn't bust
                // and no 5 card rule
                if (intSplitNumCards > 0 && !boolSplitBust && !boolSplit5Card)
                {
                    // user only wins if they have a greater total. Dealer wins ties
                    if (intDealerTot < intUserSplitTot)
                    {
                        // Give the user the money they won
                        intUserMoney += intSplitBet;
                        // display a win message
                        lblOutcome.setText(lblOutcome.getText() + " Your right hand's total was higher than the dealers'. You lost!");
                    }
                    // Otherwise display a lose message
                    else if(intDealerTot > intUserSplitTot)
                    {
                        // take the bet money away from the user
                        intUserMoney -= intSplitBet;
                        // display a lose message, if there was no split
                        lblOutcome.setText(lblOutcome.getText() +  " The dealer's total was higher than your right hand's. You lose!");
                    }
                    // display a different lose message for ties
                    else
                    {
                        // take the bet money away from the user
                        intUserMoney -= intUserBet;
                        // display a lose message
                        lblOutcome.setText(lblOutcome.getText() +  " Your right hand's total was tied with the dealers, but the dealer wins ties. You lost!");
                    }
                }

            }
            
            // if the user is busted on the right hand
            if (boolSplitBust)
            {
                // display a loss message
                lblOutcome.setText(lblOutcome.getText() + "Your right hand when bust. You lost!");
            }
            
            // Display the totals of the dealer and user
            lblDealerTot.setText("Total: " + intDealerTot);
            // Display the totals of the dealer and user
            lblPlayerTot.setText("Total: " + intUserTot);
            // Display the split total
            lblSplitTot.setText("Total: "+intUserSplitTot);

            // display the users money
            lblMoney.setText("Money: $" + intUserMoney);
            // Display the dealer's cards
            // If the dealer has more than 0 cards, display the first card
            if (intDealerNumCards > 0) lblDCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[0], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 1 card, display the second card
            if (intDealerNumCards > 1) lblDCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[1], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 2 cards, display the third card
            if (intDealerNumCards > 2) lblDCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[2], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 3 cards, display the 4th card
            if (intDealerNumCards > 3) lblDCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[3], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 4 cards  , display the 5ht card
            if (intDealerNumCards > 4) lblDCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[4], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 5 cards, display the 6th card
            if (intDealerNumCards > 5) lblDCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[5], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 6 cards, display the 7th card
            if (intDealerNumCards > 6) lblDCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[6], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 7 cards, display the 8th card
            if (intDealerNumCards > 7) lblDCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[7], STRFIXEDDECK, STRPATHS))));
            // If the dealer has more than 8 cards, display the 9th card
            if (intDealerNumCards > 8) lblDCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource(findPath(strDealerHand[8], STRFIXEDDECK, STRPATHS))));
        }
    }//GEN-LAST:event_btnSplitStandActionPerformed

    private void btnSplitRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSplitRaiseActionPerformed
        // TODO add your handling code here:
        // If the game hasn't started yet
        if (!boolIsPlaying)
        {
            // display a error msg
            lblErrorMsg.setText("Error: The game hasn't started yet. Click Play to start");
            // stop
            return;
        }
        // if there isn't a split hand
        if (intSplitNumCards == 0)
        {
            // display a error message
            lblErrorMsg.setText("Error: You didn't split your hand. Please use split (if you can) before raising the split hand.");
            // stop
            return;
        }
        // if hitting or standing has happened
        if (intSplitNumCards > 2 || intUserNumCards > 2 || boolMainConfirmed == true || boolSplitConfirmed == true ) 
        {
            // display a error message
            lblSplitHandErrorMsg.setText("ERROR: You can only raise before hitting or standing or either hand.");
            // stop
            return;
        }
        // If the hand has already been raised
        if (boolSplitRaised)
        {
            // display a error message
            lblSplitHandErrorMsg.setText("ERROR: You can only raise each hand once.");
            // stop
            return;
        }
        // The bet has been raised
        boolSplitRaised = true;
        // double the bet
        intSplitBet *= 2;
        // dsiplay the new bet
        lblSplitBetAmount.setText("Bet Amount: $"+intSplitBet);
        // display a message to the user that they raised
        lblSplitHandErrorMsg.setText("You raised you bet on your right hand.");
    }//GEN-LAST:event_btnSplitRaiseActionPerformed

    private void btnRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseActionPerformed
        // TODO add your handling code here:
        // If the game hasn't started yet
        if (!boolIsPlaying)
        {
            // display a error msg
            lblErrorMsg.setText("Error: The game hasn't started yet. Click Play to start");
            // stop
            return;
        }
        // if hitting or standing has happened
        if(intSplitNumCards > 2 || intUserNumCards > 2 || boolSplitConfirmed == true || boolMainConfirmed == true) 
        {
            // display a error message
            lblUserHandErrorMsg.setText("ERROR: You can only raise before hitting or standing or either hand.");
            // stop
            return;
        }
        // If the hand has already been raised
        if (boolMainRaised)
        {
            // display a error message
            lblUserHandErrorMsg.setText("ERROR: You can only raise each hand once.");
            // stop
            return;
        }
        // The bet has been raised
        boolMainRaised = true;
        // double the bet
        intUserBet *= 2;
        // display the new bet
        lblPlayerBetAmount.setText("Bet Amount: $"+intUserBet);
        //display a message for the user to see that they raised
        lblUserHandErrorMsg.setText("You raised your bet.");
    }//GEN-LAST:event_btnRaiseActionPerformed

    private void lblGoToBJStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblGoToBJStatsActionPerformed
        // TODO add your handling code here:
        // Make the blackjack info visible
        new frmBlackjackInfo().setVisible(true);
        // Get rid of this frame, making the blackjack info frame the current "main" frame.
        this.dispose();
    }//GEN-LAST:event_lblGoToBJStatsActionPerformed

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
            java.util.logging.Logger.getLogger(frmBlackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBlackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBlackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBlackjack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBlackjack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHit;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRaise;
    private javax.swing.JButton btnSplit;
    private javax.swing.JButton btnSplitHit;
    private javax.swing.JButton btnSplitRaise;
    private javax.swing.JButton btnSplitStand;
    private javax.swing.JButton btnStand;
    private javax.swing.JLabel lblBetAmountTitle;
    private javax.swing.JLabel lblDCard1;
    private javax.swing.JLabel lblDCard2;
    private javax.swing.JLabel lblDCard3;
    private javax.swing.JLabel lblDCard4;
    private javax.swing.JLabel lblDCard5;
    private javax.swing.JLabel lblDCard6;
    private javax.swing.JLabel lblDCard7;
    private javax.swing.JLabel lblDCard8;
    private javax.swing.JLabel lblDCard9;
    private javax.swing.JLabel lblDealerTot;
    private javax.swing.JLabel lblDealersHandTitle;
    private javax.swing.JLabel lblErrorMsg;
    private javax.swing.JLabel lblExplainationTitle;
    private javax.swing.JLabel lblExplanation1;
    private javax.swing.JLabel lblExplanation2;
    private javax.swing.JLabel lblExplanation3;
    private javax.swing.JLabel lblExplanation4;
    private javax.swing.JLabel lblExplanation5;
    private javax.swing.JButton lblGoToBJStats;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblOutcome;
    private javax.swing.JLabel lblPCard1;
    private javax.swing.JLabel lblPCard2;
    private javax.swing.JLabel lblPCard3;
    private javax.swing.JLabel lblPCard4;
    private javax.swing.JLabel lblPCard5;
    private javax.swing.JLabel lblPlayerBetAmount;
    private javax.swing.JLabel lblPlayerHandTitle;
    private javax.swing.JLabel lblPlayerTot;
    private javax.swing.JLabel lblSCard1;
    private javax.swing.JLabel lblSCard2;
    private javax.swing.JLabel lblSCard3;
    private javax.swing.JLabel lblSCard4;
    private javax.swing.JLabel lblSCard5;
    private javax.swing.JLabel lblSplitBetAmount;
    private javax.swing.JLabel lblSplitHandErrorMsg;
    private javax.swing.JLabel lblSplitHandTitle;
    private javax.swing.JLabel lblSplitTot;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserHandErrorMsg;
    private javax.swing.JTextField txtBet;
    // End of variables declaration//GEN-END:variables
}
