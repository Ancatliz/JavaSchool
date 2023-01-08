package lesson_02.homework_02;

public class Main_02 {
    public static void main(String[] args) {
        Player vasya = new Player("Vasya", 0);
        Player fedya = new Player("Fedya", 0);

        Ship avrora = new Ship("Avrora", 4);
        Ship tortuga = new Ship("Tortuga", 3);
        Ship ship1 = new Ship(Ship.name1,1);
        Ship ship2 = new Ship(Ship.name2,2);
        Ship ship3 = new Ship(Ship.name3,3);
        Ship ship4 = new Ship(Ship.name4,4);
        System.out.println(Ship.name1 + ship1.getSize());

        System.out.println("Имя корабля " + avrora.getName());
        System.out.println("Имя корабля " + tortuga.getName());
        System.out.println("Размер корабля " + avrora.getName() + " " + avrora.getSize());
        System.out.println("Размер корабля " + tortuga.getName() + " " + tortuga.getSize());


        vasya.rename("Vlaseus");
        vasya.getPoints();
        fedya.getPoints();
        System.out.println(vasya.shot(4, 6));
        vasya.getPoints();

        Map map1 = new Map (vasya);
        Map map2 = new Map (fedya);

//       System.out.println (map2.shipStanding(4,6));
        map2.mapStatus();


    }
}
