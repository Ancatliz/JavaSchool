package lesson_09;

import java.io.IOException;
import java.util.Arrays;

public class Main_9 {
    public static void main(String[] args) throws IOException {
        byte[] info = new byte[12];
        System.out.println("Ввведите текст, для записи");
        System.in.read(info); // выводит из консоли введенное туда (аналог Scanner)
        char[] result = new char[12];

        for (int i = 0; i < info.length; i++) {
            result[i] = (char) info[i];
        }

        String resultString = new String(result);
        System.out.println("Вы ввели:" + resultString);
    }
}
