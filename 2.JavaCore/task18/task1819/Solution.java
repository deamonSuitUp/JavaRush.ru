package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2;
        file1 = bufferedReader.readLine();
        file2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        int[] temp = new int[fileInputStream.available()];
        int i = 0;
        while (fileInputStream.available() > 0){
            temp[i] = fileInputStream.read();
            //System.out.println(temp[i]);
            i++;
        }
        fileInputStream.close();
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        while (fileInputStream2.available() > 0)
            fileOutputStream1.write(fileInputStream2.read());
        for (int j = 0; j < temp.length; j++) {
            fileOutputStream1.write(temp[j]);
        }
        fileInputStream2.close();
        fileOutputStream1.close();
        bufferedReader.close();
    }
}
