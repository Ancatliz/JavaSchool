package lesson_01.homework_01;

public class Calendar {
    public static void main(String[] args) {
        String[] season = new String[]{"Зима", "Весна", "Лето", "Осень"};
        for (int i = 0; i < 4; i++) {
            System.out.println(season[i]);
        }

        String[] month = new String[12];
        month[0] = "Январь";
        month[1] = "Февраль";
        month[2] = "Март";
        month[3] = "Апрель";
        month[4] = "Май";
        month[5] = "Июнь";
        month[6] = "Июль";
        month[7] = "Август";
        month[8] = "Сентябрь";
        month[9] = "Октябрь";
        month[10] = "Ноябрь";
        month[11] = "Декабрь";
        for (int i = 0; i < 12; i++) {
            System.out.println(month[i]);
        }

        String[] week = new String[7];
        week[0] = "Понедельник";
        week[1] = "Вторник";
        week[2] = "Среда";
        week[3] = "Четверг";
        week[4] = "Пятница";
        week[5] = "Суббота";
        week[6] = "Воскресенье";
        System.out.println(week[2]);
        System.out.println(week[4]);
        System.out.println(week[6]);

     int[] number = new int[31];
    for (int i = 0; i < 31; i++){
        number[i] = i+1;
        System.out.println(number[i]);
        }
    }
}
