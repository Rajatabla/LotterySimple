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

/*
This is run Lottery Class
 */
public class LotteryGameSimple {
    public static void main (String[] args) {
        StartLottery game = new StartLottery();
        game.run();
    }
}

















