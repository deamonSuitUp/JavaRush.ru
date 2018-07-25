package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("s1","ss1");
        hm.put("s2","ss1");
        hm.put("s3","ss2");
        hm.put("s4","ss2");
        hm.put("s5","ss3");
        hm.put("s6","ss4");
        hm.put("s7","ss5");
        hm.put("s8","ss6");
        hm.put("s9","ss7");
        hm.put("s0","ss8");
        return hm;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        /*HashMap<String,String> copy = new HashMap<String, String>(map);
        ArrayList<String> keys = new ArrayList<String>();
        ArrayList<String> value = new ArrayList<String>();
        ArrayList<Integer> nomeravalue = new ArrayList<Integer>();
        Iterator<Map.Entry<String,String>> iter = copy.entrySet().iterator();
        if(iter.hasNext())
            value.add(iter.next().getKey());
        for (Map.Entry<String,String> para:copy.entrySet()) {
            for (int i = 0; i < value.size(); i++) {
                if(para.getValue().equals(value.get(i))){

                }
            }
        }
*/
        HashMap<String,String> copy1 = new HashMap<String, String>(map);
        HashMap<String,String> copy2 = new HashMap<String, String>(map);
        int m=0;
        for (Map.Entry<String,String> para1: copy1.entrySet()) {
            for (Map.Entry<String,String> para2: copy2.entrySet()) {
                if(para1.getValue().equals(para2.getValue())) {
                    m++;
                    if(m>1)
                        removeItemFromMapByValue(map, para2.getValue());
                }
            }
            m=0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String,String> m1 = createMap();
        System.out.println(m1);
        removeTheFirstNameDuplicates(m1);
        System.out.println(m1);*/
    }
}
