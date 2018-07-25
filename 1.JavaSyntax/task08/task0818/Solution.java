package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("s1",2000);
        hm.put("s2",2000);
        hm.put("s3",2000);
        hm.put("s4",2000);
        hm.put("s5",2000);
        hm.put("s6",2000);
        hm.put("s7",2000);
        hm.put("s8",200);
        hm.put("s9",200);
        hm.put("s0",20);
        return hm;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String,Integer> copy1 = new HashMap<String, Integer>(map);
        HashMap<String,Integer> copy2 = new HashMap<String, Integer>(map);
        for (Map.Entry<String,Integer> para1:copy1.entrySet()) {
            if(para1.getValue()<500)
                map.remove(para1.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String,Integer> copy = createMap();
        System.out.println(copy);
        removeItemFromMap(copy);
        System.out.println(copy);*/
    }
}