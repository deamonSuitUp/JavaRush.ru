package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(r1.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        /*ArrayList<StringBuffer> list2 = new ArrayList<StringBuffer>();
        ArrayList<String> list3 = new ArrayList<String>();
        int size=0;
        for (int i = 0; i < list.size(); i++) {
            size=list.get(i).length();
            for (int j = 0; j < size; j++) {
                list.get(i).charAt(j);
            }
        }*/
        int size = list.size();
        for (int i = 0; i < size;) {
            list.add(i+1,list.get(i));
            size++;
            i+=2;
        }

        return list;
    }
}
