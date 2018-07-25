package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(r1.readLine()));
        while(reader.ready()){
            System.out.println(new StringBuilder(reader.readLine()).reverse());
        }
        reader.close();
        r1.close();
    }
}
