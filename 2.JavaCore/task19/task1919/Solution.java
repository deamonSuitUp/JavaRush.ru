package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

//в итоге первый элемент всё равно в конце мапы, сортирует без учета первого элемента, дичь какая-то


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        //String file = "E:\\input.txt";
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        TreeMap<String, Double> result = new TreeMap<>();
        while (reader.ready()){
            String[] temp = reader.readLine().split(" ");
            if (temp.length < 2)
                continue;
            if (result.containsKey(temp[0])){
                result.put(temp[0],result.get(temp[0]) + Double.parseDouble(temp[1]));
            }
            else result.put(temp[0],Double.parseDouble(temp[1]));
        }
        for (Map.Entry<String,Double> elem : result.entrySet()) {
            System.out.println(elem.getKey() + " " + elem.getValue());
        }
        fileReader.close();

        /*HashMap<String, Integer> hm = new HashMap<>();
        hm.put("pop",1);
        for (Map.Entry<String, Integer> element: hm.entrySet()) {
            if (element.getKey().equals("pop"))
                hm.put("pop",2+element.getValue());
            System.out.println(element.getKey() + " " + element.getValue());
        }*/
    }
}
