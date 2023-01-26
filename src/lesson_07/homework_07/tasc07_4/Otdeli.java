package lesson_07.homework_07.tasc07_4;

public enum Otdeli {
    /**
     Данный класс в связке с классом Struktura я бы использовал для распределения входящей документации.
     Например: приходит документация определенного типа, сначала определяется какому отделу она принадлежит,
     затем какому оттветственному в своей сфереответственности она передаётся.
     */
    BURO_GIP(" - Бюро главных инженеров проектов (ГИП)"),
    OTDEL_TP(" - Отдел тяговых подстанций (ТП)"),
    OTDEL_KS(" - Отдел контактной сети (КС)"),
    OTDEL_ESN(" - Отдел электроснабжения");

    private String s;

    Otdeli(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}
