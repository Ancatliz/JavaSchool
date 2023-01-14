package lesson_02.homework_02;

public class Map {

    // поля

    int[][] field = new int[10][10];   // игровое поле
    // 0 - пустая ячейка;
    // 1 - стоит корабль;
    // 2 - враг промахнулся;
    // 3 - враг попал;
    // 4 - корабль уничтожен;


    static int[] rules = new int[]{4, 3, 2, 1}; //  правила игры
    // [0] = 4 - однопалубный
    // [1] = 3 - двухпалубный
    // [2] = 2 - трёхпалубный
    // [3] = 1 - четырёхпалубный

    Player playerMap;

    // конструктор

    public Map(Player playerMap) {  // конструктор отображает принадлежность карты определенному игроку
        this.playerMap = playerMap;
    }

    // методы

   static public int countShips() { //  количество кораблей по правилам игры
        int result = 0;
        for (int i = 0; i < rules.length; i++) {
            result += rules[i];
        }
        return result;
    }

    public void mapStatus() { // состояние ячеек на игровом поле
        System.out.println("Статус карты: ");
        for (int[] i : field) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
    }

    public void shipStanding(int x, int y) {
        field[x][y] = 1;
    }

    public void missed(int x, int y) {
        field[x][y] = 2;
    }

    public void hurt(int x, int y) {
        field[x][y] = 3;
    }

    public void destroed(int x, int y) {
        field[x][y] = 4;
    }
}
