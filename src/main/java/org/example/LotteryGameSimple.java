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

import java.util.Random;
import java.util.Scanner;

public class LotteryGameSimple {
    public static void main(String[] args) {

        int winOne = 0;
        int winTwo = 0;
        int winThree = 0;
        int winFour = 0;
        int winFive = 0;


        int userOne = 0;
        int userTwo = 0;
        int userThree = 0;
        int userFour = 0;
        int userFive = 0;

        int [] lotteryNumber = new int [5];
        int [] userNumber = new int [5];



        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int i = 1;
        int userEntered = 0;
        while (i <= 5) {
            System.out.println("Enter any number from 1 to 50");
            userEntered = scanner.nextInt();
            if (userEntered < 1 || userEntered > 50) {
                System.out.println("Entered number does not belong to 1 to 50");
            } else {
                switch (i) {
                    case 1:
                        userOne = userEntered;
                        i++;
                        break;


                    case 2:
                        if (userEntered != userOne) {
                            userTwo = userEntered;
                            i++;
                        }
                        break;

                    case 3:
                        if (userEntered != userOne && userEntered != userTwo) {
                            userThree = userEntered;
                            i++;
                        }
                        break;

                    case 4:
                        if (userEntered != userOne && userEntered != userTwo && userEntered != userThree) {
                            userFour = userEntered;
                            i++;
                        }
                        break;

                    case 5:
                        if (userEntered != userOne && userEntered != userTwo && userEntered != userThree && userEntered != userFour) {
                            userFive = userEntered;
                            i++;
                        }
                        break;


                }

            }
        }

        i = 1;
        int randomWin = 0;
        while (i <= 5) {
            randomWin = random.nextInt(1, 51);


            switch (i) {
                case 1:
                    winOne = randomWin;
                    i++;
                    break;


                case 2:

                    if (randomWin != winOne) {
                        winTwo = randomWin;
                        i++;
                    }
                    break;

                case 3:
                    if (randomWin != winOne && randomWin != winTwo) {
                        winThree = randomWin;
                        i++;
                    }
                    break;
                case 4:
                    if (randomWin != winOne && randomWin != winTwo && randomWin != winThree) {
                        winFour = randomWin;
                        i++;
                    }
                    break;

                case 5:
                    if (randomWin != winOne && randomWin != winTwo && randomWin != winThree && randomWin != winFour) {
                        winFive = randomWin;
                        i++;
                    }
                    break;


            }

        }

        System.out.println("Winning numbers: " + winOne + " " + winTwo + " " + winThree + " " + winFour + " " + winFive);
        System.out.println("User entered numbers: " + userOne + " " + userTwo + " " + userThree + " " + userFour + " " + userFive);


    }
}





