package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2, s3;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        int s22 = Integer.parseInt(s2);
        int s33 = Integer.parseInt(s3);
        System.out.println(s1 + " получает " + s22 + " через " + s33 + " лет.");
    }
}
