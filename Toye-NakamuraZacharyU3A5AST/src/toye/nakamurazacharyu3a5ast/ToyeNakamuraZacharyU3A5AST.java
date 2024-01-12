/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toye.nakamurazacharyu3a5ast;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Zachary Toye-Nakamura
 * Date: August 14, 2023
 * A short program to help the user with equations by using methods
 * These equations include equations from stats, chem, and physics.
 * You can question me on any of these equations, and I have notes on all of them.
 * 
 * There are not a lot of equations that I know that are as complex (or close to as complex) as Cosine Law.
 * Equations that are too simple/complex: sin law, rotation equations, trig functions, Pythagorean theorem, hypergeometric, regression, 
 * 
 */
public class ToyeNakamuraZacharyU3A5AST {
    /**
     * @param args the command line arguments
     */
    
    /**
     * Printing the options for the user to select from.
     */
    public static void printMenu()
    {
        // Display a welcome message and some spacers
        System.out.println("\n\nWelcome to U3A5AST you can choose to use any of the calculators below, everything is rounded to 2 decimal places.");
        // All of these print statements display the menu to the user
        System.out.println("1. . . Sample Standard deviation Calculator (Sample Size of 10)"); // Statistics (but honestly could have learn in g11)
        // All of these print statements display the menu to the user
        System.out.println("2. . . Weight Average Calculator (Sample Size of 10)"); // g10 math
        // All of these print statements display the menu to the user
        System.out.println("3. . . Percentile Calculator (Sample Size of 10)"); // Statistics (but honestly could have learn in g11)
        // All of these print statements display the menu to the user
        System.out.println("4. . . Half life Calculator (To find remain amount)"); // g11 chem
        // All of these print statements display the menu to the user
        System.out.println("5. . . Doppler Effect Calculator (To find Frequency observed)"); //g11 ap physics
        // All of these print statements display the menu to the user
        System.out.println("6. . . Universal Gravitation Calculator (to find g)"); // g11 ap physics
        // All of these print statements display the menu to the user
        System.out.println("7. . . Force Normal Calculator"); // g11 ap physics
        // All of these print statements display the menu to the user
        System.out.println("8. . . 2 Vector Addition Calculator (in polar form, degrees) / Airplane questions"); // g11 ap physics
        // All of these print statements display the menu to the user
        System.out.println("9. . . Big 5 for constant Acceleration Calculator (Finding distance)"); // g11 ap physics 
        // All of these print statements display the menu to the user
        System.out.println("-1. . .Quit the program");
    }
    
    /**
     * This method calculates the sample standard deviation (σ) of a sample of 10 data points.
     * Equation: σ=sqrt((sum((xi-x̄)^2))/(N-1))
     * @param dblDataP1 Data point 1
     * @param dblDataP2 Data point 2
     * @param dblDataP3 Data point 3
     * @param dblDataP4 Data point 4
     * @param dblDataP5 Data point 5
     * @param dblDataP6 Data point 6
     * @param dblDataP7 Data point 7
     * @param dblDataP8 Data point 8
     * @param dblDataP9 Data point 9
     * @param dblDataP10 Data point 10
     * @return The standard deviation of a sample size of 10 points that are the parameters (no arr allowed as parameters. . . )
     */
    public static double standardDeviation(double dblDataP1,double dblDataP2,double dblDataP3,double dblDataP4,double dblDataP5,double dblDataP6,double dblDataP7,double dblDataP8,double dblDataP9,double dblDataP10)
    {
        // First assmble all of the data into an array to make it easier to loop over. Also it looks nicer
        double [] dblDataPoints = {dblDataP1,dblDataP2,dblDataP3,dblDataP4,dblDataP5,dblDataP6,dblDataP7,dblDataP8,dblDataP9,dblDataP10};
        // Declare a variable that holds the average of the data
        double dblAverage = (dblDataP1+dblDataP2+dblDataP3+dblDataP4+dblDataP5+dblDataP6+dblDataP7+dblDataP8+dblDataP9+dblDataP10)/10;
        // Declare a variable to hold the answer of the equation
        double dblAnswer = 0;
        // find the numerator of the equation by adding up (the distance from each data point to the average squared)
        for (int i = 0; i < 10; i++) dblAnswer += Math.pow((dblDataPoints[i]-dblAverage), 2);
        // then divide it by the denominator which is the sample size - 1
        dblAnswer /= (10 - 1); // leaving like this because you can change it to population size by removing the "- 1"
        // final take the square root of the whole thing
        dblAnswer = Math.sqrt(dblAnswer);
        // Return the answer
        return dblAnswer;
    }
    
