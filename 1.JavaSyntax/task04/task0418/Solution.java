package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        s1 = r1.readLine();
        s2 = r1.readLine();
        int i1,i2;
        i1=Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        if(i1<i2)
            System.out.println(i1);
        else System.out.println(i2);

    }
}