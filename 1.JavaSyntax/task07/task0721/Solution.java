package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i]=Integer.parseInt(reader.readLine());
        }
        maximum=mas[0];
        minimum=mas[0];
        for (int i = 0; i < 20; i++) {
            if(maximum<mas[i])
                maximum=mas[i];
            if(minimum>mas[i])
                minimum=mas[i];
        }
        //System.out.println(maximum+" "+minimum);

        System.out.println(maximum+" ");
        System.out.println(minimum);
    }
}
