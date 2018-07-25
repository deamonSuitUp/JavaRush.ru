package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        //String file1 = "E:\\input.txt";
        //String file2 = "E:\\output.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        FileWriter writer = new FileWriter(file2);
        int ii = 0;
        String lastLine = "";
        while (reader.ready()){
            ii++;
            String s = reader.readLine();
            String ss[] = s.split(" ");
            if (ii == 1)
                ss[0] = ss[0].substring(1,ss[0].length()-1);
            for (int i = 0; i < ss.length; i++) {
                if (ss[i].length() > 6)
                    lastLine += ss[i] + ",";
            }
        }
        if (lastLine.length() > 5)
            lastLine = lastLine.substring(0,lastLine.length()-1);
        //System.out.println(lastLine);
        writer.write(lastLine);
        writer.close();
        reader.close();
    }
}
