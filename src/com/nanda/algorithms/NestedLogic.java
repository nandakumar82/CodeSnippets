package com.nanda.algorithms;

import java.util.Scanner;

/**
 * Created by nandakumar.menon on 08-04-2017.
 */
public class NestedLogic {


    private static int fine;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Days actualDays = new Days(in.nextInt(), in.nextInt(), in.nextInt());
        Days expectedDays = new Days(in.nextInt(), in.nextInt(), in.nextInt());

        performCalculation(actualDays, expectedDays);

        //System.out.println("actual Days " + actualDays);
        //System.out.println("expected Days " + expectedDays);
        System.out.println(fine);

    }

    private static void performCalculation(Days actualDays, Days expectedDays) {
        int dayDifference;
        int monthDifference;
        if ((expectedDays.getYear() == actualDays.getYear())) {
            if ((expectedDays.getMonth() == actualDays.getMonth())) {
                if ((expectedDays.getDay() == actualDays.getDay()) || (expectedDays.getDay() > actualDays.getDay())) {
                    //No fine
                    fine = 0;
                } else {
                    dayDifference = actualDays.getDay() - expectedDays.getDay();
                    fine = dayDifference * 15;
                }
            } else if(expectedDays.getMonth() < actualDays.getMonth()) {
                monthDifference = actualDays.getMonth() - expectedDays.getMonth();
                fine = monthDifference * 500;
            }

        } else if(expectedDays.getYear() > actualDays.getYear()){
            fine = 0;
        } else {
            fine = 10000;
        }
    }

    static class Days {

        int day;
        int month;
        int year;

        Days(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Days{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }

        int getDay() {
            return day;
        }

        int getMonth() {
            return month;
        }

        int getYear() {
            return year;
        }


    }
}
