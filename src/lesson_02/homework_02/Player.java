package lesson_02.homework_02;

public class Player {
    // Поля
    private  String name;
    private  int points;


    // Конструкторы

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }


    // Методы

    public void rename(String newname) {
        System.out.print("Игрок " + name + " решил изменить имя на - ");
                name = newname;
        System.out.println(newname);
        }

    int x; // координаты по горизонтали
    int y; // координаты по вертикали

    public String shot(int x, int y) { // нанесение удара игроком
        this.x = x;
        this.y = y;
        return "Игрок " + name + " решил ударить по ячейке " + "[" + x + ":" + y + "]";
        }

    public void getPoints() {  // подсчет очков
        points += 1;
        System.out.println("Количество очков у " + name + ": " + points);
    }
}
