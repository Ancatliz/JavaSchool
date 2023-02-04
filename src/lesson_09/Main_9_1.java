package lesson_09;

import java.io.IOException;
import java.io.PrintStream;

public class Main_9_1 {
    public static void main(String[] args) throws IOException {
        String out = "Enter the next\n"; // Данная реализацяи работает только на цифрах,
        // сиволах и англиских буквах
        PrintStream printStream = System.out;
//        try (OutputStream printStream = System.out) { // try with resources .
            // Данная конструкция позволяет нам создавать ресурс, пользоваться им.
            // А закрытие произойдёт автоматически.
            // Ресурсом может быть любой класс, который унаследовал интерфейс Closeable
            // Под капотом создаётся блок finally, где вызывается метод close()

            write(out, printStream);

            byte[] info = new byte[12];
            System.in.read(info);

            write("You entered: ", printStream);

            for (int i = 0; i < info.length; i++) {
                System.out.write(info[i]);
            }
                printStream.close();  // close - закрывает работу программы
            }
        private static void write(String out, PrintStream printStream) {
            char[] mas = out.toCharArray();
            for (int i = 0; i < out.length(); i++) {
                int a = mas[i];
                printStream.write(a);
            }
            printStream.flush(); // flush - делает сохранение на данном этапе но не закрывает программу
        }
    }
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        OutputStream printStream = System.out;
//        try {
//            write(out, printStream);
//
//            write(out, printStream);
//            byte[] info = new byte[12];
//            System.in.read(info);
//
//            byte[] info = new byte[12];
//            System.in.read(info);
//            write("You entered: ", printStream);
//
//            write("You entered: ", printStream);
//            for (int i = 0; i < info.length; i++) {
//                System.out.write(info[i]);
//            }
//
//            for (int i = 0; i < info.length; i++) {
//                System.out.write(info[i]);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                printStream.close();
//            }

