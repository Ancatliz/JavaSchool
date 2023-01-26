package lesson_02.homework_02;

import lesson_07.homework_07.tasc07_4.Otdeli;

public enum ShipType {
    Odnopalub(" - Однопалубный корабль в количестве: ", 4),
    Dwuhpalub(" - Двухпалубный корабль в количестве: ", 3),
    Trehpalub(" - Трёхпалубный корабль в количестве: ", 2),
    Chetirehpalub(" - Четырёхпалубный корабль в количестве: ", 1);

    private String s;
    private int i;

    ShipType(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public int getI() {
        return i;
    }

    public static void info() {
        System.out.println("Типы кораблей: ");
        for (ShipType i: ShipType.values() ) {
            System.out.println(i.name() + i.getS() + i.getI());
        }
    }
}
