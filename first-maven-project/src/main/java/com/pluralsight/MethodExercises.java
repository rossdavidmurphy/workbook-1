package com.pluralsight;

public class MethodExercises {
    public static void main(String[] args) {
        brushTeeth();

        String movie = favoriteMovie();
        System.out.println("My favorite movie is... " + movie);

        int answer = sum(74, 22);
        System.out.println(answer);
    }

    public static void brushTeeth() {
        System.out.println("How to Brush Your Teeth");
        System.out.println("Step 1: Wet the toothbrush and apply the toothpaste.");
        System.out.println("Step 2: Brush your teeth on small circular motions.");
        System.out.println("Step 3: Rinse on your mouth with water.");

    }
    public static String favoriteMovie() {
        return "Ford v. Ferrari";
    }

    public static int sum(int x,int y) {
        int answer = x + y;
        return answer;

    }
}
