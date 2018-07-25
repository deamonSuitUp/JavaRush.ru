package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ii = new int[15];
        BufferedReader r1= new BufferedReader(new InputStreamReader(System.in));
        int chet = 0, nechet=0;
        for (int i = 0; i < 15; i++) {
            ii[i]=Integer.parseInt(r1.readLine());
            if(i%2==0)
                chet+=ii[i];
            else nechet+=ii[i];
        }
        if(chet>nechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
            else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
