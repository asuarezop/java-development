package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalculator {
    public static double getFutureValueForCD (double cdDeposit, double interestRate, int cdTermInYears) {
        //Future value formula
        // FV = PV * (1 + r)^n

        //PV = current money deposited today (not expected money deposited)
        //r = rate of interest on CD
        //n = CD term maturity in years

        double a = 1 + (interestRate / (100 * 365)); //interest rate w/ daily compounding
        double b = cdTermInYears * 365; //CD term length in days

        return cdDeposit * Math.pow(a,b);
    }

    public static double getDailyInterestOnCD (double principal, double futureValue) {
        //Total interest earned daily on CD
        return futureValue - principal;
    }

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        System.out.print("Enter the amount of your CD deposit (digits only): ");
        double initialCdDeposit = inputSc.nextDouble();
        inputSc.nextLine();

        System.out.print("Enter the interest rate (APR) of CD (as a decimal percentage i.e. 4.50): ");
        double cdInterestRate = inputSc.nextDouble();
        inputSc.nextLine();

        System.out.print("Enter the term length of CD (in years, digits only): ");
        int cdTermLength = inputSc.nextInt();
        inputSc.nextLine();

        double futureValCalculation = getFutureValueForCD(initialCdDeposit, cdInterestRate, cdTermLength);
        double totalCDInterest = getDailyInterestOnCD(initialCdDeposit, futureValCalculation);

        System.out.printf("Your CD ending balance will be: $%4.2f \n", futureValCalculation);
        System.out.printf("Your earned interest is: $%4.2f \n", totalCDInterest);
    }
}
