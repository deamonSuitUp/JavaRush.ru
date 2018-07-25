package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r1.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        int min = inputStream.read(), data;

        while (inputStream.available() > 0){
            data = inputStream.read();
            min = (min > data) ? data : min;
        }

        System.out.println(min);

        r1.close();
        inputStream.close();
    }
}
