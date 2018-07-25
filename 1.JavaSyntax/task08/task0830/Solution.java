package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        //String[] sss = {"ba","ass","ab","bb","gf","kj"};
        //sort(sss);
        /*for (int i = 0; i < sss.length; i++) {
            System.out.println(sss[i]);
        }*/
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
        //String s1 = "Aass";
       // String s2 = "bbss";
        //System.out.println(isGreaterThan(s1,s2));
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String min;
        String prom;
        int jj;
        for (int i = 0; i < array.length; i++) {
            min=array[i];
            jj=i;
            for (int j = i; j < array.length; j++) {
                if(isGreaterThan(min,array[j])==true) {
                    min = array[j];
                    jj=j;
                }
            }
            prom=array[i];
            array[i]=min;
            array[jj]=prom;

        }
        /*for (int i = array.length-1; i >0; i--) {
            max=array[i];
            jj=i;
            for (int j = array.length-1; j > 0; j--) {
                if(isGreaterThan(array[j-1],max)==true){
                    max=array[j-1];
                    jj=j-1;
                }
            }
            prom=array[i];
            array[i]=max;
            array[jj]=prom;

        }*/
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
