package lesson_04.homework_04;

import java.util.Scanner;

public class Tasc04_2 {
    public static void main(String[] args) {
        /** Задача 2
         Выведите на экран все числа Фибоначчи в заданном интервале. (От 1 до N, где N правый интервал. Задаётся пользователем)
         Реализовать данную задачу через разные циклы(for, while, do wile)*/

        Scanner scanner = new Scanner(System.in);

        int[] fibon = new int[scanner.nextInt()];
        fibon[0] = 1;
        fibon[1] = 1;
        System.out.print(fibon[1]+ " " );
        for (int i = 2; i < fibon.length; i++) {
            fibon[i] = fibon[i - 1] + fibon[i - 2];
            System.out.print(fibon[i] + " " );
        }
        System.out.println();



        int a = 1, b = 1, c = 12, fib = 2, i = 2;

        System.out.print(a);
        while (i < c) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;}
        System.out.println();


            int x = 1;
            int y = 1;
        int n = 150;
            do {
                System.out.print(x + " ");
                y = x + y;
                if (y < n) {
                    System.out.print(y + " ");
                }
                x = x + y;
            } while (x < n);
            System.out.println();
    }
}
