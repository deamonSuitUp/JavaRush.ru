package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        int id = Integer.parseInt(args[0]);
        //int id = 3;
        String file;
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        file = r1.readLine();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String temp;
        ArrayList<String[]> massive = new ArrayList<String[]>();
        while ((temp = bufferedReader.readLine()) != null){
            massive.add(temp.split(" "));
        }
        for (int i = 0; i < massive.size(); i++) {
            if ( Integer.parseInt(massive.get(i)[0]) == id)
                System.out.println(massive.get(i)[0] + " " + massive.get(i)[1] + " " + massive.get(i)[2] + " " + massive.get(i)[3]);
        }
        bufferedReader.close();
        r1.close();
    }
}
