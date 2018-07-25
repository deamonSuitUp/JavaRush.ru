package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String param1 = args[0], param2 = args[1], param3 = args[2];
        //String param1 = "E:\\input.txt";
        //String param2 = "E:\\input2.txt";
        //String param3 = "E:\\input3.txt";
        String param1, param2, param3;
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        param1 = r1.readLine();
        param2 = r1.readLine();
        param3 = r1.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(param1);
        FileInputStream fileInputStream2 = new FileInputStream(param2);
        FileInputStream fileInputStream3 = new FileInputStream(param3);
        while (fileInputStream2.available() > 0){
            int data = fileInputStream2.read();
            fileOutputStream.write(data);
        }
        while (fileInputStream3.available() > 0){
            int data = fileInputStream3.read();
            fileOutputStream.write(data);
        }
        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream.close();
    }
}
