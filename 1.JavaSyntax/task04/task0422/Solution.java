package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2; int i2;
        s1 = r1.readLine();
        s2 = r1.readLine();
        i2 = Integer.parseInt(s2);
        if (i2<18)
            System.out.println("Подрасти еще");
    }
}
