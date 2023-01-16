package lesson_04.homework_04;

public class Tasc04_7 {
    /**  Задача 7
     Возведение числа 5 в N-ую степень. На вход подаём степень, в ответе получаем число 5 в степени N. */
    public static void main(String[] args) {
        System.out.println(change(5, 3));
    }
        public static int change(int x, int y) {
            if (y == 1){
                return x;}
            else {
                return x * change(x, y - 1);
            }
    }
}
