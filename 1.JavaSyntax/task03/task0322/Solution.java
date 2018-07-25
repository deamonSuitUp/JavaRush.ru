package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш кодa
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String name1,name2,name3;
        name1 = r1.readLine();
        name2 = r1.readLine();
        name3 = r1.readLine();
        System.out.println(name1 +" + "+ name2 +" + "+ name3 +" = Чистая любовь, да-да!");
    }
}