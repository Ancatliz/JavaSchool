package lesson_02.homework_02;

public class Ship {
    // поля
    String name;
    int size;
    final static String name1 = "Odnopalub";
    final static String name2 = "Dwuhpalub";
    final static String name3 = "Trehpalub";
    final static String name4 = "Chetirehpalub";

    Player playerShip;


    // конструктор
    public Ship(int size, Player playerShip) {
        this.size = size;
        this.playerShip = playerShip;
    }

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Ship(String name, int size, Player playerShip) {
        this.name = name;
        this.size = size;
        this.playerShip = playerShip;
    }

    //методы


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Player getPlayerShip() {
        return playerShip;
    }

    public void setPlayerShip(Player playerShip) {
        this.playerShip = playerShip;
    }
}
