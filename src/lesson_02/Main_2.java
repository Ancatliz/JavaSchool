package lesson_02;

public class Main_2 {
    public static void main(String[] args) {
     Cat barsik = new Cat("Barsic", 3.4f, "White");
     Cat barsik1 = new Cat("Barsic", 3.4f);
     Cat barsik2 = new Cat("Barsic");

     barsik.sayMiay();

     barsik.run();

        System.out.println(barsik.getName());
        System.out.println(barsik1.getName());
        System.out.println(barsik2.getName());
        System.out.println(barsik.rename("Arnold", "Schwarc"));
        System.out.println(barsik.getName());

    }
}
