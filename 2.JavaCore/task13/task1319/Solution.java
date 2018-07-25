package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.Buffer;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter w1 = new BufferedWriter(new OutputStreamWriter(System.out));
        String destination = r1.readLine();
        //OutputStream outStream = new FileOutputStream(destination);
        BufferedWriter w1 = new BufferedWriter(new FileWriter(new File(destination)));
        do{
            destination = r1.readLine();
            destination+=System.lineSeparator();
            //System.out.println(destination);
            w1.write(destination);
        }while(!destination.equals("exit"+System.lineSeparator()));
        //System.out.println("sss"+ "\n" +"ss" + System.lineSeparator()+"sss" + System.getProperty("line.separator")+"sssxx");
        r1.close();
        w1.close();
    }
}
