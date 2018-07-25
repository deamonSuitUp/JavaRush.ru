package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        int i1,i2,i3,min1,min2;
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        i3 = Integer.parseInt(s3);
        if(i1+i2>i3&&i1+i3>i2&&i2+i3>i1)
            System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}