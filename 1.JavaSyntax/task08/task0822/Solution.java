package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int minn = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if(minn>array.get(i))
                minn=array.get(i);
        }
        return minn;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        List<Integer> ll = new ArrayList<Integer>();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r1.readLine());
        for (int i = 0; i < n; i++) {
            ll.add(Integer.parseInt(r1.readLine()));
        }
        return ll;
    }
}
