package lesson_07.homework_07.tasc07_4;

public class Test {
    public static void main(String[] args) {
info();
        System.out.println();
str();
    }
    public static void info() {
        System.out.println("Отделы института: ");
        for (Otdeli i: Otdeli.values() ) {
            System.out.println(i.name() + i.getS());
        }
    }

    public static void str() {
        System.out.println("Структура адмиристрирования проекта: ");
        for (Struktura i: Struktura.values() ) {
            System.out.println(i.name() + i.getS());
        }
    }
}
