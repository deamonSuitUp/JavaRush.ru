package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        String s2 = r1.readLine();
        String s3 = r1.readLine();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        if (i1==i2){
            System.out.print(i1 +" "+ i2);
            if (i2==i3)
            {
                System.out.print(" "+i3);
                return;
            }
        }
        if (i3==i2)
            System.out.print(i3 +" "+ i2);
        if (i3==i1)
            System.out.print(i3 +" "+ i1);


    }
}