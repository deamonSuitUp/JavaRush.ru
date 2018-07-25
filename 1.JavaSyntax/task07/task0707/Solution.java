package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> s1 = new ArrayList<String>( );
        s1.add("aa");
        s1.add("aaa");
        s1.add("asa");
        s1.add("ava");
        s1.add("asaa");
        System.out.println(s1.size());
        for (int i = 0; i < s1.size(); i++) {
            System.out.println(s1.get(i));
        }
    }
}
