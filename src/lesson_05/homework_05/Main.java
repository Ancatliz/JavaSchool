package lesson_05.homework_05;

public class Main {
    public static void main(String[] args) {
        Tesla teslaX = new Tesla("X", "black", 663);
        Tesla teslaS = new Tesla("S", "red", "full", "automatic", "electric", 670, 2.2);
        teslaS.setMileage(80000);
        teslaS.info();
        teslaX.trunkFeatures();

        Skoda skoda = new Skoda("Superb", "grey", "front", "robot", "petrol", 220, 2050);
        skoda.setMileage(23000);
        skoda.info();
        skoda.trunkFeatures();

        Rivian rivian = new Rivian("blue", 480);
        Rivian rivian1 = new Rivian("blue", "full", "automatic", "electric", 800, 3.5 );
        rivian.setMileage(12000);
        rivian.info();
        rivian.typeFeatures();
        rivian.carBody();
        rivian.patency();
        rivian.Insurance();
        rivian.to();
        rivian.electric();

        Kia kia = new Kia("Carnival", "brown");
        Kia kia1 = new Kia("Carnival", "brown", "front", "manual", "diesel", 199, 2.1);
        kia1.setMileage(6000);
        kia1.info();
        kia1.highway();
        kia1.salonFeatures();
        kia1.size();
    }
}
