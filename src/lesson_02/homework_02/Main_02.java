package lesson_02.homework_02;

import java.util.Arrays;

public class Main_02 {
    public static void main(String[] args) {
        Player captain1 = new Player("Vasya", 0);
        Player captain2 = new Player("Fedya", 0);
        Player captain3 = new Player("Fedya");
        Player captain4 = new Player(0);


        Map field1 = new Map(captain1);
        Map field2 = new Map(captain1);

        captain1.setMap(field1);
        captain2.setMap(field2);

        Ship aurora = new Ship("Aurora", 4);
        Ship tortuga = new Ship("Tortuga", 3);
        Ship ship1 = new Ship(1, captain1);
        Ship ship2 = new Ship("Галандец",2, captain2);


        System.out.println(Ship.name1 + ship1.getSize());

        System.out.println("Имя корабля " + aurora.getName());
        System.out.println("Имя корабля " + tortuga.getName());
        System.out.println("Размер корабля " + aurora.getName() + " " + aurora.getSize());
        System.out.println("Размер корабля " + tortuga.getName() + " " + tortuga.getSize());


        captain1.rename("Vlaseus");
        captain1.getPoints();
        captain2.getPoints();
        System.out.println(captain1.shot(4, 6));
        captain1.getPoints();

        Map map1 = new Map (captain1);
        Map map2 = new Map (captain2);

//       System.out.println (map2.shipStanding(4,6));
        map2.mapStatus();
        System.out.println(Map.countShips());


    }
}
