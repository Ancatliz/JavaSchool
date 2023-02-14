package lesson_08.homework_08;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main_Home08_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Введите целое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе целое число");
            int b = scanner.nextInt();
            System.out.println("Введите арифметическое действие");
            char symbol = scanner.next().charAt(0);
            calc(a, b, symbol);

        } catch (NoSuchElementException e) {
            System.out.println("Вы ввели не целое число");
        } catch (RuntimeException ex) {
            System.out.println("Непредвиденная ошибка!!!");
        }
    }

    private static void calc(int a, int b, char symbol) {
        if (symbol == '+') {
            System.out.println("Сумма = " + (a + b));
        } else if (symbol == '-') {
            System.out.println("Разница = " + (a - b));
        } else if (symbol == '*') {
            System.out.println("Произедение = " + (a * b));
        } else if (symbol == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Вы ввели неверное арифметическое действие");
        }
    }
}

