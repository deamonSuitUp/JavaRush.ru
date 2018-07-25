package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String param1 = args[0];
        String param2 = args[1];
        String param3 = args[2];
        //String param1 = "-e";
        //String param2 = "E:\\input.txt";
        //String param3 = "E:\\output.txt";
        FileInputStream fileInputStream = new FileInputStream(param2);
        FileOutputStream fileOutputStream = new FileOutputStream(param3);
        if (param1.equals("-e")){
            while (fileInputStream.available() > 0)
                fileOutputStream.write(fileInputStream.read()+1);
        }
        else
            while (fileInputStream.available() > 0)
                fileOutputStream.write(fileInputStream.read()-1);
        fileOutputStream.close();
        fileInputStream.close();
    }

}
