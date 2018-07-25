package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> l = new HashSet<String>();
        String s = "Л";
        for (int i = 0; i < 20; i++) {
            l.add(s+i);
        }
        return l;
    }

    public static void main(String[] args) {

    }
}
