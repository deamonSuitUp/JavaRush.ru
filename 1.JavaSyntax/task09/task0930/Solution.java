package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        int max=0,count=0,index;
        String nString=null;String prom,min;
        for (int i = array.length-1; i > -1; i--) {
            if(isNumber(array[i])){
                count++;
                max =  Integer.parseInt(array[i]);
            }
            else nString = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if(isNumber(array[i])){
                max=Integer.parseInt(array[i]);
                index=i;
                for (int j = i; j < array.length; j++) {
                    if(isNumber(array[j])&&max<Integer.parseInt(array[j])){
                        max=Integer.parseInt(array[j]);
                        index=j;
                    }
                }
                prom=array[i];
                array[i]= String.valueOf(max);
                array[index]=prom;
            }
            else{
                min=array[i];
                index=i;
                for (int j = i; j < array.length; j++) {
                    if(!isNumber(array[j])&&(isGreaterThan(min,array[j]))){
                        min=array[j];
                        index=j;
                    }
                }
                prom=array[i];
                array[i]=min;
                array[index]=prom;
            }
        }
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------");*/
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
