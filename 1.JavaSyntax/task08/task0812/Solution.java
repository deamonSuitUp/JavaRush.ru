package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> i = new ArrayList<Integer>();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 10; j++) {
            i.add(Integer.parseInt(r1.readLine()));
        }
        int max=1,dlina=1;
        for (int j = 1; j < 10; j++) {
            if(i.get(j) == i.get(j-1))
            {
                /*if(i.get(j)==i.get(j-1)) {
                    max++;
                    if(max==9)
                        dlina=10;
                }
                else {
                    if(dlina<max+1)
                        dlina=max+1;
                    max=1;
                }*/
                max++;
                if(dlina<max)
                    dlina=max;
            }
            else max=1;
            /*else{
                if(max==0) {
                    dlina = 1;
                            }
                //else if(dlina<=max)
                   // dlina=max;

            }*/
        }
        System.out.println(dlina);
    }
}