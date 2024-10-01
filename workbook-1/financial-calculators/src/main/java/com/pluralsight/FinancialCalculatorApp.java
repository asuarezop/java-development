package com.pluralsight;

public class FinancialCalculatorApp {
    public static void main(String[] args) {
        int calcSelection = 0;

        System.out.println("Please enter desired ");

        if (calcSelection == 1) {
            MortgageCalculator.main(args);
        } else if (calcSelection == 2) {
            FutureValueCalculator.main(args);
        }
    }
}
