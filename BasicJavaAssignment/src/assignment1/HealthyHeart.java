package assignment1;

import java.util.Scanner;

public class HealthyHeart {
    public static void main(String[] args) {


        //Getting user age
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age?");
        int age = scanner.nextInt();
        //Working out the maximum heart rate by the age
        int maximumHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute");
        //Working out HR zone
        System.out.println("Your target HR Zone is " + Math.round(0.50 * maximumHeartRate) + " - "
                + Math.round(0.85 * maximumHeartRate) + " beats per minute");



// 50
//Your maximum heart rate should be 170 beats per minute
//Your target HR Zone is 85 - 145 beats per minute
//Make a simple calculator that asks the user for their age. Then calculate the healthy heart rate range for that age, and display it.
//Their maximum heart rate should be 220 - their age.
//The target heart rate zone is the 50 - 85% of the maximum.



    }
}
