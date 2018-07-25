package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        //String s = "зима";
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("зима");
            return;
        }
        if (month == 5 || month == 3 || month == 4) {
            System.out.println("весна");
            return;
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
            return;
        }
        if (month==10||month==9||month==11)
            System.out.println("осень");
        //else System.out.println("осень");
    }
}