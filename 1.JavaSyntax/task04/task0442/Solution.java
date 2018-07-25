package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s; int i,sum=0;
        while (true){
            s = r1.readLine();
            i = Integer.parseInt(s);
            if(i==-1){
                sum+=i;
                System.out.println(sum);
                return;
            }
            sum+=i;
        }
    }
}
