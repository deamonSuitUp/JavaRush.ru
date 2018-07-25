package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> main3 = new ArrayList<Integer>();
        ArrayList<Integer> main2 = new ArrayList<Integer>();
        ArrayList<Integer> main1 = new ArrayList<Integer>();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            main.add(Integer.parseInt(r1.readLine()));
        }
        for (int i = 0; i < 20; i++) {
            if(main.get(i)%3==0)
                main3.add(main.get(i));
            if(main.get(i)%2==0)
                main2.add(main.get(i));
            if(main.get(i)%3!=0&&main.get(i)%2!=0)
                main1.add(main.get(i));
        }
        printList(main3);
        printList(main2);
        printList(main1);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
