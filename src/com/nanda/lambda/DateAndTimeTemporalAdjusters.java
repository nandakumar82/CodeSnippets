package com.nanda.lambda;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateAndTimeTemporalAdjusters {
    public static void main(String... strings) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("firstDayOfMonth: "
                + currentDateTime.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("lastDayOfMonth: "
                + currentDateTime.with(TemporalAdjusters.lastDayOfMonth()));
        System.out
                .println("firstDayOfNextMonth: "
                        + currentDateTime.with(TemporalAdjusters
                        .firstDayOfNextMonth()));
        System.out.println("firstDayOfNextYear: "
                + currentDateTime.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println("firstDayOfYear: "
                + currentDateTime.with(TemporalAdjusters.firstDayOfYear()));
        System.out
                .println("next DayOfWeek: "
                        + currentDateTime.with(TemporalAdjusters
                        .next(DayOfWeek.MONDAY)));
    }
}