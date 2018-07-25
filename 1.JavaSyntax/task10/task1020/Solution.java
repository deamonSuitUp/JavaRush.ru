package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            //array[i]=30-i;
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int index,prom,min;
        for (int i = 0; i < array.length; i++) {
            min=array[i];
            index=i;
            for (int j = i; j < array.length; j++) {
                if(min>array[j]) {
                    min = array[j];
                    index=j;
                }
            }
            prom=array[i];
            array[i]=min;
            array[index]=prom;
        }
    }
}
