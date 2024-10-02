package com.pluralsight;
import java.util.Scanner;

public class AnnuityCalculator {
    public static double getPresentValue (double monthlyAnnuityPayout, double interestRate, int lifetimePayPeriod) {
        //Present value on ordinary annuity formula
        // P = PMT * (1 - (1 + r)^-n) / r

        // PMT = Dollar amount of each annuity payment
        // r = Interest rate (discount rate) --> annual interest, not monthly interest
        // n = number of periods in which payments will be made in a year (12)
        // t = number of pay periods over the entire span of annuity

        int annualPayPeriod = 12;
        double convertedInterestRate = interestRate / 100;
        double yearlyAnnuityPayout = monthlyAnnuityPayout * annualPayPeriod;
        double a = 1 + convertedInterestRate;
        double b = -1 * lifetimePayPeriod;
        double c = 1 - Math.pow(a,b);

        return yearlyAnnuityPayout * c / convertedInterestRate;
    }

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        System.out.print("Enter the desired monthly payout of annuity (digits only): ");
        double annuityPayout = inputSc.nextDouble();
        inputSc.nextLine();

        System.out.print("Enter the expected interest on your annuity (digits only): ");
        double expectedInterest = inputSc.nextDouble();
        inputSc.nextLine();

        System.out.print("Enter the total number of years for annuity payout (digits only): ");
        int totalPayoutYears = inputSc.nextInt();
        inputSc.nextLine();

        double presentValueCalculation = getPresentValue(annuityPayout,expectedInterest, totalPayoutYears);
        System.out.println(presentValueCalculation);
    }
}
