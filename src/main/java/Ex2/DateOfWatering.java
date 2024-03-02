package Ex2;

import java.time.LocalDate;

public class DateOfWatering {
    private static int humidity(){

        double randomValue = Math.random() * 101;
        //return (int) randomValue;
        //return 20;
        //return 30;
        return 40;

    }

    public static void nextWatering(LocalDate lastWatering){

        //int nowHumidity = humidity();

        LocalDate today = LocalDate.now();

        //вчера, сегодня поливали
        if((lastWatering  == today) || (lastWatering  == today.minusDays(1))){
            //зима
            if((lastWatering.getMonthValue() == 12 || lastWatering.getMonthValue() == 1
                    || lastWatering.getMonthValue() == 2)){
                System.out.println("Дата следующего полива: " + lastWatering.plusMonths(1));
            }
            //весна, осень
            if((lastWatering.getMonthValue() == 3 || lastWatering.getMonthValue() == 4
                    || lastWatering.getMonthValue() == 5) || lastWatering.getMonthValue() == 9
                    || lastWatering.getMonthValue() == 10 || lastWatering.getMonthValue() == 11){
                System.out.println("Дата следующего полива: " + lastWatering.plusWeeks(1));
            }
            //лето
            if ((lastWatering.getMonthValue() == 6 || lastWatering.getMonthValue() == 7
                    || lastWatering.getMonthValue() == 8)){
                //вчера полили
                if(lastWatering  == today.minusDays(1)){
                    System.out.println("Дата следующего полива: " + today.plusDays(1));
                }
                //сегодня
                else {
                    System.out.println("Дата следующего полива: " + today.plusDays(2));
                }

            }

        }
        //влажность < 30
        else if (humidity() < 30){
            System.out.println("Дата следующего полива: " + today);
        }
        //попробовать запустить без if
        else if (humidity() >= 30) {
            //зима
            if((lastWatering.getMonthValue() == 12 || lastWatering.getMonthValue() == 1
                    || lastWatering.getMonthValue() == 2)){
                System.out.println("Дата следующего полива: " + lastWatering.plusMonths(1));
            }
            //весна
            if((lastWatering.getMonthValue() == 3 || lastWatering.getMonthValue() == 4
                    || lastWatering.getMonthValue() == 5) || lastWatering.getMonthValue() == 9
                    || lastWatering.getMonthValue() == 10 || lastWatering.getMonthValue() == 11){
                System.out.println("Дата следующего полива: " + lastWatering.plusWeeks(1));
            }
            //лето
            if ((lastWatering.getMonthValue() == 6 || lastWatering.getMonthValue() == 7
                    || lastWatering.getMonthValue() == 8)){
                System.out.println("Дата следующего полива: " + today);
            }
        }
    }
}
