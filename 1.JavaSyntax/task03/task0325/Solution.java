package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String f = r1.readLine();
        int ff = Integer.parseInt(f);
        System.out.println("Я буду зарабатывать $" + f + " в час");
    }
}
