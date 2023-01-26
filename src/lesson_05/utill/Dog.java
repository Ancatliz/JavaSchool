package lesson_05.utill;

public class Dog extends Animal {
    private String test;

    public Dog(String name, String test) {
        super("Cat", name);
        this.test = test;
    }

    @Override
    public void voice() {
        System.out.println("Собака говорит - Гав");
    }

    public String getTest() {
        return test;
    }
}