    /**
     * This method will find the weighted average of a data set given 10 data points and weights for each of the averages
     * Equation: sum(xi*wi)/sum(wi)
     * @param dblDataP1 Data point 1
     * @param dblWeightP1 Weight of Data point 1
     * @param dblDataP2 Data point 2
     * @param dblWeightP2 Weight of Data point 2
     * @param dblDataP3 Data point 3
     * @param dblWeightP3 Weight of Data point 3
     * @param dblDataP4 Data point 4
     * @param dblWeightP4 Weight of Data point 4
     * @param dblDataP5 Data point 5
     * @param dblWeightP5 Weight of Data point 5
     * @param dblDataP6 Data point 6
     * @param dblWeightP6 Weight of Data point 6
     * @param dblDataP7 Data point 7
     * @param dblWeightP7 Weight of Data point 7
     * @param dblDataP8 Data point 8
     * @param dblWeightP8 Weight of Data point 8
     * @param dblDataP9 Data point 9
     * @param dblWeightP9 Weight of Data point 9
     * @param dblDataP10 Data point 10
     * @param dblWeightP10 Weight of Data point 10
     * @return The weighted average of the data set inputted
     */
    public static double weightedAverage(double dblDataP1, double dblWeightP1, double dblDataP2,double dblWeightP2, double dblDataP3,double dblWeightP3, double dblDataP4,double dblWeightP4, double dblDataP5,double dblWeightP5, double dblDataP6,double dblWeightP6, double dblDataP7,double dblWeightP7,double dblDataP8,double dblWeightP8,double dblDataP9,double dblWeightP9,double dblDataP10,double dblWeightP10)
    {
        // First assmble all of the data into an array to make it easier to loop over. Also it looks nicer
        double [] dblDataPoints = {dblDataP1,dblDataP2,dblDataP3,dblDataP4,dblDataP5,dblDataP6,dblDataP7,dblDataP8,dblDataP9,dblDataP10};
        // Assmble all of the weights into a array where dblDataPoints[i] has a weight of dblWeights[i]
        double [] dblWeights = {dblWeightP1,dblWeightP2,dblWeightP3,dblWeightP4,dblWeightP5,dblWeightP6,dblWeightP7,dblWeightP8,dblWeightP9,dblWeightP10};
        // Declare a variable to hold the answer
        double dblAnswer = 0;
        // Declare a variable to hold the total weight
        double dblTotWeight = 0;
        // Loop through all of the data points.
        for (int i = 0; i < 10; i++)
        {
            // sum up all of the data points multiplied by their weight
            dblAnswer += dblDataPoints[i] * dblWeights[i];
            // Sum up all of the weights
            dblTotWeight += dblWeights[i]; 
        }
        // return the answer divide by the the total weight
        return dblAnswer /= dblTotWeight;
    }
    
    /**
     * This method finds the percentile of a given data point (dblFindPercent) when also given a data set (dblDataPn).
     * Please note that if looking online every site will give different formulas like (p = 100L/n).
     * This is the formula that I learned in statistics class
     * Equation: p = 100*(L + 0.5E) / n
     * L is the number of data points less than the value you are finding the percentile of and E is the number of data points that are equal to it.
     * @param dblDataP1 Data point 1
     * @param dblDataP2 Data point 2
     * @param dblDataP3 Data point 3
     * @param dblDataP4 Data point 4
     * @param dblDataP5 Data point 5
     * @param dblDataP6 Data point 6
     * @param dblDataP7 Data point 7
     * @param dblDataP8 Data point 8
     * @param dblDataP9 Data point 9
     * @param dblDataP10 Data point 10
     * @param dblFindPercent The data point that they want to find the percentile of
     * @return The percentile of dblFindPercent in the data set
     */
    public static double percentile(double dblDataP1,double dblDataP2,double dblDataP3,double dblDataP4,double dblDataP5,double dblDataP6,double dblDataP7,double dblDataP8,double dblDataP9,double dblDataP10, double dblFindPercent)
    {
        // First assmble all of the data into an array to make it easier to loop over. Also it looks nicer
        double [] dblDataPoints = {dblDataP1,dblDataP2,dblDataP3,dblDataP4,dblDataP5,dblDataP6,dblDataP7,dblDataP8,dblDataP9,dblDataP10};
        // Declare a variable to hold the answer
        double dblAnswer = 0;
        // loop through all of the data
        for (int i = 0; i < 10; i++) // still wondering if i can use dblDataPoints.length legally???
        {
            // If the data point is less than FindPercent then add one (it's L which is Less than)
            if (dblDataPoints[i] < dblFindPercent) dblAnswer++;
            // If the data point is equal to the FindPercent then add point 5 (it's E which is equal to)
            else if (dblDataPoints[i] == dblFindPercent) dblAnswer += 0.5;
        }
        // Then divide everything by the total number of data points, and multiple by 100 for a percentage
        dblAnswer = dblAnswer / 10 * 100;
        // Return the answer
        return dblAnswer;
    }
    
