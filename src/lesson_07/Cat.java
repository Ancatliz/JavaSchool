package lesson_07;

public class Cat extends Animal {

    @Override
    public void abstractSay() {
        System.out.println("Мяу");
    }

    public void run() {
        System.out.println("Кошка бежит");
    }

    public Cat() {
        messageType = MessageType.SMILE;
    }
}
