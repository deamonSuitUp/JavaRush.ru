package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] c = new char[s.length()];
        c = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            for (int j = i; j < c.length; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
        //System.out.println(ss);
    }

}

