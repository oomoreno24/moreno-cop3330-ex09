/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Oliver Moreno
 */
package ex09;

import java.util.Scanner;
/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output

You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length in feet: ");

        // input for length
        String lengthInFeet = in.nextLine();

        System.out.print("Enter the width in feet: ");

        // input for width
        String widthInFeet = in.nextLine();

        // converting strings lengthInFeet and widthInFeet to integers
        int length = Integer.parseInt(lengthInFeet);
        int width = Integer.parseInt(widthInFeet);

        // calculations
        double gallonOfPaint = 350;
        double totalSquareFeet = length * width;
        double gallonsNeeded = (int)Math.ceil(totalSquareFeet / gallonOfPaint);


        //output
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n", (int)gallonsNeeded, (int)totalSquareFeet);

    }
}
