package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double firstNumber = myScanner.nextDouble();

        System.out.println("Enter 2nd number ");
        double secondNumber = myScanner.nextDouble();

        myScanner.nextLine();

        System.out.println("Which operation would you like you use?");
        System.out.println("Enter 'A' 'S' 'M' 'D': ");
        String input = myScanner.nextLine();

        System.out.println("Calculating...");

        if (input.equals("A")) {
            double result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        }
    }
}
