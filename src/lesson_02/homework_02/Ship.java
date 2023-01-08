package lesson_02.homework_02;

public class Ship {
    // параметры
 String name;
 int size;
 static String name1 = "Odnopalub";
 static String name2 = "Dwuhpalub";
 static String name3 = "Trehpalub";
 static String name4 = "Chetirehpalub";

    Player player;

    public Ship(Player player) {
        this.player = player;
    }
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
