package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(r1.readLine());

        LinkedList<Integer> link = new LinkedList<Integer>();

        while (inputStream.available() > 0)
            link.add(inputStream.read());

        inputStream.close();
        r1.close();

        //System.out.println(link);

        for (int i = 0; i < link.size(); i++) {
            for (int j = i+1; j < link.size(); j++) {
                if ( link.get(j) == link.get(i) ){
                    link.remove(j);
                    j--;
                }
            }
        }
        //System.out.println(link);

        int temp;
        for (int i = 0; i < link.size(); i++) {
            for (int j = i+1; j < link.size(); j++) {
                if ( link.get(i) > link.get(j)){
                    //temp = link.get(j);
                    link.add(i,link.get(j));
                    link.remove(j+1);
                }
            }
        }
        for (int i = 0; i < link.size(); i++) {
            System.out.print(link.get(i) + " ");
        }
    }
}
