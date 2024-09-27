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
//        Распределите ответственность написанного кода в соответствующие классы и методы
//        Сохраните номера лотереи в массиве
//        Введите контроль за количеством номеров в лотереи и от пользователя
//        Создайте класс Константы, определите COUNT_SET_SIZE = 5
//        Добавьте проверку пользовательских номеров с номерами лотереи
//        Реализуйте метод в классе Utils
//        Метод должен принимать два массива (lotteryNumber, userNumber)
//        Возвращать количество совпадений
//        Получите от пользователя 5 номеров, сохраните их в массив
//        Протестируйте работу лотереи в классе StartLottery
//        Выведите результаты на консоль

import java.util.Random;
import java.util.Scanner;

public class CorrectGameVariant {
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

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//

//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("Enter any number from 1 to 50");
//            userOne = scanner.nextInt();
//            if (userOne < 1 || userOne > 50) {
//                System.out.println("Entered number does not belong to 1 to 50");
//            }
//
//        }
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
//                if (i == 1) {
//                    userOne = userEntered;
//                }
//                if (i == 2) {
//                    userTwo = userEntered;
//                }
//                if (i == 3) {
//                    userThree = userEntered;
//                }
//                if (i == 4) {
//                    userFour = userEntered;
//                }
//                if (i == 5) {
//                    userFive = userEntered;
//                }


            }

        }

        i = 1;
        int randomWin = 0;
        while (i <= 5) {
            randomWin = random.nextInt(1, 51);

//            if (i == 1) {
//                winOne = randomWin;
//            }
//            if (i == 2) {
//                winTwo = randomWin;
//            }
//            if (i == 3) {
//                winThree = randomWin;
//            }
//            if (i == 4) {
//                winFour = randomWin;
//            }
//            if (i == 5) {
//                winFive = randomWin;
//            }
            switch (i) {
                case 1:
                    winOne = randomWin;
                    i++;
                    break;

//                if (userEntered != userOne && userEntered != userTwo && userEntered != userThree) {
//                    userFour = userEntered;
//                    i++;
//                }
//                break;

                case 2:

                    if( randomWin != winOne) {
                        winTwo = randomWin;
                    i++;}
                    break;

                case 3:
                    if( randomWin != winOne && randomWin != winTwo) {
                        winThree = randomWin;
                        i++;}
                    break;
                case 4:
                    if( randomWin != winOne && randomWin != winTwo && randomWin != winThree) {
                        winFour = randomWin;
                        i++;}
                    break;

                case 5:
                    if( randomWin != winOne && randomWin != winTwo && randomWin != winThree && randomWin != winFour) {
                        winFive = randomWin;
                        i++;}
                    break;


            }

        }

        System.out.println("Winning numbers: " + winOne + " " + winTwo + " " + winThree + " " + winFour + " " + winFive);
        System.out.println("User entered numbers: " + userOne + " " + userTwo + " " + userThree + " " + userFour + " " + userFive);


    }
}





