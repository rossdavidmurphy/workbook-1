package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 50000;
        int garySalary = 52000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The answer is " + highestSalary);


        int carPrice = 10300;
        int truckPrice = 34000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);


        double radiusOfCircle = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
        System.out.println("The area of the circle is " + areaOfCircle);


        double startingNumber = 5;
        double squareRoot = Math.sqrt(startingNumber);
        System.out.println("The square root is " + squareRoot);


        int x1 = 5, y1 = 10;
        int x2 =85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance is " + distance);


        float setNumber = -3.8F;
        float absoluteNumber = Math.abs(setNumber);
        System.out.println("The absolute number of " + setNumber + " is " + absoluteNumber);


        double random = Math.random();
        System.out.println("Here's a random number between 0 and 1 " + random);

    }
}
