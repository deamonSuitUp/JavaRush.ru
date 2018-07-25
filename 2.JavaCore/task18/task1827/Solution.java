package com.javarush.task.task18.task1827;

/*
Прайсы
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String productName = args[1], price = args[2], quantity = args[3];
        String productName = "product", price = "112.12", quantity = "55";
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String file = r1.readLine();
        String data;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<String> list = new ArrayList<String>();
        while ((data = bufferedReader.readLine()) != null){
            list.add(data);
        }
        bufferedReader.close();
        // надо найти наибольший id
        String temp;
        int idInt = 0, tempInt;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String[] mass = list.get(i).split(" ",2);
            tempInt = Integer.parseInt(mass[0]);
            idInt = (idInt < tempInt) ? tempInt : idInt;
        }
        idInt++;
        String id = String.valueOf(idInt);
        char[] idChar = id.toCharArray();
        char[] productNameChar = productName.toCharArray();
        char[] priceChar = price.toCharArray();
        char[] quantityChar = quantity.toCharArray();
        String additionalString = "";
        for (int i = 0; i < 8; i++) {
            try{
                additionalString += idChar[i];
            }catch (ArrayIndexOutOfBoundsException e){
                additionalString += ' ';
            }
        }
        for (int i = 8; i < 38; i++) {
            try{
                additionalString += productNameChar[i-8];
            }catch (ArrayIndexOutOfBoundsException e){
                additionalString+= ' ';
            }
        }
        for (int i = 38; i < 46; i++) {
            try{
                additionalString += priceChar[i-38];
            }catch (ArrayIndexOutOfBoundsException e){
                additionalString+= ' ';
            }
        }
        for (int i = 46; i < 50; i++) {
            try{
                additionalString += quantityChar[i-46];
            }catch (ArrayIndexOutOfBoundsException e){
                additionalString+= ' ';
            }
        }

        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < list.size(); i++) {
            fileWriter.write(list.get(i));
        }
        fileWriter.append('\n');
        fileWriter.write(additionalString);
        fileWriter.close();
        r1.close();
    }
}
