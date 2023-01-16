package lesson_04.homework_04;

import java.util.Scanner;

public class Tasc04_5 {
    /**  Задача 5
     Напишите программу, которая по месяцу определяет, какое сейчас время года. Например если подать 2, то в консоль напишется Зима, 10 - Осень и т.д.
     Выполнить задачу через if и switch */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 12 || x <= 2) {
            System.out.println("Зима");
        } else if (x > 2 && x < 6) {
            System.out.println("Весна");
        } else if (5 < x && x < 9) {
            System.out.println("Лето");
        } else if (8 < x && x < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Что то пошло не так");
        }



        switch (x) {
            case 1: case 2: case 12: {
                System.out.println("Зима");
                break;
            }
            case 3: case 4: case 5: {
                System.out.println("Весна");
                break;
            }
            case 6: case 7: case 8: {
                System.out.println("Лето");
                break;
            }
            case 9: case 10: case 11: {
                System.out.println("Осень");
                break;
            }

        }
    }
}