    /**
     * The method will return how much of a substance is remaining at the end of a period of time given it's original amount, the time and the half life of the substance
     * Half life is how long the substance takes to decay by half
     * Equation: Vf = Vo*(1/2)^(t/n)
     * @param dblInitAmount Vo - The original amount of substance you have.
     * @param dblTime t - The time that passes
     * @param dblHalfLife n - The half life of the substance
     * @return Vf - How much substance is remaining at the end of the time
     */
    public static double halfLife(double dblInitAmount, double dblTime, double dblHalfLife)
    {
        // Declare a variable to hold how much the substance decays
       double dblDecayFactor = Math.pow(0.5, dblTime/dblHalfLife);
       // Return the amount
       return dblInitAmount * dblDecayFactor;
    }
    
    /**
     * This method will return the frequency observed from the doppler effect equation.
     * Equation: fo = (v+vo)/(v-vs)*fs
     * vo and vs are positive when moving towards each other and negative when moving away from each other.
     * @param dblSpdSound v - Velocity of sound (how fast sound moves in that medium (the speed of sounds changes based on air temp, and the doppler effect also happens in not air, like water))
     * @param dblSpdObserver vo - Velocity of the observer (how fast the thing hearing the sound is moving)
     * @param dblSpdSource vs - Velocity of the source (how fast the source of the sound is moving (ex. police car sirens))
     * @param dblActualFreq fs - The true frequency of the sound the source is making (how many waves pass the observer, higher freq is higher amount of sound waves heard by the observer).
     * @return The frequency heard by the observer
     */
    public static double dopplerEffect(double dblSpdSound, double dblSpdObserver, double dblSpdSource, double dblActualFreq)
    {
        // Declare a variable to hold the answer, but at first is declared with just the numerator
        double dblObserverFreq = dblSpdSound + dblSpdObserver;
        // Then divide by the denomitator of the equation
        dblObserverFreq /= dblSpdSound - dblSpdSource;
        // final multiple by the true frequency
        dblObserverFreq *= dblActualFreq;
        // return the observed frequency
        return dblObserverFreq;
    }
    
    /**
     * This method solves the universal gravitation equation for Force.
     * Equation: F = G*(m1*m2)/r^2
     * @param dblMass1 One mass in the system
     * @param dblMass2 The other mass in the system
     * @param dblRadius The distance between the center of each mass
     * @param DBLGRAVIATIONCONST The gravitational constant which is something like 6.67*10^-11
     * @return The amount of force in newtons that the masses act on each other.
     */
    public static double universalGraviation(double dblMass1, double dblMass2, double dblRadius, double DBLGRAVIATIONCONST)
    {
        // It's a very simple equation but with the large constant quite annoying
        // Return the complete answer
        return DBLGRAVIATIONCONST*dblMass1*dblMass2/Math.pow(dblRadius,2);
    }
    
