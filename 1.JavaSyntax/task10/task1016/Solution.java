package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
            //words.add("qwe");
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        int count=0;
        int elsee;
        result.put(list.get(0),1);
        for (int i = 1; i < list.size(); i++) {
            elsee=0;
            for (Map.Entry<String, Integer> para: result.entrySet()
                 ) {
                if(para.getKey().equals(list.get(i))){
                    count = para.getValue();
                    result.remove(para.getKey());
                    result.put(list.get(i),count+1);
                    elsee=0;
                    break;
                }
                elsee=1;
            }
            if(elsee==1)
                result.put(list.get(i),1);
        }


        return result;
    }

}

