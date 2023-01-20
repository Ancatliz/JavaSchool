package lesson_05.homework_05;

public class Skoda extends Car implements Sedan {


    //конструктор
    public Skoda(String model, String color, String privod, String kpp, String fuel, int power, double weight) {
        super(model, color, privod, kpp, fuel, power, weight);
    }

    //методы
    @Override
    public void trunkFeatures() {
        System.out.println("Автомобиль обладает повышенным объемом багажника");
    }





}
