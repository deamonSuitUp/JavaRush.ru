package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;int i1,i2;
        s1 = r1.readLine();
        s2 = r1.readLine();
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        for(int i=0;i<i1;i++) {
            for (int j = 0; j < i2; j++) {
                System.out.print("8");
            }
            System.out.println();
        }


    }
}
