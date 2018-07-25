package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(r1.readLine());
        BufferedReader reader1 = new BufferedReader(reader);
        FileWriter writer = new FileWriter(r1.readLine());
        BufferedWriter writer1 = new BufferedWriter(writer);
        String temp;
        while ((temp = reader1.readLine()) != null) {
            char[] charArr = temp.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '.')
                    charArr[i] = '!';
            }
            temp = String.valueOf(charArr);
            writer1.write(temp);
        }
        writer1.close();
        writer.close();
        reader1.close();
        reader.close();
        r1.close();
    }
}
