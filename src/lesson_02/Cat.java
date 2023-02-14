package lesson_02;

public class Cat {
    // параметры
    String name;
    float whight;
    String color;

    //конструктор


    public Cat() {
    }

    public Cat(String name, float whight, String color) {
        this.name = name;
        this.whight = whight;
        this.color = color;
        System.out.println("Мы создали кошку по 3 параметрам");
    }

    public Cat(String name, float whight) {
        this.name = name;
        this.whight = whight;
    }

    public Cat(String name) {
        this.name = name;
    }

    // методы

    public void sayMiay() {
        System.out.println("Кошка говорит - мяу");
    }


    public void run() {
        System.out.println("Кошка бегает");// Метод который не возврашает значение

    }


    public String getName() {
        System.out.println("Имя кошки -" + name);
        return null;   // Метод который возврашает значение
    }
    String grosName;
    public String rename (String newName, String newnewName){
        name = newName;
        grosName = newnewName;
        return "Новое имя кота - " + newName; // Метод который возврашает значение и принимает
                                              // один или несколько значений (параметров)
    }

    public void srd (String sceng) {// Метод который ничего не возврашает, но что то принемает

    }
}
