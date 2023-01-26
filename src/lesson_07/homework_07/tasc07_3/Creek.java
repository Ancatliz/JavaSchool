package lesson_07.homework_07.tasc07_3;

public class Creek extends Hotel {

    public Creek(String name, int room, double price) {
    }

    @Override
    void location() {
        System.out.println("Отель " + name + " расположен в спальном районе города");

    }

    @Override
    void roomComfort() {
        System.out.println("Номера оборудованы ванной комнатой, холодильником и телевизором");
    }
}
