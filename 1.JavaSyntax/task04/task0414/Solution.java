package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s = r1.readLine();
        int x = Integer.parseInt(s);
        int xx=365;
        if (x%4==0){
            xx++;
            if(x%100==0&&x%400!=0)
                xx--;

        }
        System.out.println("количество дней в году: "+xx);
    }
}