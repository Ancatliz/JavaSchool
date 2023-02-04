package lesson_07;

public class Dog extends Animal implements Test { // В отличие от extends, интерфейсы можно длетаь более 1

    @Override
    public void abstractSay() {
        System.out.println("Гав");
        System.out.println(info);
    }

    public void jump() {
        System.out.println("Прыгает");
    }

    public Dog() {
        messageType = MessageType.MESSAGE;
    }
}