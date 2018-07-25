package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3;
        int i1,i2,i3;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        i3 = Integer.parseInt(s3);
        if(i1 == i2&& i1 == i3)
            return;
        if(i1!=i2&&i1!=i3&&i2!=i3)
            return;
        if(i1!=i2&&i1!=i3){
            System.out.print(1);
            return;
        }
        if(i2!=i1&&i2!=i3){
            System.out.println(2);
            return;
        }
        else System.out.println(3);

    }
}
