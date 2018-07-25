package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int i1,i2,i3,sum=0;
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        i3 = Integer.parseInt(s3);
        if(i1>0)
            sum++;
        if(i2>0)
            sum++;
        if(i3>0)
            sum++;
        System.out.println(sum);

    }
}
