package main.java.org.example;

import java.util.Arrays;

public class StartLottery {
    // This method strts the Lottery game
    public void run() {
        int[] lotteryNumber = new int[Constants.COUNT_SET_SIZE];
        int[] userNumber = new int[Constants.COUNT_SET_SIZE];

        Utils.fillArraysAuto(userNumber, InputType.USER);
        Utils.fillArraysAuto(lotteryNumber, InputType.RANDOM);

        int[] matchNumbers = Utils.returnMatchNumbers(lotteryNumber, userNumber);

        System.out.println("Winning numbers: " + Arrays.toString(lotteryNumber));
        System.out.println("User entered numbers: " + Arrays.toString(userNumber));
        System.out.println("Matching numbers: " + Arrays.toString(matchNumbers));
    }
}
