package lesson_05.homework_05;

//поля
public class Tesla extends Car implements Sedan {
    private int powerReserv;


    //конструктор
    public Tesla(String model, String color, String privod, String kpp, String fuel, int power, double weight) {
        super(model, color, privod, kpp, fuel, power, weight);
    }

    protected Tesla(String model, String color, int powerReserv) {
        super("X", color);
        this.powerReserv = powerReserv;
    }

    //методы
    @Override
    public void trunkFeatures() {
        System.out.println("Автомобиль имеет дополнительное багажное пространство под капотом");
    }
}
