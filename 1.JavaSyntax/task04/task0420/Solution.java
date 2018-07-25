package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        //s4 = r1.readLine();
        int i1,i2,i3,min1,min2,min3;
        i1=Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        i3 = Integer.parseInt(s3);
       // i4 = Integer.parseInt(s4);
        if(i1>i2&&i1>i3) {
            System.out.print(i1 + " ");
            if(i2>i3) {
                System.out.print(i2 + " " + i3);
                return;
            }
            else {
                System.out.print(i3+" "+i2);
                return;
            }
        }
        else if(i2>i1&&i2>i3){
            System.out.print(i2+" ");
            if(i1>i3){
                System.out.println(i1+" "+i3);
                return;
            }
            else{
                System.out.println(i3+" "+i1);
                return;
            }
        }
        else {
            System.out.print(i3+ " ");
            if(i1>i2){
                System.out.println(i1+" "+i2);
                return;
            }
            else System.out.println(i2+" "+i1);
        }

    }

}
