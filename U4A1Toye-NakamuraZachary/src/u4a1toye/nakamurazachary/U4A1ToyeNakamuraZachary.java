/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4a1toye.nakamurazachary;
import java.util.Scanner;

/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 16 2023
 * A short program that asks the user for 6 strings of various requirements
 * It showcases error handling
 * 
 */
public class U4A1ToyeNakamuraZachary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declare the scanner
        Scanner input = new Scanner(System.in);
        // A string to hold the user's input
        String strUserInput = "";
        // A bool to check wether the user has passed yet
        boolean boolPassed = false;
        // while the user's input isn't longer than 6 characters. (hasn't passed)
        while (strUserInput.length() < 7)
        {
            // prompt the user for input
            System.out.print("Stage 1: Enter a string that is greater than 6 characters long: ");
            // get input from the user
            strUserInput = input.nextLine();            
        }
        // A congratulatory message is displayed to the user, for completion
        System.out.println("Well done. Moving on to the next stage.");
        
        
        // Reset the string storing the user's input
        strUserInput = "";
        // while the user's input doesn't have a "a". (hasn't passed)
        while (!boolPassed)
        {
            // prompt the user for input
            System.out.print("Stage 2: Enter a string that contains at least one lowercase \"a\": ");
            // get input from the user
            strUserInput = input.nextLine();  
            // Loop through the whole string to check if contains a "a"
            for (int i = 0; i < strUserInput.length();i++) 
            {
                // if the character is a then set passed to true
                if(strUserInput.substring(i,i+1).equals("a")) boolPassed = true;
            }
        }
        // A congratulatory message is displayed to the user, for completion
        System.out.println("Well done. Moving on to the next stage.");
        
        // Then set bool passed to false again for the next trial
        boolPassed = false;
        // Reset the string storing the user's input
        strUserInput = "";
        // While any of the requirements are not meet, continue looping. (those being, not have a "z", shorter than 5, and longer than 5)
        while (!boolPassed || ((strUserInput.length() < 5) || (strUserInput.length() > 15)))
        {
            // prompt the user for input
            System.out.print("Stage 3: Enter a string that is between [5 and 15] characters long, and does not contain the letter \"z\": ");
            // get input from the user
            strUserInput = input.nextLine();  
            // Set the passer to true, because it assumes there is no "z" right now.
            boolPassed = true;
            // Loop through the whole string to check if contains a "z", if it does then set boolPassed to false
            for (int i = 0; i < strUserInput.length();i++) 
            {
                // If the character is a z then set passed to false
                if(strUserInput.substring(i,i+1).equals("z")) boolPassed = false;
            }
        }
        // A congratulatory message is displayed to the user, for completion
        System.out.println("Well done. Moving on to the next stage.");
        
        // Then set bool passed to false again for the next trial
        boolPassed = false;
        // Reset the string storing the user's input
        strUserInput = "";
        while (!boolPassed)
        {

            // Assume that the user will pass
            boolPassed = true;
            // prompt the user for input
            System.out.print("Stage 4: Enter an integer between [5 and 500]: ");
            // Get input from the user
            strUserInput = input.nextLine();
            // test if the input is a int in [5 to 500]
            try
            {
                // Declare a int to store the users input,
                if (Integer.parseInt(strUserInput) >= 5 && Integer.parseInt(strUserInput) <= 500) boolPassed = true;
                // don't meet the requirements
                else boolPassed = false;
            }
            // If it fails set pass to false
            catch (Exception InputMismatchException) 
            {
                boolPassed = false;
            }
        }
        // A congratulatory message is displayed to the user, for completion
        System.out.println("Well done. Moving on to the next stage.");
        
        // Then set bool passed to false again for the next trial
        boolPassed = false;
        // Reset the string storing the user's input
        strUserInput = "";
        while (!boolPassed)
        {
            // Assume that the user will pass
            boolPassed = true;
            // prompt the user for input
            System.out.print("Stage 5: Enter a negative integer: ");
            // Get input from the user
            strUserInput = input.nextLine();
            // test if the input is a int less than 0
            try
            {
                // try parsing it as a integer, and if it's less than 0 
                if (Integer.parseInt(strUserInput) < 0) boolPassed = true;
                // don't meet the requirements
                else boolPassed = false;
            }
            // If it fails set pass to false
            catch (Exception InputMismatchException) 
            {
                // Setting passed to false
                boolPassed = false;
            }
        }
        // A congratulatory message is displayed to the user, for completion
        System.out.println("Well done. Moving on to the next stage.");
        
        // Then set bool passed to false again for the next trial
        boolPassed = false;
        // Reset the string storing the user's input
        strUserInput = "";
        while (!boolPassed)
        {
            // Assume that the user will pass
            boolPassed = true;
            // prompt the user for input
            System.out.print("Stage 6: Enter a positive, odd integer: ");
            // Get input from the user
            strUserInput = input.nextLine();
            // test if the input is a int less than 0
            try
            {
                // try parsing it as a integer, and if it's positive and odd
                if (Integer.parseInt(strUserInput) > 0 && Integer.parseInt(strUserInput) % 2 == 1) boolPassed = true;
                // don't meet the requirements
                else boolPassed = false;
            }
            // If it fails set pass to false
            catch (Exception InputMismatchException) 
            {
                // Setting passed to false
                boolPassed = false;
            }
        }
        // A congratulatory message is displayed to the user, for completion
        System.out.println("Congratulations, you have finished this calibration test.");
    }
}
