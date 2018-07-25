package com.javarush.task.task15.task1527;

//import com.oracle.tools.packager.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        //String str = "http://javarush.ru/alpha/index.html?dd&dd&dd&obj=ss&ss&dd";//&view=rr&name";
        String str = r1.readLine();
        String[] subStr;
        String delimeter = "\\?"; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
        str = subStr[1];
        delimeter = "&";
        subStr = null;
        subStr = str.split(delimeter);
        char[] strChar = new char[str.length()];
        int index = 0;
        strChar = str.toCharArray();
        ArrayList<String> slova = new ArrayList<String>();
        slova.add("");
        boolean wasequals = false;
        String temp;
        String objString="";
        for (int i = 0; i < strChar.length; i++) {
            if(strChar[i]=='&') {
                if(index>0&&wasequals==true){
                    if(slova.get(index-1).equals("obj"))
                        objString=slova.get(index);
                    slova.remove(index);
                    i++;
                    slova.add("");
                    wasequals=false;
                }else {
                    index++;
                    i++;
                    slova.add("");
                    wasequals=false;
                }
            }
            if(strChar[i]=='='){
                wasequals=true;
                index++;
                i++;
                slova.add("");
            }
            temp=slova.get(index)+strChar[i];
            slova.remove(index);
            slova.add(temp);
        }
        if(wasequals) {
            if(slova.get(index-1).equals("obj"))
                objString=slova.get(index);
            slova.remove(index);
        }
        for (int i = 0; i < slova.size(); i++) {
            System.out.print(slova.get(i));
            if(i==slova.size()-1)
                System.out.println();
            else System.out.print(" ");
        }
        //System.out.println("ss");
        r1.close();
        if(objString.isEmpty())
            return;
        else{
            try{
                double d = Double.parseDouble(objString);
                alert(d);
                return;
            }catch (Exception e){
                alert(objString);
                return;
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
