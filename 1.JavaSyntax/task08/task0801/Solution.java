package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> se1 = new HashSet<String>();
        se1.add("арбуз");
        se1.add("банан");
        se1.add("вишня");
        se1.add("груша");
        se1.add("дыня");
        se1.add("ежевика");
        se1.add("жень-шень");
        se1.add("земляника");
        se1.add("ирис");
        se1.add("картофель");
        Iterator<String> iterator = se1.iterator();
        while (iterator.hasNext()){
            String text=iterator.next();
            System.out.println(text);
        }

    }
}
