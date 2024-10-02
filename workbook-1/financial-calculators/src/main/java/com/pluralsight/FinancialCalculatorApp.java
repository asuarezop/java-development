package com.pluralsight;
import java.util.Scanner;

public class FinancialCalculatorApp {
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        System.out.print("Welcome! Please select desired calculator to continue. \n");
        System.out.print("1: Mortgage Calculator\n2: Future Value Calculator\n3: Annuity Calculator\n\n");
        System.out.println("Enter your selection here: ");

        int calcSelection = inputSc.nextInt();

        //Changing calculators based on user input (old way)
      /*  if (calcSelection == 1) {
            MortgageCalculator.main(args);
        } else if (calcSelection == 2) {
            FutureValueCalculator.main(args);
        } else if (calcSelection == 3){
            AnnuityCalculator.main(args);
        }
      */

        //Changing calculators using switch (better format)
        switch (calcSelection) {
            case 1:
                MortgageCalculator.main(args);
                break;
            case 2:
                FutureValueCalculator.main(args);
                break;
            case 3:
                AnnuityCalculator.main(args);
                break;
        }
    }
}
