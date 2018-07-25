package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1;// = r1.readLine();
        int i1=0;// = Integer.parseInt(s1);
        double sum=0; int schet=0;
        while(true){
            s1 = r1.readLine();
            i1 = Integer.parseInt(s1);
            sum += i1!=-1 ? i1 : 0;
            if(i1==-1)
                break;
            schet++;
        }
        if (schet==0){
            System.out.println(0);
            return;
        }
        System.out.println(sum/schet);
    }
}

