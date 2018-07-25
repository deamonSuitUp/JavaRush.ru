package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String param = args[0];
        //String param = "E:\\input.txt";
        int sum = 0;
        FileInputStream fileInputStream = new FileInputStream(param);
        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            if (data >= 65 && data <= 122)
                sum++;
        }
        System.out.println(sum);
        fileInputStream.close();
    }
}
