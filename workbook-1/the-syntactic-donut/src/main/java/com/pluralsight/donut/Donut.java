package com.pluralsight.donut;

import java.util.Scanner;

/*
    * Delimiters:
    * { } - Curly braces
                For method body, class declarations, initializing an array with values "{0, 1, 2}"
    * [ ] - Square brackets
                For array declarations
                Array access "i.e. [0]"
    * < > - Angle brackets
                For template parameter lists --> allows you to pass types as arguments to a method
    * ( ) - Parentheses
                Parameter list for a method --> what the method needs to run
    * ;   - Semicolon
                End a line/block of code

    * Operators:
    *  &  - Stands for et. or "and" (used in conditional statements)
 */
public class Donut { //Donut class is considered a data type, all classes are also data types
    //Declaring a new variable "price" with data type of double, assigning price with value of .25
    static double price = 0.25;

    /* Declaring a method (function) getTotalPrice with data type of double, specifying
       the data type of parameter (int numberOfDonuts) for method. Returns a double.
     */

    public static double getTotalPrice(int numberOfDonuts) {
        return price * numberOfDonuts;
    }

    //Main method: class method that runs/execute code for Donut
    public static void main(String[] args) {
        //Get a scanner to read input from System.in
        Scanner inputSc = new Scanner(System.in);

        //Prompt the user for a number using System built-in Java class
        System.out.print("Welcome! How many donuts do you want? :");
        int numberOfDonuts = inputSc.nextInt();
        inputSc.nextLine();

        double pricePerDozen = getTotalPrice(numberOfDonuts);

        System.out.println("A dozen donuts cost: " + pricePerDozen + " dollars");
        /* printf takes as parameters (a String format, the value that you want formatted)
            format is defined at $[width][.precision]conversion
            [width] - defines the minimum characters you want to be outputted
            [.precision] - specifies how many decimal places you want

       Conversion char
            'b', 'B'	general	    If the argument arg is null, then the result is "false". If arg is a boolean or Boolean, then the result is the string returned by String.valueOf(arg). Otherwise, the result is "true".
            'h', 'H'	general	    The result is obtained by invoking Integer.toHexString(arg.hashCode()).
            's', 'S'	general	    If arg implements Formattable, then arg.formatTo is invoked. Otherwise, the result is obtained by invoking arg.toString().
            'c', 'C'	character	The result is a Unicode character
                 'd'	integral	The result is formatted as a decimal integer
                 'o'	integral	The result is formatted as an octal integer
            'x', 'X'	integral	The result is formatted as a hexadecimal integer
            'e', 'E'	floating point	The result is formatted as a decimal number in computerized scientific notation
                  'f'	floating point	The result is formatted as a decimal number
            'g', 'G'	floating point	The result is formatted using computerized scientific notation or decimal format, depending on the precision and the value after rounding.
            'a', 'A'	floating point	The result is formatted as a hexadecimal floating-point number with a significand and an exponent. This conversion is not supported for the BigDecimal type despite the latter's being in the floating point argument category.
            't', 'T'	date/time	Prefix for date and time conversion characters. See Date/Time Conversions.
                 '%'	percent	    The result is a literal '%' ('\u0025')
                 'n'	line separator	The result is the platform-specific line separator
         */

        //Print out with specific format
        System.out.printf("In dollars, this would be $%4.2f\n\n", pricePerDozen);
        System.out.printf("The square root of 5 is %8.15f\n", Math.sqrt(5.0));

        //Closing the scanner to end input
        inputSc.close();
    }
}
