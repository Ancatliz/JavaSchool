package lesson_02.homework_02;

public class Main_02 {
    public static void main(String[] args) {
        Player vasya = new Player("Vasya", 0);
        Player fedya = new Player("Fedya", 0);

        Ship avrora = new Ship("Avrora", 4);
        Ship tortuga = new Ship("Tortuga", 3);

        System.out.println("Имя корабля " + avrora.getName());
        System.out.println("Имя корабля " + tortuga.getName());
        System.out.println("Размер корабля " + avrora.getName() + " " + avrora.getSize());
        System.out.println("Размер корабля " + tortuga.getName() + " " + tortuga.getSize());


        vasya.rename("Vlaseus");
        vasya.getPoints();
        fedya.getPoints();
        System.out.println(vasya.shot(4, 6));
        vasya.getPoints();


    }
}
