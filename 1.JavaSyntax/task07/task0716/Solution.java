package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        char c;
        int size = list.size();
        for (int j = 0; j < size; j++){
            int r = 0;
            int l = 0;
            for (int i = 0; i < list.get(j).length(); i++) {
                if (list.get(j).charAt(i) == 'р')
                    r++;
                if (list.get(j).charAt(i) == 'л')
                    l++;
            }
            if (r != 0 && l == 0) {
                list.remove(j);
                j--;
                size--;
            }
            if (r == 0 && l != 0) {
                list.add(list.get(j));
            }
        }
        return list;
    }
}