package lesson_05.homework_05;

public class Car {

    //поля
    protected String model;
    protected String color;
    protected String privod;
    protected String kpp;
    protected String fuel;
    protected int power;
    int mileage;
    double weight;

    //конструктор
    public Car(String model, String color, String privod, String kpp, String fuel, int power, double weight) {
        this.model = model;
        this.color = color;
        this.privod = privod;
        this.kpp = kpp;
        this.power = power;
        this.weight = weight;
    }

    protected Car(String model, String color) {
        this.model = model;
        this.color = color;
    }


    //методы
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    protected void info() {
        System.out.println("Автомобиль модели " + model + " " + color + " цвета, мщностью " + power + " л.с. имеет пробег: " + mileage + " км");
    }
}
