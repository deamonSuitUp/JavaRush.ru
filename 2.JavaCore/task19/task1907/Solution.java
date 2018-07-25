package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(r1.readLine());
        int count = 0, ii = 0;
        String temp = "";
        while (reader.ready()) {
            int data = reader.read();
            if (data < 65 || data > 122 || (data > 90 && data < 97) || (data == (int)'\r') || (ii == 0)) {
                if (temp.equals("world"))
                    count++;
                temp = "";
                if (ii != 0)
                    data = reader.read();
                if ((char) data == 'w')
                    temp += (char) data;
                else
                    continue;
                data = reader.read();
                if ((char) data == 'o')
                    temp += (char) data;
                else
                    continue;
                data = reader.read();
                if ((char) data == 'r')
                    temp += (char) data;
                else
                    continue;
                data = reader.read();
                if ((char) data == 'l')
                    temp += (char) data;
                else
                    continue;
                data = reader.read();
                if ((char) data == 'd')
                    temp += (char) data;
                else
                    continue;
            } else temp = "";
            ii++;
        }
        if (temp.equals("world"))
                count++;
        System.out.println(count);
        reader.close();
        r1.close();
    }
}
