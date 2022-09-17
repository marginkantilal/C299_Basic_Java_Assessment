package assignment1;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    //Write a program that asks the user for the name of their dog, and then generates a fake DNA background report on the pet dog.
    // It should assign a random percentage to 5 dog breeds (that should add up to 100%!)
    // take input from user about dog
    // create list of different dog breeds.
    // for 4 times make it pick a number between 0 and the current limit.
    // 5 value would be what's left.

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        double totalPercentage = 100;
        List<String> dogBreeds = List.of("St. Bernard", "Dramatic RedNosed Asian Pug", "Common Cur", "Chihuahua", "King Doberman", " Black Mouth Cur",
                "Bloodhound", "Blue Lacy");

        String dogName = "";
        //Checking if Input is empty or null
        while(!inputIsValid) {
            System.out.println("What is your dog's name? ");
            dogName = scanner.nextLine();
            inputIsValid = dogName != null && !dogName.isBlank() && !dogName.isEmpty(); //valid name
        }

        System.out.println(dogName + " is:");

        Random randomGen = new Random();

        for(int i = 0; i < 4; i++) {
            //Getting random percentage
            double chosenPercentage = randomGen.nextDouble(0, totalPercentage);
            //Getting random names from the list
            int chosenDogBreed = randomGen.nextInt(0, dogBreeds.size());

            //Subtracting  total Percentage - chosenPercentage
            totalPercentage -= chosenPercentage;
            System.out.println(df.format(chosenPercentage) + "% " + dogBreeds.get(chosenDogBreed));
        }

        //get fifth element from the list
        int chosenDogBreed = randomGen.nextInt(0, dogBreeds.size());
        // Gets remaining percentage out of 100
        System.out.println(df.format(totalPercentage) + "% " + dogBreeds.get(chosenDogBreed));
        System.out.println("Wow, that's QUITE the dog!");
    }
}
