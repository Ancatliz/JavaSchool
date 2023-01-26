package lesson_07.homework_07.tasc07_3;

public class Deamond extends Hotel {

    public int bonus; //количество дополнительных номеров

    public Deamond(String name, int room, double price, int bonus) {
        this.bonus = bonus;
    }

    @Override
    void location() {
        System.out.println("Отель " + name + " расположен на центральной улице города");

    }

    @Override
    void roomComfort() {
        System.out.println("Номера оборудованы ванной комнатой, холодильником и кондиционером");
    }

    public void lux(int cena) {
        System.out.println("Отель имеет люкс номера стоимостью " + cena);
    }


}

