package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int aa = Integer.parseInt(reader.readLine());
        int bb = Integer.parseInt(reader.readLine());
        int cc = Integer.parseInt(reader.readLine());

        int minimum = min(a, b,aa,bb,cc);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int aa, int bb, int cc) {
        int min = a < b ? a : b;
        min = min < aa ? min : aa;
        min = min < bb ? min : bb;
        min = min < cc ? min : cc;
        return min;
    }
}
