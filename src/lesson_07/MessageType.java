package lesson_07;

public enum MessageType {
    MESSAGE("Это сообщение является текстовым", 10),
    IMAGE("Это сообщение является картинкой", 2),
    FILE("Это сообщение является файлом", 1),
    SMILE("Это сообщение является смайликом", 30),
    TYPE("FDJHvbg", 23);

    private String info;
    private int count;

    MessageType(String s, int i) {
        this.info = s;
        this.count = i;
    }

    public String getInfo() {
        return info;
    }

    public int getCount() {
        return count;
    }
}

