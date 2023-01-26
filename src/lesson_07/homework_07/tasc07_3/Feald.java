package lesson_07.homework_07.tasc07_3;

public class Feald extends Hotel {
    private int bonus; //количество дополнительных номеров

    public Feald(String name, int room, double price, int bonus) {
        this.bonus = bonus;
    }

    @Override
    void location() {
        System.out.println("Отель " + name + " расположен на окраине города с видом на поле с подсолнухами и реку");
    }

    void bungalo(int mnogo) {
        System.out.println("У отеля есть " + bonus + " бунгало стоимостью " + mnogo);
    }

    @Override
    void roomComfort() {
        System.out.println("Бунгало оборудованы ванной комнатой, холодильником с быром, кондиционером, телефоном и чайным сервизом");
    }
}
