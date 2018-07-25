package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3,s4;
        //int i2,i3,i4;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        s4 = r1.readLine();
        int i2 = Integer.parseInt(s2);
        int i4 = Integer.parseInt(s4);
        int i3 = Integer.parseInt(s3);
        System.out.println("Меня зовут "+s1+".");
        System.out.println("Я родился "+ i4+"."+i3+"."+i2);

    }
}
