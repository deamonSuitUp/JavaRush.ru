package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s = r1.readLine();
        double d = Double.parseDouble(s);
        d%=5;
        if(d<3)
            System.out.println("зелёный");
        else if (d<4)
            System.out.println("жёлтый");
        else System.out.println("красный");
    }
}