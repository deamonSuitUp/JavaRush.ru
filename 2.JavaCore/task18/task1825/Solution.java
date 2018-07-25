package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        ArrayList<String> files = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (!(fileName = bufferedReader.readLine()).equals("end")){
            String tempMass[] = fileName.split("t");
            int part = Integer.parseInt(tempMass[tempMass.length-1]);
            numbers.add(part);
            files.add(fileName);
        }
        int min, jj;
        String tempFileName;
        for (int i = 0; i < numbers.size()-1; i++) {
            min = numbers.get(i);
            jj = i;
            tempFileName = files.get(i);
            for (int j = i+1; j < numbers.size(); j++) {
                if (min > numbers.get(j)){
                    jj=j;
                    min = numbers.get(j);
                    tempFileName = files.get(j);
                }
            }
            numbers.remove(jj);
            numbers.add(jj,numbers.get(i));
            numbers.remove(i);
            numbers.add(i,min);
            files.remove(jj);
            files.add(jj,files.get(i));
            files.remove(i);
            files.add(i,tempFileName);
        }
        FileOutputStream fileOutputStream = new FileOutputStream ((files.get(0).split(".part"))[0]);
        FileInputStream fileInputStream;
        byte[] buffer;
        for (int i = 0; i < files.size(); i++) {
            fileInputStream = new FileInputStream(files.get(i));
            buffer = new byte[fileInputStream.available()];
            int j = 0;
            while (fileInputStream.available() > 0){
                buffer[j]= (byte) fileInputStream.read();
                j++;
            }
            fileOutputStream.write(buffer);
            fileInputStream.close();
        }
        fileOutputStream.close();
        bufferedReader.close();
    }
}
