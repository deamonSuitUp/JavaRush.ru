package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> ii = new ArrayList<Integer>();
        for (int j = 0; j < 5; j++) {
            ii.add(Integer.parseInt(reader.readLine()));
        }
        int schet=0,zap;
        for (int i = 0; i < ii.size(); i++) {
            schet=0;
            for (int j = 0; j < ii.size()-1; j++) {
                if(ii.get(j)>ii.get(j+1)){
                    zap = ii.get(j);
                    ii.set(j,ii.get(j+1));
                    ii.set(j+1,zap);
                    schet++;
                }
            }
            if(schet==0)
                break;
        }
        for (int i = 0; i < ii.size(); i++) {
            System.out.println(ii.get(i));

        }
    }
}
