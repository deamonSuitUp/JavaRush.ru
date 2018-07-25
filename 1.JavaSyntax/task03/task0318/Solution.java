package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String name = r1.readLine();
        String year = r1.readLine();
        int year2 = Integer.parseInt(year);
        System.out.println(year2 + " захватит мир через " + name + " лет. Му-ха-ха!");
    }
}