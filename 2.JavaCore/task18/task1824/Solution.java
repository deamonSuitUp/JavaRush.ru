package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = "";
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        try {
            while(true) {
                file = r1.readLine();
                fileInputStream = new FileInputStream(file);
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(file);
            r1.close();
            return;
        }
    }
}
