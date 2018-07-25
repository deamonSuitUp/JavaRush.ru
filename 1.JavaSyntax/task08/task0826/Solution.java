package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        //int[] array = {2,4,6,7,8,9,0,-6,-5,4,33,4,5,6,77,88,99,122,14,101};
        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        //System.out.println(array.length);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int max = array[0];
        int pro,index;
        for (int i = 0; i < array.length; i++) {
            max=array[i];
            index=i;
            for (int j = i; j < array.length; j++) {
                /*f(max<array[j]) {
                    pro = array[j + 1];
                    array[j+1] = array[j];
                    array[j]=pro;
                }*/
                if(max<array[j]){
                    max=array[j];
                    index=j;
                }
            }
            pro=array[i];
            array[i]=max;
            array[index]=pro;

            //max=array[i+1];

        }
    }
}
