/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3a2asttoye.nakamurazachary;
import java.util.Scanner;
/**
 * 
 * @author Zachary Toye-Nakamura
 * Date: Aug 9, 2023
 * A short program to help the user calculate the square, cube and any other power of a number.
 * This number may only be a integer (because I don't know how to convert decimals to fractions (for all decimals))
 * Negative exponents also don't work
 */
public class U3A2ASTToyeNakamuraZachary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare the scanner so I can get input
        Scanner input = new Scanner(System.in);
        // Declare what the menu should look like
        final String STRMENU = "1. . . Find the value of a number squared (NOTE: 2^2 = 2 x 2) \n2. . . Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2) \n3. . . Find the value of a number, to any power \n4. . . Exit";
        //Declare a variable to hold the user's choice (set at -1, so the while loop starts)
        int intUserChoice = -1;
        // Declare a variable to hold the user's desired base num and the user's desired power.
        int intBaseNum = 0, intPowerNum = 0;
        
        // Run the loop until the user decides to exit the program
        while (intUserChoice != 4)
        {
            // Display the menu for the user to see
            System.out.println(STRMENU);
            // Then prompt the user for which option they would like
            System.out.print("Enter the option you would like to use: ");
            // Get user input
            intUserChoice = input.nextInt();
            
            // Only run if the user's option is 1, 2, or 3 (because those are the only options on the menu). 4 doesn't run and it terminates.
            if (intUserChoice == 1 || intUserChoice == 2 || intUserChoice == 3) 
            {
                // Prompt the user to enter the base of the equation
                System.out.print("Enter the base of the equation: ");
                // Get the user's desired base (of the equation)
                intBaseNum = input.nextInt();
                // If the user's choice is 1 then set the power to be 2
                if (intUserChoice == 1) intPowerNum = 2;
                // If the user's choice is 2 then set the power to be 3
                else if (intUserChoice == 2) intPowerNum = 3;
                // If the user's choice is 3 then ask them what power they want
                else if (intUserChoice == 3)
                {
                    // Prompt the user to enter the power of the equation
                    System.out.print("Enter the exponent of the equation: ");
                    // Get the user's response
                    intPowerNum = input.nextInt();
                }
                
                // Declare a variable to hold the total
                int intTotalNum = 1;
                // Then evaluate the equation
                // Loop intPowerNum times, each time multiplying total by the base
                for (int i = 0; i < intPowerNum; i++)
                {
                    // Multiple the total by the base
                    intTotalNum *= intBaseNum;
                }
                // Display the answer to the user and space is out a little bit so that it doesn't look so cramped
                System.out.println("The answer to " + intBaseNum + " to the power of " + intPowerNum + " is " + intTotalNum + "\n\n");
            }
        }
        // There is probably not a need for this if statement
        // If the user entered 4, output a farewell message to the user.
        if (intUserChoice == 4) System.out.println("Thank you for using this program, goodbye.");
    } 
}

