package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name Here: ");
        String firstName = input.nextLine();

        System.out.println("Enter Number of Hours Worked");
        float hoursWorked = input.nextFloat();

        System.out.println("Enter Hourly Pay Rate");
        float hourlyPayRate = input.nextFloat();

        input.nextLine();

        float totalPay = hoursWorked * hourlyPayRate;
        System.out.println(firstName + " earned $" + totalPay);




    }
}
