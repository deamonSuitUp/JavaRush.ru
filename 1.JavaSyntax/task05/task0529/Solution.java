package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        int i1=0;
        while(true){
            s1 = r1.readLine();
            if(!s1.equals("сумма")){
                i1+=Integer.parseInt(s1);
            }
            else break;
        }
        System.out.println(i1);
    }
}
