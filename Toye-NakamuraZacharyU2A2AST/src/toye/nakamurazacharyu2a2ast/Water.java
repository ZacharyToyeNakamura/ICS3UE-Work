/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toye.nakamurazacharyu2a2ast;
import java.util.Scanner;
/**
 *
 * @author Zachary Toye-Nakamura
 * Date: Aug 2 2023
 * A short program to calculate the amount of water was required to manufacture the number of computer/monitor combos the user owns.
 */
public class Water {
    public static void main(String[] args) {
        // Declaring a variable that stores the amount of water in tons needed to make 1 computer mointer combo
        final double DBLWATERTOCOMBORATIO = 1.5;
        // Declaring the scanner
        Scanner input = new Scanner(System.in);
        // Print to consle a prompt for the user to input the number of combos that they own
        System.out.print("How many computer/monitor combos do you own? ");
        // Declaring a int variable that is the number of computer.monitor combos own by the user
        int intCombosOwned = input.nextInt();
        // Output to console The number of tons of water that were required to make all of the users computer/monitor combos
        System.out.println("It took " + (intCombosOwned * DBLWATERTOCOMBORATIO) + " tons of water to manufacture all of your computer/monitor combos.");
    }
}
