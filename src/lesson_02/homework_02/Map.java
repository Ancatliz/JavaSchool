package lesson_02.homework_02;

public class Map {

    // параметры

    int [][] field = new int [10] [10];
         // 0 - пустая ячейка;
    int a = 1; // стоит корабль;
    int b = 2; // враг промахнулся;
    int c = 3; // враг попал;
    int d = 4; // корабль уничтожен;


    static int[] rules = new int[] {1, 2, 3, 4}; //  правила игры
    // 1 - четырёхпалубный
    // 2 - трёхпалубный
    // 3 - двухпалубный
    // 4 - однопалубный

    Player player;

    // конструктор


    public Map() {
    }

    public Map(Player player) {
        this.player = player;
        this.rules = new int[getShipCount()];
    }

    public Map(int[][] field) {
        this.field = field;
        this.rules = new int[getShipCount()];
    }
    // методы

    public void mapStatus () {
        System.out.println("Статус карты: ");
        for ( int [] i : field) {
            for ( int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void shipStanding(int x, int y) {
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field [i].length; j++) {
//                int [] i= x;
//            }
//
//        }
//        }
//        field [x] [y] = a;
    }

    public void miss(int x, int y) {
            field [x] [y] = b;
        }

    public void hit(int x, int y) {
        field [x] [y] = b;
    }
    public void destroed(int x, int y) {
        field [x] [y] = c;
    }

    public int getShipCount() {
        return rules.length;

    }


}
