package com.javarush.task.task05.task0532;

import java.io.*;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum,temp;
        int n = Integer.parseInt(reader.readLine());
        if(n==0){
            System.out.println(0);
            return;}
        maximum=Integer.parseInt(reader.readLine());
        for (int i = 1; i < n; i++) {
            temp = Integer.parseInt(reader.readLine());
            if(temp>maximum)
                maximum=temp;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
