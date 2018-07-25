package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        String znak;
        int i1 = Integer.parseInt(s1);
        if (i1==0){
            System.out.println("ноль");
            return;
        }
        if(i1<0)
            znak = "отрицательное";
        else znak = "положительное";
        if(i1%2==0)
            System.out.println(znak+" четное число");
        else System.out.println(znak+" нечетное число");

    }
}
