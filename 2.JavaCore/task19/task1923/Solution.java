package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        //String file1 = "E:\\input.txt";
        //String file2 = "E:\\output.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        int ii = 0;
        FileWriter writer = new FileWriter(file2);
        Boolean gotcha = false;
        while (reader.ready()) {
            ii++;
            String s = reader.readLine();
            String ss[] = s.split(" ");
            if (ii == 1)
                ss[0] = ss[0].substring(1,ss[0].length()-1);
            for (int i = 0; i < ss.length; i++) {
                char[] ssChar = ss[i].toCharArray();
                for (int j = 0; j < ssChar.length; j++) {
                    if (ssChar[j] >= '0' && ssChar[j] <= '9') {
                        gotcha = true;
                        break;
                    }
                }
                if(gotcha){
                    writer.write(ss[i] + " ");
                }
                gotcha = false;
            }
        }
        writer.close();
        reader.close();
    }
}
