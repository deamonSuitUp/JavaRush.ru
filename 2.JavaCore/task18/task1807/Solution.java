package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(r1.readLine());

        //int symbol = ',';
        int count = 0;
        while (inputStream.available() > 0)
            if (inputStream.read() == ',')
                count++;
        inputStream.close();
        r1.close();
        System.out.println(count);
    }
}
