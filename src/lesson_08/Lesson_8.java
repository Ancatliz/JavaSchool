package lesson_08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_8 {
    public static void main(String[] args) {
        //try - блок в котором ожидается ошибка
        //catch - блок в котором обрабатывается ошибка
        //throw - который принудительно вызывает ошибку
        //throws - Позволяет пометить метод и предупредить о том,
        // что внутри метода может быть вызвана ошибка

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");

        try {  // Блок, в котором пишем код для отслеживания ошибок.
              // Если произошла ошибка,то программа ищет блок catch с данной ошибкой
            String s = scanner.next();
            number = Integer.valueOf(s); // Если ввести строку в консоль, то будет вызвана ошибка NumberFormatException
            System.out.println("Вы ввели число: " + number);
            throw new OutOfMemoryError(); //Ключевое слово для принудительного вызова любой ошибки
        } catch (RuntimeException ex){  // Блок, который отслеживает ошибку из блока try.
           // Передаётся тип ошибки, который надо обрабатывать текущим блоком и её наследники.
            // Т.к. NumberFormatException является наследником RuntimeException, то её данный блок тоже поймёт
            System.out.println("К сожалению вы ввели не число, а что то иное!");
            System.out.println(ex.getMessage()); // выводит сообщение зашитое в Java
            System.out.println(Arrays.toString(ex.getStackTrace())); // выводит в консоль всю трассировку ошибки
        } finally {   // Блок, который независимо от исхода try будет вызван. Даже если нет блока catch,
            // который отрабатывает ошибку или был выполнен любой другой блок catch
            System.out.println("Программа успешно завершилась");
        }
        ///////////////////////////
        String test = "Test";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                connect(random.nextInt(10));
                return;
            } catch (IOException e) {
                System.out.println("Получили ошибку соединение. Пытаемся сделать заного");
            }
        }

        System.out.println("К сожалению за 10 попыток не удалось сделать соединение");
    }

    public static void connect(int a) throws IOException {
        System.out.println("Попытка получения соединения");

        if (a == 1) {
            System.out.println("Удачное соединение");
        } else {
            throw new IOException();
        }
    }
}

