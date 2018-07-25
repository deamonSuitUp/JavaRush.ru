package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        int i2;
        s1 = r1.readLine();
        s2 = r1.readLine();
        i2 = Integer.parseInt(s2);
        while(i2>0){
            i2--;
            System.out.println(s1);
        }

    }
}
