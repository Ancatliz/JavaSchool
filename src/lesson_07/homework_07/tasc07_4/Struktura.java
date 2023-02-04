package lesson_07.homework_07.tasc07_4;

public enum Struktura {
    GIP_1(" - ГИП Московской дороги"),
    GIP_2(" - ГИП Восточного полигона"),
    BOSS_TP(" - Начальник отдела тяговые подстанции"),
    BOSS_KS(" - Начальник отдела контактной сети"),
    INGENER_TP_1(" - Инженер отдела тяговые подстанции по Московской дороге"),
    INGENER_TP_2(" - Инженер отдела тяговые подстанции по Восточному полигону"),
    INGENER_KS_1(" - Инженер отдела контактная сеть по Московской дороге"),
    INGENER_KS_2(" - Инженер отдела контактная сеть по Восточному полигону");

    private String s;

    Struktura(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}