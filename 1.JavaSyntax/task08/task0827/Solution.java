package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        //System.out.println(isDateOdd("JANUARY 1 2000"));
        //System.out.println(isDateOdd("MARCH 1 2000"));
        //System.out.println(isDateOdd("MARCH 1 2001"));
        //System.out.println(isDateOdd("JANUARY 2 2020"));
       // System.out.println(isDateOdd("JANUARY 31 2020"));
        //System.out.println(isDateOdd("FEBRUARY 1 2020"));
        /*Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);*/
    }

    public static boolean isDateOdd(String date) {
        Date nY = new Date(date);
        Date date2 = new Date(date);
        nY.setHours(0);
        nY.setMinutes(0);
        nY.setSeconds(0);
        nY.setDate(1);
        nY.setMonth(0);
        long milisec = date2.getTime() - nY.getTime();
        long msinDay = 24 * 60 * 60 * 1000;
        int days = (int) (milisec/msinDay);
        if(days%2==0)
            return true;
        else return false;
    }
}
