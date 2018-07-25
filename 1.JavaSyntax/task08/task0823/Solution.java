package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        int size = s.length();
        char[] stroka = new char[size];
        s.getChars(0,size,stroka,0);
        if(stroka[0]!=' ')
            stroka[0]=Character.toUpperCase(stroka[0]);
        for (int i = 1; i < stroka.length; i++) {
            if(stroka[i-1]==' ')
                stroka[i]=Character.toUpperCase(stroka[i]);
        }
        for (int i = 0; i < stroka.length; i++) {
            System.out.print(stroka[i]);
        }
    }
}
