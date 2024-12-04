package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class StartLottery {
    // This method starts the Lottery game
    public void run() {

        List<Integer> lotteryNumber = new ArrayList<>();
        List<Integer> userNumber = new ArrayList<>();

        Utils.fillArraysAuto(userNumber, InputType.USER);
        Utils.fillArraysAuto(lotteryNumber, InputType.RANDOM);

        List<Integer> matchNumbers = Utils.returnMatchNumbers(lotteryNumber, userNumber);

        System.out.println("Winning numbers: " + lotteryNumber);
        System.out.println("User entered numbers: " + userNumber);
        System.out.println("Matching numbers: " + matchNumbers);
    }
}
