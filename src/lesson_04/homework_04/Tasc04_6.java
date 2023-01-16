package lesson_04.homework_04;

public class Tasc04_6 {
    /**  Задача 6
     Решите при помощи рекурсии и цикла ( 2 разных решения) задачу перевода из десятичной системы счисления в двоичную. */
    public static void main(String[] args) {
        int desyat = 222;
        String dvoich = "";
        while (desyat >= 1) {
            dvoich = (desyat % 2) + dvoich;
            desyat /= 2;
        }
        System.out.println(dvoich);


        System.out.println(toBinaryString(222));
    }

        public static String toBinaryString(int des) {
            return des > 0 ? toBinaryString(des / 2) + String.valueOf(des % 2) : "";
        }
    }

