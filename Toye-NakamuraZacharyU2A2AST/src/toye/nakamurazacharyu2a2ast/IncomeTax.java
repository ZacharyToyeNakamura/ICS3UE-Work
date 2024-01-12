/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toye.nakamurazacharyu2a2ast;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 2 2023
 * A short program that calculates the federal tax that the user has to pay based on the user's income
 * The income the user entered will have a value between $165,430 (inclusive) up to $235,675 (inclusive).
 */
public class IncomeTax {
    public static void main(String[] args) {
        // First set up with constants for each tax bracket and the tax percentage
        // Declare a variable to store where the first tax bracket ends
        final int INT1STTAXBRACKET = 53359;
        // Declare a variable to store where the second tax bracket ends
        final int INT2NDTAXBRACKET = 106717;
        // Declare a variable to store where the third tax bracket ends
        final int INT3RDTAXBRACKET = 165430;
        // Declare a variable to store where the fourth tax bracket ends
        //final int INT4THTAXBRACKET = 235675;
        
        // Declare a variable to store how much tax needs to be pay for income between 0 and the first tax bracket
        final double DBLTAXPERCENT1ST = 0.15;
        // Declare a variable to store how much tax needs to be pay for income between first and the second tax bracket
        final double DBLTAXPERCENT2ND = 0.205;
        // Declare a variable to store how much tax needs to be pay for income between second and the third tax bracket
        final double DBLTAXPERCENT3RD = 0.26;
        // Declare a variable to store how much tax needs to be pay for income between third and the fourth tax bracket
        final double DBLTAXPERCENT4TH = 0.29;
        // Declare a variable to store how much tax needs to be pay for income above the fourth bracket 
        //final double DBLTAXPERCENT5TH = 0.33;
        //Declaring the decimal format to print 2 decimal places only | Decimal floating point 2
        DecimalFormat df2 = new DecimalFormat("0.00");
            
        // Taking in input
        // Declaring the scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to input their income
        System.out.print("Enter your income: ");
        // Declare a variable that store the user's income as a double because cents Ex. $134945.56
        double dblUserIncome = input.nextInt();
        
        // Calculating Tax
        // Declaring a variable to hold the final income tax, since the income must be at least 165,430, calculating all previous tax brackets it ok
        // Just calculating the tax from lower brackets | The amount in that bracket multiplied by the tax percentage of that bracket.
        double dblIncomeTax = INT1STTAXBRACKET * DBLTAXPERCENT1ST + (INT2NDTAXBRACKET - INT1STTAXBRACKET) * DBLTAXPERCENT2ND + (INT3RDTAXBRACKET - INT2NDTAXBRACKET) * DBLTAXPERCENT3RD;
        // Adding tax from the fourth bracket, the income will NEVER go into the fifth bracket so it's doesn't need to be accounted for
        dblIncomeTax += (dblUserIncome - INT3RDTAXBRACKET) * DBLTAXPERCENT4TH;
        // Outputting to consle the total federal income tax based on their income. | Rounded to 2 decimal places
        System.out.println("Your federal income tax total is $" + df2.format(dblIncomeTax));
    }
}
