package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r1.readLine();
        FileInputStream inputStream= new FileInputStream(fileName);
        int max = 0, data;
        while (inputStream.available()>0){
            data = inputStream.read();
            max = (max < data) ? data : max;
        }
        System.out.println(max);
        r1.close();
        inputStream.close();

    }
}
