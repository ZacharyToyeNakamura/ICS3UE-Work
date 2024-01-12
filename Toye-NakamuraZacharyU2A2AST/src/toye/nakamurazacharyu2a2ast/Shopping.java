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
 * A program that asks the user how many of each item they would like to buy and then shows the subtotal and total
 */
public class Shopping {
        public static void main(String[] args) {
            // Declaring a variable to store the tax percentage
            double DBLTAX = 0.13;
            // Dclearing how much a usb storage device costs
            double DBLUSBPRICE = 19.99;
            // Declaring how much a keyboard costs
            int INTKEYBOARDPRICE = 50;
            // Declaring how much a computer mouse costs
            int INTMOUSEPRICE = 26;
            //Declaring the decimal format to print 2 decimal places only| Decimal floating point 2
            DecimalFormat df2 = new DecimalFormat("0.00");
            // Declaring the scanner
            Scanner input = new Scanner(System.in);
            
            // Prompting the user to input the number of USB storage devices they would like to buy
            System.out.print("How many USB storage devices would you like to buy ($19.99 each)? ");
            // Declaring a varible to store how many usb storage devices the user wants to buy
            int intNumUSB = input.nextInt();
            // Prompting the user to input the number of keyboards they would like to buy
            System.out.print("How many keyboards would you like to buy ($50.00 each)? ");
            // Declaring a varible to store how many keyboards the user wants to buy
            int intNumKeyboards = input.nextInt();
            // Prompting the user to input the number of computer mice the user would like to buy
            System.out.print("How many computer mice would like to buy ($26.00 each)? ");
            // Declaring a varible to store how many mice the user wants to by
            int intNumMice = input.nextInt();
            // Declaring the subtotal, how much the purchase costs before tax | This is done by multiplying each item by it's price
            double dblSubtotal = intNumUSB * DBLUSBPRICE + intNumKeyboards * INTKEYBOARDPRICE + intNumMice * INTMOUSEPRICE;
            // Output to console the subtotal, Always to 2 decimal places
            System.out.println("The subtotal is $" + df2.format(dblSubtotal));
            // Output to console how much the tax will cost the user, rounded to 2 decimal places
            System.out.println("Tax costs $" + df2.format(dblSubtotal * DBLTAX));
            // Output to console the total price, how  much the purchase costs after tax, rounded to 2 decimal places
            System.out.println("The total cost is $" + df2.format(dblSubtotal + dblSubtotal * DBLTAX));            
    }
}
