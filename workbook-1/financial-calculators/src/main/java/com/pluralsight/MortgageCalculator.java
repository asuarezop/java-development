package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static double getMortgagePayment (double principal, double interestRate, int loanTermLength) {
//      if user didn't do conversion of interest rate
//      double yearlyPercentage = interestRate / 100;
        double paymentsOverTime = 12;
        double annualPercentage = interestRate / 100 / paymentsOverTime;
        double a = 1 + (annualPercentage);
        double b = -1 * (loanTermLength * paymentsOverTime);
        double numerator = principal * (annualPercentage);
        double denominator = 1 - Math.pow(a, b);

        //Monthly payment of mortgage loan
        return numerator / denominator;
    }

    public static double getTotalInterest (double monthlyPayment, double principal, int loanTermLength) {
        double totalPayments = monthlyPayment * (12 * loanTermLength);

        //Total interest for mortgage loan
        return totalPayments - principal;
    }

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        System.out.print("Enter the amount of loan principal (digits only): ");
        double loanPrincipal = inputSc.nextDouble();
        inputSc.nextLine();

        System.out.print("Enter the interest rate of loan (as a decimal percentage i.e. 7.625): ");
        double interestRate = inputSc.nextDouble();
        inputSc.nextLine();

        System.out.print("Enter the length of the loan (in years, digits only): ");
        int loanTermLength = inputSc.nextInt();
        inputSc.nextLine();

        double loanCalculation = getMortgagePayment(loanPrincipal, interestRate, loanTermLength);
        double totalMortgageInterest = getTotalInterest(loanCalculation, loanPrincipal, loanTermLength);

        System.out.printf("Your monthly loan payment is $%4.2f \n", loanCalculation);
        System.out.printf("Your total interest on the mortgage is $%4.2f", totalMortgageInterest);

        inputSc.close();
    }
}
