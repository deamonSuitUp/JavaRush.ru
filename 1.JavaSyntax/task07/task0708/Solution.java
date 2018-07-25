package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
       // ArrayList<String> list2 = new ArrayList<String>();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(r1.readLine());
        }
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if(max<strings.get(i).length())
                max=strings.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if(max==strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }
    }
}
