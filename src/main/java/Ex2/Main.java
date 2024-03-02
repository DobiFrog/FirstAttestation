package Ex2;

import java.time.LocalDate;

import static Ex2.DateOfWatering.nextWatering;

public class Main {
    public static void main(String[] args) {
        //Даты в "тестах" могут быть неточными. Задание выполнялось давно

        //сегодня (зима)
        LocalDate day = LocalDate.now();

        //вчера
        LocalDate yesterday = day.minusDays(1);
        System.out.println();

        //неделю назад
        LocalDate week = day.minusWeeks(1);
        //System.out.println("Неделю назад " + week);

        //осень
        LocalDate autumn = day.minusMonths(4);
        //System.out.println("осень " + autumn);

        //лето
        LocalDate summer = day.minusMonths(6);
        //System.out.println("лето " + summer);

        //весна
        LocalDate spring = day.minusMonths(9);
        System.out.printf("весна " + spring +"\n");



        //day = day.minusMonths(1);
        day = day.minusDays(5);
        //System.out.println(day);

        nextWatering(spring);

    }
}
