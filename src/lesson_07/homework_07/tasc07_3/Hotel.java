package lesson_07.homework_07.tasc07_3;

public abstract class Hotel {
    protected String name; //название отеля
    protected int room; // количество номеров
    protected double price; // стоимость проживания в стандартном номере

    abstract void location();

    abstract void roomComfort();

    void reception() {
        System.out.println("В холе отеля располагается стойка администратора");
    }

    void door() {
        System.out.println("Двери номеров отеля открываются электронным ключем");
    }

    void safeDeposit() {
        System.out.println("У админмстратора расположен сейф, в котором можно оставлять ценные вещи");
    }
}
