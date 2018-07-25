package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(r1.readLine()));
        int ii = 0;
        r1.close();
        while (reader.ready()){
            ii++;
            String s = reader.readLine();
            String[] ss = s.split("\\s");
            //if (ii == 1)
                //ss[0] = ss[0].substring(1,ss[0].length());
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < ss.length; i++) {
                arrayList.add(ss[i]);
            }
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                count += Collections.frequency(arrayList,words.get(i));
            }
            if (count == 2)
                System.out.println(s);
        }
        reader.close();
    }
}
