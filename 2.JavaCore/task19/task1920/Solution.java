package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        //String file = "E:\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        HashMap<String,Double> hm = new HashMap<>();
        while (reader.ready()){
            String[] s = reader.readLine().split(" ");
            if (s.length < 2)
                continue;
            if (hm.containsKey(s[0]))
                hm.put(s[0],hm.get(s[0]) + Double.parseDouble(s[1]));
            else hm.put(s[0], Double.parseDouble(s[1]));
        }
        Pair maxPair = new Pair(null,0.0);
        for (Map.Entry<String,Double> entry : hm.entrySet()) {
            if (entry.getValue() > maxPair.var){
                maxPair.name = entry.getKey();
                maxPair.var = entry.getValue();
            }
        }
        for (Map.Entry<String,Double> entry : hm.entrySet()) {
            if (entry.getValue().equals(maxPair.var))
                System.out.println(entry.getKey());
        }
        reader.close();
    }
    public static class Pair {
        String name;
        Double var;
        public Pair(String name, Double var){
            this.name = name;
            this.var = var;
        }
    }
}
