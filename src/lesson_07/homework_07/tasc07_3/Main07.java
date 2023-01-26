package lesson_07.homework_07.tasc07_3;

public class Main07 {
    public static void main(String[] args) {
        Deamond deamond = new Deamond("Брилиант", 50, 3500.0, 12);
        deamond.location();
        deamond.reception();
        deamond.roomComfort();
        deamond.door();
        deamond.safeDeposit();
        deamond.lux(4500);


        Creek creek = new Creek("Ручеёк", 50, 3000.0);
        creek.location();
        creek.reception();
        creek.roomComfort();
        creek.door();
        creek.safeDeposit();

        Feald feald = new Feald("Поле", 50, 3500.0, 5);
        feald.location();
        feald.reception();
        feald.roomComfort();
        feald.door();
        feald.safeDeposit();
        feald.bungalo(8000);


    }
}