    /**
     * 
     * Assuming the mass is touching a surface
     * Up forces = Down forces in grade 11 physics
     * Equation: Fn = Fg*cos(angle of slope)+any other downwards forces - any other upwards forces
     * @param dblMass - The mass of the object
     * @param dblAngle - the angle of the surface that the mass is on
     * @param dblForceDown - Any other forces acting on the mass, pushing down
     * @param dblForceUp - Any other forces that are acting on the mass, pushing up 
     * @return 
     */
    public static double forceNormal(double dblMass, double dblAngle, double dblForceDown, double dblForceUp) 
    {
        // Declare what the gravity constant is (can be found using universal graviation equation) 
        double dblG = 9.8; // bleh, it should just be "g"
        // Solve the equation (dblAngle is in degrees)
        double dblForceNormal = dblMass * dblG * Math.cos(Math.toRadians(dblAngle)) + dblForceDown - dblForceUp;
        // Return the answer
        return dblForceNormal;
    }
    
    /**
     * This method takes in 2 vectors in polar form and returns the sum of the vector in polar form
     * Equations:     x1 = magnitude*cos(θ), y1 = magnitude*sin(θ)
     * back to polar: [sqrt((xtotal)^2+(ytotal)^2), arctan(ytotal/xtotal)]
     * @param dblMag1   - Magnitude of the first vector
     * @param dblAngle1 - Angle of the first vector (in degrees)
     * @param dblMag2   - Magnitude of the second vector
     * @param dblAngle2 -  Angle of the first vector (in degrees)
     * @return A number that contains both the magnitude (*1e7) and the angle (max 5 digits).
     */
    public static double vectorAddition(double dblMag1, double dblAngle1, double dblMag2, double dblAngle2)
    {
        // First get components because using cosine law would be hard to do not visual.
        // Break down into components
        // find the x component
        double dblX1 = dblMag1*Math.cos(Math.toRadians(dblAngle1));
        // find the y component
        double dblY1 = dblMag1*Math.sin(Math.toRadians(dblAngle1));
        // find the x component
        double dblX2 = dblMag2*Math.cos(Math.toRadians(dblAngle2));
        // find the y component
        double dblY2 = dblMag2*Math.sin(Math.toRadians(dblAngle2));
        // Declare a variable to hold the return val, at first holding the magnitude
        double dblReturn = Math.sqrt(Math.pow(dblX1 + dblX2, 2) + Math.pow(dblY1 + dblX2, 2));
        // multiple it buy 1e7 to store the angle in the back. (can be unpacked by (n-(n%1e7))/1e7, n%1e7) and return it
        return dblReturn * Math.pow(10,7) + Math.toDegrees(Math.atan((dblY1+dblY2)/(dblX1+dblX2)));
    }
    
