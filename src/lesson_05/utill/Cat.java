package lesson_05.utill;

public class Cat extends Animal{
    private String color;

    @Override
    public void voice() {
        System.out.println("Кошка говорит - Мяу");
    }

    public Cat(String name, String color) {
        super("Cat", name);
        this.color = color;
    }

    @Override
    public void setWeight(byte weight) {
        super.setWeight(weight);
    }

    public String getColor() {
        return color;
    }
}
