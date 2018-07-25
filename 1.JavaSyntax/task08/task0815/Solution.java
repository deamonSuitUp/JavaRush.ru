package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hm = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            hm.put("s"+i,"as");
        }
        //hm.put("ssa",""+5);
        //hm.put("sssa",""+5);
        return hm;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int imya = 0;/*
        HashMap<String,String> copy = new HashMap<String, String>();
        for (Map.Entry<String,String> para:map.entrySet()
                ) {
            copy=map;
        Iterator<Map.Entry<String,String>> iter = copy.entrySet().iterator();
        Map.Entry<String,String> kz = iter.next();
        String pred = kz.getValue();
        while(iter.hasNext()){
            String seichas = kz.getKey();
            if(seichas.equals(pred))
                imya++;

        }

        }*/
      /*///  ArrayList<HashMap<String, String>> kuchi = new ArrayList<HashMap<String, String>>();
        ArrayList<String> names = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        int size = 0,count=0;
        if (iter.hasNext()) {
            Map.Entry<String, String> kz = iter.next();
            names.add(kz.getValue());
        }
        for (Map.Entry<String, String> para : map.entrySet()
                ) {
            for (int i = 0; i < names.size(); i++) {
                if (para.getValue().equals(names.get(i))) {
                    count++;
                    break;
                }
                else
                    size++;
                if (size == names.size()) {
                    names.add(para.getValue());
                    break;
                }
            }
            size = 0;

        }
        if(count==1)
            return 0;
        else return count;/*///
        for (Map.Entry<String,String> para: map.entrySet()
             ) {
            if(para.getValue().equals(name))
                imya++;
        }
        return imya;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int size=0;
        for (Map.Entry<String,String> para:map.entrySet()){
            if(para.getKey().equals(lastName))
                size++;
        }
        return size;

    }

    public static void main(String[] args) {
        /*HashMap<String,String> m1 = createMap();
        System.out.println(m1);
        System.out.println(getCountTheSameFirstName(m1,""));
        System.out.println(getCountTheSameLastName(m1,""));*/
    }
}
