package lesson_10.homework_10;

import java.sql.Array;
import java.util.*;

public class Main_Home10_1 {
    public static void main(String[] args) {
        MinMax<Integer> minMax = new MinMax<>();
        Integer[] num;
        System.out.println("Массив Integer");
        valueMinMax(new Integer[]{5, 6, 9, 3, 2});
        System.out.println("Массив Float");
        valueMinMax(new Float[]{3.1f, 1.6f, 7.8f, 2.1f, 2f});
        System.out.println("Массив Long");
        valueMinMax(new Long[]{9L, 6L, 7L, 2L});
    }

    public static <T extends Number> MinMax<T> valueMinMax(T[] number) {
        Arrays.sort(number);
        T min = number[0];
        T max = number[number.length - 1];
        MinMax<T> n = new MinMax<>(min, max);
        n.setMin(min);
        n.setMax(max);
        System.out.println("Минимальное значение массива: " + min + "\n" + "Максимальное значение массива: " + max);
        return new MinMax<T>(min, max);
    }
}







