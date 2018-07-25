package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        //InputStream inStream = new FileInputStream(r1.readLine());
        BufferedReader r2 = new BufferedReader(new InputStreamReader(new FileInputStream(r1.readLine())));
        String s;
        ArrayList<Integer> chetko = new ArrayList<Integer>();
        while(((s=r2.readLine())!=null)){
            if(Integer.parseInt(s)%2==0)
            chetko.add(Integer.parseInt(s));
        }
        /*for (int i = 0; i < chetko.size(); i++) {
            chetko.get(i);
        }*/
        int min,jj;
        for (int i = 0; i < chetko.size(); i++) {
            min=chetko.get(i);
            jj=i;
            for (int j = i; j < chetko.size(); j++) {
                if(min>chetko.get(j)){
                    min=chetko.get(j);
                    jj=j;
                }
            }
            chetko.add(i,min);
            chetko.remove(jj+1);

        }
        for (int i = 0; i < chetko.size(); i++) {
            System.out.println(chetko.get(i));
        }
        r1.close();
        r2.close();
    }
}
