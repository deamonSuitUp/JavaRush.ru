package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(r1.readLine());
        FileWriter writer = new FileWriter(r1.readLine());
        int i = 0;
        while (reader.ready()) {
            i++;
            int data = reader.read();
            if (i%2 == 0)
                writer.write(data);
        }
        writer.close();
        reader.close();
        r1.close();
    }
}
