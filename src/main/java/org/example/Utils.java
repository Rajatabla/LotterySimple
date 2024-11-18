package main.java.org.example;

import java.util.Random;
import java.util.Scanner;
/*
This Class contains all necessary methods to run Lottery game
*/
public class Utils {
    // This method works with user input data
    private static void fillUserArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userEntered = 0;
        while (i < Constants.COUNT_SET_SIZE) {
            System.out.println("Enter the " + (i + 1) + " number from 1 to 50");
            userEntered = scanner.nextInt();
            if (userEntered < Constants.MIN_NUMBER || userEntered > Constants.MAX_NUMBER) {
                System.out.println("Entered number does not belong to 1 to 50");
            } else {
                if (!isNumInArray(userEntered, array)) {
                    array[i] = userEntered;
                    i++;
                }
            }
        }
    }
   
    // This method checks if the number belongs to array
    public static boolean isNumInArray(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }

    // This method works with random data
    public static void fillRandomArray(int[] array) {
        Random random = new Random();
        int i = 0;
        int randomWin = 0;
        while (i < Constants.COUNT_SET_SIZE) {
            randomWin = random.nextInt(Constants.MIN_NUMBER, Constants.MAX_NUMBER + 1);
            if (!isNumInArray(randomWin, array)) {
                array[i] = randomWin;
                i++;
            }
        }
    }

    // This method fills either one array or another
    public static void fillArraysAuto(int[] array, InputType type) {
        if (type == InputType.USER) {
            fillUserArray(array);
        } else if (type == InputType.RANDOM) {
            fillRandomArray(array);
        }
    }
    
    // This method returns winning user numbers
    public static int[] returnMatchNumbers(int[] arrayOne, int[] arrayTwo) {
        int[] matchNumbers = new int[arrayOne.length];
        int j = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (isNumInArray(arrayOne[i], arrayTwo)) {
                matchNumbers[j] = arrayOne[i];
                j++;
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = matchNumbers[i];
        }
        return result;
    }
}
