package lesson_04;

public class Lesson_4 {
    /**
     * Циклы
     * Арифметические операторы
     * Рекурсия
     * Разбор домашнего задания Морской бой
     */

    public static class Main {
        public static void main(String[] args) {
            int b = 5;

            System.out.println(factorial(b));
        }

        public static int factorial(int n) {
            int result = 1;
            if (n == 1) {
                return result;
            }
            result = n * factorial(n - 1);
            return result;
        }
    }
}
