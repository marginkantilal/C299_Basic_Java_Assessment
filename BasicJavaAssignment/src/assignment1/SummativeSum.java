package assignment1;

import java.util.List;

public class SummativeSum {
    public static void main(String[] args) {

        //  Write a static method that takes in an array of ints, adds them together, and returns the result.
        //  Call your new method inside a main method and print out the result for the following three example arrays:

        //Dataset list
       List<int[]> data = List.of(
                new int[] { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                new int[] { 999, -60, -77, 14, 160, 301 },
                new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                        140, 150, 160, 170, 180, 190, 200, -99 }
        );

       List<int[]> emptyDataList = List.of(
                new int[] {  },
                new int[] { },
                new int[] { }
        );

        intArrayList(data); //Calling method
    }

    public static void intArrayList(List<int[]> data) {

        //Checking for data
        if (data != null && data.size() > 0) {
            int arrayCounter = 1;
            //Looping through array
            for (int[] currentArray : data) {
                int arraySum = 0;

                //Adding the numbers in the array
                for (int i = 0; i < currentArray.length; i++) {
                    arraySum += currentArray[i];
                }
                //Printing the sum of numbers in the arrays with number of array
                System.out.println("#" + arrayCounter + " Array Sum: " + arraySum);
                arrayCounter+=1; //increases the country everytime it loops in
            }

        }


    }
}
