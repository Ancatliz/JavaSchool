package lesson_02.homework_02;

public class Player {
    // Поля
    public String name;
    public int points;
    Ship[] shipsList;
    Map map;


    // Конструкторы


    public Player(String name) {
        this.name = name;
        shipsList = new Ship[Map.countShips()];
    }

    public Player(int points) {
        this.points = points;
        shipsList = new Ship[Map.countShips()];
    }

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
        shipsList = new Ship[Map.countShips()];
    }


    // Методы

    public void rename(String newname) {
        System.out.print("Игрок " + name + " решил изменить имя на - ");
               name = newname;
        System.out.println(newname);
        }


    public String shot(int x, int y) { // нанесение удара игроком по координатам x:y
        return "Игрок " + name + " решил ударить по ячейке " + "[" + x + ":" + y + "]";
        }

    final public void getPoints() {  // подсчет очков
        points += 1;
        System.out.println("Количество очков у " + name + ": " + points);
    }

    final public void setMap(Map map) {
        this.map = map;
    }
}
