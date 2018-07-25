package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3,s4;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        s4 = r1.readLine();
        int i1,i2,i3,i4,min1,min2,min3;
        i1=Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        i3 = Integer.parseInt(s3);
        i4 = Integer.parseInt(s4);
        min1=minS(i1,i2);
        min2=minS(i3,i4);
        min3=minS(min1,min2);
        System.out.println(min3);
    }
    public static int minS (int min11,int min22){
        if(min11>min22)
            return min11;
        else return min22;
    }
}
