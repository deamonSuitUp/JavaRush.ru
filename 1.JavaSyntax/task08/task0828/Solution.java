package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("January",1);
        hm.put("February",2);
        hm.put("March",3);
        hm.put("April",4);
        hm.put("May",5);
        hm.put("June",6);
        hm.put("July",7);
        hm.put("August",8);
        hm.put("September",9);
        hm.put("October",10);
        hm.put("November",11);
        hm.put("December",12);
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        /*for (Map.Entry<String,Integer> para:hm.entrySet()
             ) {
            if(para.)
        }*/
        System.out.println(s1+" is "+ hm.get(s1)+" month");
    }
}
