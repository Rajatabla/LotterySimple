package main.java.org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
/*
This Class contains all necessary methods to run Lottery game
*/
public class Utils {
    // This method works with user input data
    private static void fillUserArray(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userEntered = 0;
        while (i < Constants.COUNT_SET_SIZE) {
            System.out.println("Enter the " + (i + 1) + " number from 1 to 50");
            userEntered = scanner.nextInt();
            if (userEntered < Constants.MIN_NUMBER || userEntered > Constants.MAX_NUMBER) {
                System.out.println("Entered number does not belong to 1 to 50");
            } else {
                if (!list.contains(userEntered)) {
                    list.add(userEntered);
                    i++;
                }
            }
        }
    }

    // This method works with random data
    public static void fillRandomArray(List<Integer> list) {
        Random random = new Random();
        int i = 0;
        int randomWin = 0;
        while (i < Constants.COUNT_SET_SIZE) {
            randomWin = random.nextInt(Constants.MIN_NUMBER, Constants.MAX_NUMBER + 1);
            if (!list.contains(randomWin)) {
                list.add(randomWin);
                i++;
            }
        }
    }

    // This method fills either one array or another
    public static void fillArraysAuto(List<Integer> list, InputType type) {
        if (type == InputType.USER) {
            fillUserArray(list);
        } else if (type == InputType.RANDOM) {
            fillRandomArray(list);
        }
    }
    
    // This method returns winning user numbers
    public static List<Integer> returnMatchNumbers(List<Integer> listOne, List<Integer> listTwo) {
        return listOne.stream().filter(listTwo::contains).toList();
    }
}
