package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone0", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        //map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date(1,1,15));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        int mon = 0;
        ArrayList<String> s1 = new ArrayList<String>();
        //for (Map.Entry<String,Date> para:map.entrySet()) {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Date> para = iter.next();
            mon = para.getValue().getMonth();
            if (mon > 4 && mon < 8) {
                s1.add(para.getKey());
                //map.remove(para.getKey(), para.getValue());
                //System.out.println(s1);

            }


        }
        int size = s1.size();
        for (int i = 0; i < size; i++) {
            //System.out.println(map.get(s1.get(0)));
            map.remove(s1.get(0));
            s1.remove(0);
            //size--;
        }
    }

    public static void main(String[] args) {
        //HashMap<String,Date> m1 = createMap();
        //System.out.println(m1);
        //removeAllSummerPeople(m1);
        //System.out.println(m1);
        //Date d1 = new Date("JUNE 1 1980");
        //ystem.out.println(d1.getMonth());
    }
}
