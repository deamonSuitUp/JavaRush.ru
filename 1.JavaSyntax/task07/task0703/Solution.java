package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String list[] = new String[10];
        int[] ii = new int[10];
        BufferedReader r1= new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list[i]=r1.readLine();
            ii[i]=list[i].length();}
        for (int i = 0; i < 10; i++) {


            System.out.println(ii[i]);
        }
    }
}
