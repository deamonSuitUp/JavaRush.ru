package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        String param = args[0];
        //String param = "E:\\input.txt";
        int count = 0;
        double sumSpaces = 0, sumSymbols = 0;
        FileInputStream fileInputStream = new FileInputStream(param);
        while (fileInputStream.available() > 0){
            count++;
            int data = fileInputStream.read();
            //System.out.println(data);
            //if (count > 3) {
                if (data == 32)
                    sumSpaces++;
                sumSymbols++;
            //}
        }
        String twoCharsForDot = new DecimalFormat("#0.00").format((sumSpaces/sumSymbols)*100);
        System.out.println(twoCharsForDot);
        fileInputStream.close();
    }
}
