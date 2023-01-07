package lesson_02.homework_02;

public class Ship {
    // параметры
String name;
int size;

// конструктор

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //методы


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
