package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date d1 = new Date();
        int day;
        day = d1.getDay();
        day = d1.getMonth();
        System.out.println(day);
    }
}
