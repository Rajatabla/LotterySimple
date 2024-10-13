//import java.util.Random;
//import java.util.Scanner;
//
//
//public class Run {
//
//    fillArrays(true, userNumber);
//    fillArrays(false, lotteryNumber);
//
//
//    public static void fillArrays(boolean flag, int[] array) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int i = 0;
//        while (i < COUNT_SET_SIZE) {
//            if (flag) {
//                System.out.println("Enter the " + (i + 1) + " number from 1 to 50");
//                int userEntered = scanner.nextInt();
//                if (userEntered < 1 || userEntered > 50) {
//                    System.out.println("Entered number does not belong to 1 to 50");
//                } else if (!isNumInArray(userEntered, array)) {
//                    array[i] = userEntered;
//                    i++;
//                }
//            } else {
//                int randomWin = random.nextInt(1, 51);
//                if (!isNumInArray(randomWin, array)) {
//                    array[i] = randomWin;
//                    i++;
//                }
//            }
//        }
//    }
//}
