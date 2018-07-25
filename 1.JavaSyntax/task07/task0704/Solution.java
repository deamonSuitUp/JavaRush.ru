package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        int[] ii = new int[10];
        for (int i = 0; i < 10; i++) {
            ii[9-i]=Integer.parseInt(r1.readLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ii[i]);
        }
    }
}

