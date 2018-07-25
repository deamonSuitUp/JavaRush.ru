package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String file = r1.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<Integer,String> temp = new TreeMap<Integer,String>(Collections.reverseOrder());
        //TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>(Collections.reverseOrder());
        temp.putAll(map);
        map = temp;
        while (reader.ready()){
            String s = reader.readLine();
            for (Map.Entry<Integer,String> entry : map.entrySet()) {
                //System.out.println(entry.getKey());
                s = s.replaceAll("\\b" + String.valueOf(entry.getKey()) + "\\b",entry.getValue());
            }
            System.out.println(s);
        }
        reader.close();
        r1.close();
    }
}
