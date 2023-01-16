package lesson_04.homework_04;

import java.util.Scanner;

public class Tasc04_3 {
    /** Задача 3
     Выведите в консоль сумму всех цифр, от заданного числа. (Число заранее не известно)
     Например у числа 1234, сумма цифр будет 1 + 2 + 3 + 4 = 10. В консоль выведем просто 10
     Попробовать решить несколькими вариантами при помощи разных циклов*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum + " " + "\n");


        int summa = 0;
        for (n = scanner.nextInt(); n != 0; n /= 10) {
            summa += (n % 10);
        }
        System.out.println(summa + " " + "\n");

        int summma = 0;
        sum(n, summma);
    }
    public static void sum(int n, int summma){
        if(n!=0){
            summma+=n%10;
            sum(n/10, summma);
        }
        else System.out.println(summma);
    }
    }