    /**
     * This method solves for distance moved, (assuming constant acceleration) when given 3 of velocity initial, velocity final, acceleration, and time.
     * Time is needed and can't be INF.
     * 
     * Equations: d = 1/2*(vi+vf)*t
     * d = vi*t + 1/2at^2
     * d = vf*t - 1/2at^2
     * 
     * @param dblInitVelocity - vi Velocity initial, the speed the object was moving when calculation began
     * @param dblFinalVelocity - vf Velocity final, the speed the object was moving when the calculation ends
     * @param dblTime - t Time, the amount of time the object is observed (for distance traveled).
     * @param dblAccel - a Acceleration, a constant rate at which velocity is increasing
     * @param dblInf - INF infinity, a constant that is used to know which of the 4 variables is not used.
     * @return The distance traveled given time, and 2 out of (initvelocity, finalvelocity and acceleration)
     */
    public static double big5Equations(double dblInitVelocity, double dblFinalVelocity, double dblTime, double dblAccel, double dblInf)
    {
        // if initial velocity isn't given then use this equation: d = vf*t - 1/2at^2
        if (dblInitVelocity == dblInf) return dblFinalVelocity*dblTime-0.5*dblAccel*dblTime*dblTime;
        // If final velocity isn't given then use this equation: d = vi*t + 1/2at^2
        else if (dblFinalVelocity == dblInf) return dblInitVelocity*dblTime+0.5*dblAccel*dblTime*dblTime;
        // If accel isn't given the use this equation: d = 1/2*(vi+vf)*t // else if (dblAccel == dblInf) 
        // else any equation can be used so just default to this one. (error handling should be done before calling this function)
        else return 0.5*(dblInitVelocity+dblFinalVelocity)*dblTime;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaring the graviation constant
        final double DBLGRAVIATIONCONST = 6.6743 * Math.pow(10,-11);
        
        // Declare the scanner for input
        Scanner input = new Scanner(System.in);  
        // Declare the decimal format (2 decimal places)
        DecimalFormat df2 = new DecimalFormat("0.00");
        
        // Declare a variable to hold the option the user wants (set to -1 to break the program)
        int intUserChoice = 0;
        // While the user doesn't enter the end program choice, loop
        while (intUserChoice != -1)
        {
            // output the menu for the user to see
            printMenu();
            // Prompt the user for input on which option they would like to use
            System.out.print("Which option would you like to use? ");
            // Get input from the user and store it in the input
            intUserChoice = input.nextInt();
            // If the user's choice is 1 or 3, both require similar input in the same order
            if(intUserChoice == 1 || intUserChoice == 3)
            {
                // Display a message to tell the user want to do
                System.out.println("Please input 10 data points (numbers).");
                // Prompt the user for a data point
                System.out.print("Enter data point 1: ");
                // Get input from the user and store it
                double dblDataP1 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 2: ");
                // Get input from the user and store it
                double dblDataP2 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 3: ");
                // Get input from the user and store it
                double dblDataP3 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 4: ");
                // Get input from the user and store it
                double dblDataP4 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 5: ");
                // Get input from the user and store it
                double dblDataP5 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 6: ");
                // Get input from the user and store it
                double dblDataP6 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 7: ");
                // Get input from the user and store it
                double dblDataP7 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 8: ");
                // Get input from the user and store it
                double dblDataP8 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 9: ");
                // Get input from the user and store it
                double dblDataP9 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 10: ");
                // Get input from the user and store it
                double dblDataP10 = input.nextDouble();
                // Display the final output to the user
                if (intUserChoice == 1) System.out.println("The standard deviation of the data set ["+dblDataP1+", "+dblDataP2+", "+dblDataP3+", "+dblDataP4+", "+dblDataP5+", "+dblDataP6+", "+dblDataP7+", "+dblDataP8+", "+dblDataP9+", "+dblDataP10+"] is:" + df2.format(standardDeviation(dblDataP1,dblDataP2,dblDataP3,dblDataP4,dblDataP5,dblDataP6,dblDataP7,dblDataP8,dblDataP9,dblDataP10)));
                // Other wise the user's choice is 3
                else if (intUserChoice == 3)
                {
                    // Prompt the user for input
                    System.out.print("Enter the value that you want to find the percentile of: ");
                    // Get input from the user and store it
                    double dblFindPercent = input.nextDouble();
                    // display the final output to the user
                    System.out.println("The percentile of "+dblFindPercent+" in the data set ["+dblDataP1+", "+dblDataP2+", "+dblDataP3+", "+dblDataP4+", "+dblDataP5+", "+dblDataP6+", "+dblDataP7+", "+dblDataP8+", "+dblDataP9+", "+dblDataP10+"] is:" + df2.format(percentile(dblDataP1,dblDataP2,dblDataP3,dblDataP4,dblDataP5,dblDataP6,dblDataP7,dblDataP8,dblDataP9,dblDataP10, dblFindPercent))+"%");
                }
            }
            else if (intUserChoice == 2)
            {
                // Display a message to tell the user want to do
                System.out.println("Please input 10 data points (numbers) and their weights");
                // Prompt the user for a data point
                System.out.print("Enter data point 1: ");
                // Get input from the user and store it
                double dblDataP1 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 1: ");
                // Get input from the user and store it
                double dblWeightP1 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 2: ");
                // Get input from the user and store it
                double dblDataP2 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 2: ");
                // Get input from the user and store it
                double dblWeightP2 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 3: ");
                // Get input from the user and store it
                double dblDataP3 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 3: ");
                // Get input from the user and store it
                double dblWeightP3 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 4: ");
                // Get input from the user and store it
                double dblDataP4 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 4: ");
                // Get input from the user and store it
                double dblWeightP4 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 5: ");
                // Get input from the user and store it
                double dblDataP5 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 5: ");
                // Get input from the user and store it
                double dblWeightP5 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 6: ");
                // Get input from the user and store it
                double dblDataP6 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 6: ");
                // Get input from the user and store it
                double dblWeightP6 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 7: ");
                // Get input from the user and store it
                double dblDataP7 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 7: ");
                // Get input from the user and store it
                double dblWeightP7 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 8: ");
                // Get input from the user and store it
                double dblDataP8 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 8: ");
                // Get input from the user and store it
                double dblWeightP8 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 9: ");
                // Get input from the user and store it
                double dblDataP9 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 9: ");
                // Get input from the user and store it
                double dblWeightP9 = input.nextDouble();
                // Prompt the user for a data point
                System.out.print("Enter data point 10: ");
                // Get input from the user and store it
                double dblDataP10 = input.nextDouble();
                // Prompt the user for the weight of the data point
                System.out.print("Enter the weight of data point 10: ");
                // Get input from the user and store it
                double dblWeightP10 = input.nextDouble();
                // Display the final output to the user, I'm not doing to output 20 variables because I'm not sure how to make it look nice instead of number barf 
                System.out.println("The weighted average of your data set is: " + df2.format(weightedAverage( dblDataP1,  dblWeightP1,  dblDataP2, dblWeightP2,  dblDataP3, dblWeightP3,  dblDataP4, dblWeightP4,  dblDataP5, dblWeightP5,  dblDataP6, dblWeightP6,  dblDataP7, dblWeightP7, dblDataP8, dblWeightP8, dblDataP9, dblWeightP9, dblDataP10, dblWeightP10)));
            }
            // If the user's choice is methd 4
            else if (intUserChoice == 4)
            {
                // Prompt the user to input the original amount of substance
                System.out.print("Enter the original amount of substance in grams: ");
                // Get input from the user and store it
                double dblInitAmount = input.nextDouble();
                // Prompt the user to input the original amount of substance
                System.out.print("Enter the time that passes (any unit): ");
                // Get input from the user and store it
                double dblTime = input.nextDouble();
                // Prompt the user to input the original amount of substance
                System.out.print("Enter the half life of the substance (same unit as time): ");
                // Get input from the user and store it
                double dblHalfLife = input.nextDouble();
                // Display the answer, with all decimal places this is because the answers may get very small
                System.out.println("The amount of substance remaining is " + halfLife(dblInitAmount,  dblTime,  dblHalfLife) + "g");   
            }
            // If the user choose method 5
            else if (intUserChoice == 5)
            {
                // Prompt the user for input on the speed of sound
                System.out.print("Enter the speed of sound (In air at 20C the speed is 343m/s): ");
                // Store the input
                double dblSpdSound = input.nextDouble();
                // Prompt the user to input the speed of the observer
                System.out.print("Enter the speed of the observer (Positive for moving toward the source)(m/s): ");
                // Store the input
                double dblSpdObserver = input.nextDouble();
                // Prompt the user to input the speed of the source
                System.out.print("Enter the speed of the source (Positive for moving towards the observer)(m/s): ");
                // Store the input
                double dblSpdSource = input.nextDouble();
                // Prompt the user to input the frequency at the source
                System.out.print("Enter the frequency of the source (Hz): ");
                // Store the input
                double dblActualFreq = input.nextDouble();
                // Display the answer
                System.out.println("The frequency observed given those conditions is " + df2.format(dopplerEffect(dblSpdSound,  dblSpdObserver,  dblSpdSource,  dblActualFreq))+"Hz");
            }
            else if (intUserChoice == 6)
            {   
                // Prompt the user to enter the mass of mass 1
                System.out.print("Enter the mass of m1 (kg): ");
                // Get input from the user and store it
                double dblMass1 = input.nextDouble();
                // Prompt the user to enter the mass of mass 2
                System.out.print("Enter the mass of m2 (kg): ");
                // Get input from the user
                double dblMass2 = input.nextDouble();
                // Prompt the user to enter the distance between the center of the masses
                System.out.print("Enter the distance between the centers of the 2 masses (meters): ");
                // Get input from the user and store it
                double dblRadius = input.nextDouble();
                // display the answer to the user, not rouding because of the tiny constant (and rounding would make the answers 0 for small inputs).
                System.out.println("The Force between mass 1 and mass 2 is " + universalGraviation( dblMass1,  dblMass2,  dblRadius,  DBLGRAVIATIONCONST));
            }
            else if (intUserChoice == 7)
            {
                // Prompt the user to input the mass
                System.out.print("Enter the mass of the object (kg): ");
                // Get user input
                double dblMass = input.nextDouble();
                // Prompt the user to input the angle of the surface
                System.out.print("Enter the angle of the surface your object is on (degrees): ");
                // Get user input
                double dblAngle = input.nextDouble();
                // Prompt the user to input any other downwards forces
                System.out.print("Enter the force of any other downwards forces acting upon the object (N): ");
                // Get and store user input
                double dblForceDown = input.nextDouble();
                // Prompt the user to input any other upwards forces
                System.out.print("Enter the force of any other upwards forces acting upon the object (N): ");
                // Get and store user input
                double dblForceUp = input.nextDouble();
                // Display the answer to the user
                System.out.println("The normal force on a object with a mass of " + dblMass+" on a surface at a angle of "+dblAngle+" with " + dblForceDown+"N of extra downwards force and "+dblForceUp+"N of extra upwards force is "+ forceNormal( dblMass,  dblAngle,  dblForceDown,  dblForceUp));
            }
            else if (intUserChoice == 8)
            {
                // Prompt user to enter the magnitude of vector 1
                System.out.print("Enter the magnitude of vector 1: ");
                // Get input from the user
                double dblMag1 = input.nextDouble();
                // Prompt user to enter the angle of vector 1
                System.out.print("Enter the angle of vector 1 (degrees): ");
                // Get input from the user
                double dblAngle1 = input.nextDouble();
                // Prompt user to enter the magnitude of vector 2
                System.out.print("Enter the magnitude of vector 2: ");
                // Get input from the user
                double dblMag2 = input.nextDouble();
                // Prompt user to enter the angle of vector 2
                System.out.print("Enter the angle of vector 2 (degrees): ");
                // Get input from the user
                double dblAngle2 = input.nextDouble();
                // Get the packed valued from the method
                double dblReturnVal = vectorAddition( dblMag1,  dblAngle1,  dblMag2,  dblAngle2);
                // Unpack the magnitude and angle from the value, and display to the user.
                System.out.println("The sum of the vectors in polar form is ["+df2.format((dblReturnVal-(dblReturnVal%Math.pow(10,7)))/Math.pow(10,7))+", "+df2.format(dblReturnVal%Math.pow(10,7))+" deg]");
            }
            else if (intUserChoice == 9)
            {
                // Declare a variable to check if there is a unknown variable yet
                boolean boolUnknown = false;
                // Declare a variable to hold the error flag
                boolean boolErrorFlag = false;
                // tell the user a bit about what is going to happen next
                System.out.println("You may enter -999999 for one of the following variables (except time) to signify it as unknown.");
                // prompt the user for input
                System.out.print("Enter the Initial Velocity (m/s): ");
                // Get input from the user
                double dblInitVelocity = input.nextDouble();
                // Check if it's unknown
                if (dblInitVelocity == -999999) boolUnknown = true;
                // prompt the user for input, add "[NEEDED] if there is already a unknown variable"
                if (boolUnknown) System.out.print("Enter the Final Velocity [NEEDED] (m/s): ");
                // Otherwise just print normaly
                else System.out.print("Enter the Final Velocity (m/s): ");
                // Get input from the user
                double dblFinalVelocity = input.nextDouble();
                // Check if it's unknown
                if (dblFinalVelocity == -999999) boolUnknown = true;
                // prompt the user for input
                System.out.print("Enter Time [NEEDED] (s): ");
                // Get input from the user
                double dblTime = input.nextDouble();
                // If the user tries to enter unknown for time, throw a error
                if (dblTime == -999999)  System.out.println("ERROR: Time may not be a unknown.");
                else
                {
                    // prompt the user for input, add "[NEEDED] if there is already a unknown variable"
                    if (boolUnknown) System.out.print("Enter the Acceleration [NEEDED] (m/s^2): ");
                    // Otherwise just print normaly
                    else System.out.print("Enter the Acceleration (m/s^2): ");
                    // Get input from the user
                    double dblAccel = input.nextDouble();
                    
                    System.out.println("The distance traveled given the input variables is " + df2.format(big5Equations(dblInitVelocity,  dblFinalVelocity,  dblTime,  dblAccel,  -999999))+"m");
                }
            }
        }
        
        // display a goodbye message to the user
        System.out.println("Goodbye! Thank you for using this program.");
    }
}
