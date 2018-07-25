package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(r1.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(r1.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(r1.readLine());

        int count2 = (inputStream1.available()%2 == 0) ? inputStream1.available()/2 : inputStream1.available()/2 + 1;
        int count3 = inputStream1.available()/2;

        /*int count2, count3;
        count2 = inputStream1.available()/2;

        if (inputStream1.available()%2 == 1)
            count2++;
            */
        //System.out.println(count2);

        byte[] part = new byte[count2];
        inputStream1.read(part);
        outputStream2.write(part,0,count2);
        part = new byte[count3];
        inputStream1.read(part);
        outputStream3.write(part,0,count3);

        outputStream3.close();
        outputStream2.close();
        inputStream1.close();
        r1.close();

    }
}
