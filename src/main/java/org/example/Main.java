package main.java.org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* 
This is a simple Lottery Game that is combined in one file.
*/
public class Main {
    // This is the quantity of Lottery numbers.
    public static final int COUNT_SET_SIZE = 5; 

    public static void main(String[] args) {
        int[] lotteryNumber = new int[COUNT_SET_SIZE];
        int[] userNumber = new int[COUNT_SET_SIZE];
        int[] matchNumbers = returnMatchNumbers(lotteryNumber, userNumber);

        System.out.println("User entered numbers: " + Arrays.toString(userNumber));
        System.out.println("Winning numbers: " + Arrays.toString(lotteryNumber));
        System.out.println("Matching numbers: " + Arrays.toString(matchNumbers));
    }
    
    // This method checks if the number belongs to the array
    public static boolean isNumInArray(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }
   
    // This method returns winning numbers
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
