package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r1.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        LinkedList<Integer> link1 = new LinkedList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        while (inputStream.available() > 0)
            link1.add(inputStream.read());

        inputStream.close();

        int summ = 1;
        for (int i = 0; i < link1.size(); i++) {
            for (int j = i+1; j < link1.size(); j++) {
                if (link1.get(j) == link1.get(i)){
                    summ++;
                    link1.remove(j);
                    j--;
                }
            }
            array1.add(i,summ);
            summ = 1;
        }
        //System.out.println(link1);
        //System.out.println(array1);

        int max = array1.get(0);
        for (int i = 1; i < array1.size(); i++) {
            max = (max < array1.get(i)) ? array1.get(i) : max;
        }

        //System.out.println(max);

        for (int i = 0; i < array1.size(); i++) {
            if ( max == array1.get(i) )
                System.out.print(link1.get(i) + " ");
        }



        r1.close();
    }
}
