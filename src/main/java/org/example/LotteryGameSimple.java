package main.java.org.example;
//Реализовать простую лотерею, используя конструкцию if-else-if:
//Создать класс для лотереи
//В методе main() реализовать лотерею
//Добавить переменные для выигрышных номеров (5 номеров)
//Добавить переменные для номеров пользователя
//Получить от пользователя 5 номеров, используем Сканер
//Ограничить игровые номера от 1 до 50
//Рандомально присвоить в переменные выигрышные номера
//Распечатать на консоль номера лотереи и номера введенные пользователем

/////////////

//Изменить написанный код
//        Замените конструкцию if-else на switch кейсы
//        Исключите повторяемость выпадающих номеров
//        Т.е. Номера от 1 до 50 должны выпадать только один раз
//        В методе main протестировать работу измененного кода лотереи

////////////////////

//Изменить написанный код
//        Распределите ответственность написанного кода в соответствующие классы и методы - ???
//        Сохраните номера лотереи в массиве - ???
//        Введите контроль за количеством номеров в лотереи и от пользователя
//        * Создайте класс Константы, определите COUNT_SET_SIZE = 5
//        Добавьте проверку пользовательских номеров с номерами лотереи
//        Реализуйте метод в классе Utils
//        Метод должен принимать два массива (lotteryNumber, userNumber)
//        Возвращать количество совпадений
//        Получите от пользователя 5 номеров, сохраните их в массив
//        Протестируйте работу лотереи в классе StartLottery
//        Выведите результаты на консоль

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class LotteryGameSimple {
    public static final int COUNT_SET_SIZE = 5;

    public static void main(String[] args) {


        int[] lotteryNumber = new int[COUNT_SET_SIZE];
        int[] userNumber = new int[COUNT_SET_SIZE];


        fillArrayRandom(lotteryNumber);

        fillUserArray(userNumber);

        int matchNumbers =  returnMatchNumbers(lotteryNumber, userNumber);



        System.out.println("Winning numbers: " + Arrays.toString(lotteryNumber));
        System.out.println("User entered numbers: " + Arrays.toString(userNumber));
        System.out.println("Matching numbers: " + matchNumbers);


    }

    private static void fillUserArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userEntered = 0;
        while (i < COUNT_SET_SIZE) {
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

    public static void fillArrayRandom(int[] array) {

        Random random = new Random();
        int i = 0;
        int randomWin = 0;
        while (i < COUNT_SET_SIZE) {
            randomWin = random.nextInt(1, 51);
            if (!isNumInArray(randomWin, array)) {
                array[i] = randomWin;
                i++;
            }


        }
    }

    public static int returnMatchNumbers(int[] arrayOne, int[] arrayTwo) {
        int matchNumbers = 0;

        for (int i = 0; i < arrayOne.length; i++) {

            for (int j = 0; j < arrayTwo.length; j++) {

                if (arrayOne[i] == arrayTwo[j]) {
                    matchNumbers++;

                    break;
                }
            }
        }
        return matchNumbers;


    }

}
















