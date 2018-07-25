package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> m = new HashMap<String, String>();
        m.put("s1","sq1");
        m.put("s1","sq1");
        m.put("s2","sq1");
        m.put("s3","sq1");
        m.put("s4","sqq1");
        m.put("s5","sq1");
        m.put("s6","s1");
        m.put("s7","sqq1");
        m.put("s7","sq1");
        m.put("s8","sqqq1");
        return m;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
