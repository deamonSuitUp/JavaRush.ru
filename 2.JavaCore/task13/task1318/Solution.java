package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s = r1.readLine();
        InputStream is1 = new FileInputStream(s);
        //OutputStream os1 = new BufferedOutputStream(new OutputStreamWriter());
        while(is1.available() > 0){
            int data = is1.read();
            System.out.print((char)data);
        }
        is1.close();
        r1.close();
        /*InputStream inStream = new FileInputStream("F:/input.txt");
        OutputStream outStream = new FileOutputStream("F:/output.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write((byte)data); //записываем прочитанный байт в другой поток.
            System.out.println((char)data);
        }
        byte[] b = new byte[4];
        inStream.close(); //закрываем потоки
        outStream.close();*/
    }
}