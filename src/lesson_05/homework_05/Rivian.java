package lesson_05.homework_05;

public class Rivian extends Car implements Pikap{
    private int powerReserv;

    public Rivian(String color, String privod, String kpp, String fuel, int power, double weight) {
        super("Rivian", color, privod, kpp, fuel, power, weight);
    }

    protected Rivian(String color, int powerReserv) {
        super("Rivian", color);
        this.powerReserv = powerReserv;
    }

    @Override
    public void typeFeatures() {
        System.out.println("У автомобиля есть функция увеличения клиренса");
    }

    @Override
    public void patency() {
        System.out.println("Данный автомобиль обладает повышенной проходимостью");

    }

    @Override
    public void carBody() {
        System.out.println("Кузов автомобиля можно переоборудовать в каркас фургона");
    }
}
