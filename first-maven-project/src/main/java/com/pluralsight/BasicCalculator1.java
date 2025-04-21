package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        float firstNumber = input.nextFloat();
        System.out.println("Enter 2nd number: ");
        float secondNumber = input.nextFloat();

        input.nextLine(); //eating the enter key

        System.out.println("Enter operator symbol: ");
        System.out.println("Add: +");
        System.out.println("Subtract: -");
        System.out.println("Multiply: *");
        System.out.println("Divide: /");
        String operator = input.nextLine();


        System.out.println("Calculating...");

        float answer = 0;

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        }
        if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        }
        if (operator.equals("*")) {
            answer = firstNumber * secondNumber;
        }
        if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }

        String message = String.format("%.2f %s %.2f = %.2f", firstNumber, operator, secondNumber, answer);
        System.out.println(message);
    }
}
