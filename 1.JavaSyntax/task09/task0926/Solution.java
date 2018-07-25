package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> mass = new ArrayList<int[]>();
        int[] rr1 = {1,2,3,4,5};
        int[] rr2 = {1,2};
        int[] rr3 = {1,2,3,4};
        int[] rr4 = {1,2,3,4,5,6,7};
        int[] rr5 = {};
        mass.add(rr1);
        mass.add(rr2);
        mass.add(rr3);
        mass.add(rr4);
        mass.add(rr5);
        return mass;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
