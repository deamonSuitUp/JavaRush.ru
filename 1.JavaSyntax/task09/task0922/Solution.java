package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s = r1.readLine();
        SimpleDateFormat old = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat new1 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        SimpleDateFormat new2 = new SimpleDateFormat();
        Date date = old.parse(s);
        String g = new1.format(date);
        System.out.println(g.toUpperCase());
    }
}
