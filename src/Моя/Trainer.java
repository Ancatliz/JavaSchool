package Моя;

public class Trainer {
    public static void main(String[] args) {
        Integer[] number = new Integer[]{5, 6, 9, 3, 2};
        int min = number[0];
        int max = 0;
        for (int i = 0; i<number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }

            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

