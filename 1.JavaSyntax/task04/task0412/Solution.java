package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String c;
        c = r1.readLine();
        int i;
        i = Integer.parseInt(c);
        if(i>0)
            System.out.println(i*2);
        else if (i<0)
            System.out.println(i+1);
        else System.out.println(i);

    }


    }
