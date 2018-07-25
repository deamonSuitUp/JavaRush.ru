package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2;
        file1 = bufferedReader.readLine();
        file2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        String temp = "";
        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            //System.out.println((char)data);
            if (data == (char)' ') {
                okrugl(temp, fileOutputStream);
                fileOutputStream.write(' ');
                temp = "";
                continue;
            }
            temp += (char)data;
        }
        okrugl(temp,fileOutputStream);
        fileOutputStream.close();
        fileInputStream.close();
        bufferedReader.close();
    }
    public static void okrugl(String temp, FileOutputStream fos) throws IOException {
        Double dd, okrug;
        dd = Double.parseDouble(temp);
        if (dd > 0)
            okrug = dd + 0.5;
        else okrug = dd - 0.49;
        Integer ii = dd.intValue();
        Integer okrugII = okrug.intValue();
        if ((okrugII > ii) && dd > 0)
            ii++;
        else if ((dd < 0) && (okrugII < ii))
            ii--;
        String ss = "" + ii;
        byte[] bb = ss.getBytes();
        fos.write(bb);
    }
}
