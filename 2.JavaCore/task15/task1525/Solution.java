package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            //InputStream inStream = new FileInputStream(Statics.FILE_NAME);
            BufferedReader r1 = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            String s1;
            while((s1 = r1.readLine()) != null){
                lines.add(s1);
            }
        }catch (IOException e){}
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
