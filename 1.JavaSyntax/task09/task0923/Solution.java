package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        String sg=null,ss=null;
        char[] charr = s1.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if(charr[i]!=' '){
            if(isVowel(charr[i])){
                if(i==0) {
                    sg = charr[i] + " ";
                    ss="";
                }
                else sg+=charr[i]+" ";}
            else{ if (i==0) {
                ss = charr[0] + " ";
                sg="";
            }
            else ss+=charr[i]+" ";}
        }}
        System.out.println(sg);
        System.out.println(ss);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}