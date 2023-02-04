package lesson_05;

import lesson_05.utill.Animal;
import lesson_05.utill.Cat;

public class Lesson_5 {
    /** lesson_05  (12.01.23)
     * Модификаторы доступа и наследование */
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white");
  //      cat = new Cat("Барсик", "white"); // Так сделать мы не сможем
        cat.setWeight((byte) 36); // Модификатор final блокирует изменение переменной.
        // Но не параметры конкретного объекта

        final int[] mas = new int[]{3, 5, 6, 3, 54, 6};
  //      mas = new int[]{2, 5, 32, 5}; // Так сделать мы не сможем

        mas[2] = 13; // С массивами аналогично. Блокируем сам массив,
        // но не его конкретные эллементы


    }
}

