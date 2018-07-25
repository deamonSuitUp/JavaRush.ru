package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(r1.readLine());
        FileWriter writer = new FileWriter(r1.readLine());
        BufferedReader reader1 = new BufferedReader(reader);
         BufferedWriter writer1 = new BufferedWriter(writer);
        String temp;
        while ((temp = reader1.readLine()) != null){
            //String[] tempMass = temp.split("\\W");
            String[] tempMass = temp.split(" ");
            for (int i = 0; i < tempMass.length; i++) {
                try{
                    //System.out.println(Integer.parseInt(tempMass[i]));
                    writer1.write(Integer.parseInt(tempMass[i]) + " ");
                }catch (NumberFormatException e){
                }
            }
        }
        writer1.close();
        reader1.close();
        writer.close();
        reader.close();
        r1.close();
    }
}
