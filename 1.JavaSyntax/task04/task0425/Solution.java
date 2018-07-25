package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2; int i1,i2;
        s1 = r1.readLine();
        s2 = r1.readLine();
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        if(i1>0){
            if (i2>0)
                System.out.println(1);
            else System.out.println(4);
        }
        else {
            if(i2>0)
                System.out.println(2);
            else System.out.println(3);
        }
    }
}
