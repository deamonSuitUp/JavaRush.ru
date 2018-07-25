package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static java.lang.Short.parseShort;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException, Exception {
        //напиште тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        short s;
        Integer i;
        Double d;
        while(!s1.equals("exit")) {
            s1 = r1.readLine();
            try {
                i = Integer.parseInt(s1);
                if (i > 0 && i < 128)
                    print(Short.parseShort(s1));
                else print(i);
            } catch (NumberFormatException e) {
                try {
                    print(Double.parseDouble(s1));
                } catch (NumberFormatException ee) {
                    print(s1);
                }
            }

            /*if(s1 instanceof String)
                print(s1);
            else if(s1.toLowerCase().contains("."))
                print(Double.parseDouble(s1));
            else if(Short.parseShort(s1)>0&&Short.parseShort(s1)<128)
                print(Short.parseShort(s1));
            else if(Integer.parseInt(s1)<=0||Short.parseShort(s1)>=128)
                print(Integer.parseInt(s1));
            else if(s1 instanceof String)
                print(s1);*/

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
