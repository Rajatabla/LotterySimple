package main.java.org.example;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    private static void fillUserArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userEntered = 0;
        while (i < Constants.COUNT_SET_SIZE) {
            System.out.println("Enter the " + (i + 1) + " number from 1 to 50");
            userEntered = scanner.nextInt();
            if (userEntered < 1 || userEntered > 50) {
                System.out.println("Entered number does not belong to 1 to 50");
            } else {
                if (!isNumInArray(userEntered, array)) {
                    array[i] = userEntered;
                    i++;
                }

            }
        }
    }

    public static boolean isNumInArray(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static void fillRandomArray(int[] array) {

        Random random = new Random();
        int i = 0;
        int randomWin = 0;
        while (i < Constants.COUNT_SET_SIZE) {
            randomWin = random.nextInt(1, 51);
            if (!isNumInArray(randomWin, array)) {
                array[i] = randomWin;
                i++;
            }
        }
    }

//    public static void fillArray(int[] array, InputType type) {
//        switch (type) {
//
//            case USER:
//                fillUserArray(array);
//                break;
//
//            case RANDOM:
//                fillRandomArray(array);
//                break;
//             default
//        }
//    }

    public static void fillArraysAuto(int[] array, InputType type) {
        if (type == InputType.USER) {
            fillUserArray(array);
        } else if (type == InputType.RANDOM) {
            fillRandomArray(array);

        }
    }


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

