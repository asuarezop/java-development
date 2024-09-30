package com.pluralsight;

import java.util.Scanner;

public class AddIntegers {
    public static int sumIntegers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);

        System.out.print("Please provide me with two integers to add up together. \nThe result will be shown later.\n\n");
        System.out.println("What is the first integer? (digits only): ");
        int x = inputSc.nextInt();

        System.out.println("What is the second integer? (digits only): ");
        int y = inputSc.nextInt();

        int result = sumIntegers(x, y);

        System.out.printf("The result of " + x + " added with " + y + " equals: \n%d\n", result);

        inputSc.close();
    }
}
