package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] iii = new int[20];
        int[] i = new int[10];
        int[] ii = new int[10];
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 20; j++) {
            iii[j]= Integer.parseInt(r1.readLine());
        }
        for (int j = 0; j < 10; j++) {
            i[j]=iii[j];
        }
        for (int j = 10; j < 20; j++) {
            ii[j-10]=iii[j];
            System.out.println(ii[j-10]);
        }
    }
}
