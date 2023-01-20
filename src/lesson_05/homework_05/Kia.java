package lesson_05.homework_05;

public class Kia extends Car implements MiniVen {
    //поля
    private int capacity; // количество посадочных мест

    //конструктор
    public Kia(String model, String color, String privod, String kpp, String fuel, int power, double weight) {
        super(model, color, privod, kpp, fuel, power, weight);
    }

    protected Kia(String model, String color) {
        super(model, color);
    }

    //методы
    @Override
    public void highway() {
        System.out.println("Автомобиль имеет адаптивный круизконтроль");
    }

    @Override
    public void salonFeatures() {
        System.out.println("Кресла задних пассажитов можно сложить. Задний ряд можно демонтировать");
    }
}
