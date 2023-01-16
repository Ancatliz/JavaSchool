package lesson_04.homework_04;

public class Tasc04_4 {
    /** Задача 4
     На вход подаётся строка. В ней N слов. Вывести в консоль кол-во слов - палиндромов*/
    public static void main(String[] args) {
        String palindrom = "Казак строил шалаш, а дед чесал пуп";
        palindrom = palindrom.replace(",", " ");
        String[] array = palindrom.split(" ");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            String rev = new StringBuffer(array[i]).reverse().toString();
            if (array[i].equalsIgnoreCase(rev) && rev.length() > 1) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
