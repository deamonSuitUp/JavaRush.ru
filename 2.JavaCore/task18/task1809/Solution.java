package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(r1.readLine());
        FileOutputStream outputStream = new FileOutputStream(r1.readLine());

        Integer[] symbols = new Integer[inputStream.available()];
        int i = 0;

        while (inputStream.available() > 0) {
            symbols[i] = inputStream.read();
            i++;
        }
        for (int j = i-1; j >= 0; j--) {
            //System.out.println(j);
            outputStream.write(symbols[j]);
        }
        outputStream.close();
        inputStream.close();
        r1.close();
        }
}
