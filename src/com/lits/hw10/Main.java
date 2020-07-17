package com.lits.hw10;

import java.time.*;
import java.util.stream.Collectors;
class Main {

    public static void main(String[] args)  {

        // today - теперішня дата
        LocalDate today = LocalDate.now();

        // дата народження
        LocalDate birthday = LocalDate.of(1973, 2, 9);

        // різниця в місяцях між днем народженням і тепер датою
        System.out.println(Period.between(birthday, today).getMonths());  // 5

        // сьогодні не мій дн
        System.out.println(today.equals(birthday)); // false

        // провіряєм чи високосний рік
        System.out.println("Рік " + today.getYear() + " - високосний? : " + today.isLeapYear());  // true

        // скільки днів є між двома датами
        LocalDate daysBehind = today.minusDays(7);
        Period period = Period.between(today, daysBehind);
        int dif = period.getDays();
        System.out.println(dif);   // 7

        // вивід дат між двома датами
        LocalDate date = LocalDate.of(2020,7,12);
        System.out.println(date.datesUntil(today).collect(Collectors.toList()));  // [2020-07-12, 2020-07-13, 2020-07-14]

    }
}
