package lesson_04.homework_04;

public class Tasc04_1 {
    /** Задача 1
     Выведите в консоль таблицу умножения. (Решение должно быть без массивов, только циклы) */

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int t = j * i;
                if (t < 10) {
                    System.out.print(t + "  ");
                } else {
                    System.out.print(t + " ");
                }
            }
            System.out.println();
        }
    }
}
