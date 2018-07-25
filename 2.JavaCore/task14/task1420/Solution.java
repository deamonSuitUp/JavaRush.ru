package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

                BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
                int i1, i2;
                String s1,s2;
                s1=r1.readLine();
                s2=r1.readLine();
        try {

                i1 = Integer.parseInt(s1);
                i2 = Integer.parseInt(s2);
                if(i1<=0||i2<=0)
                    throw new Exception();
                int nod = 1;
                int min = i1 < i2 ? i1 : i2;
                for (int i = 2; i <= min; i++) {
                    if (i1 % i == 0 && i2 % i == 0)
                        nod = i;
                }
                System.out.println(nod);
            } catch (Exception e) {
                //System.out.println(s1);
                //System.out.println(s2);
            System.out.println(e);
            throw e;
            }
        }
    }
