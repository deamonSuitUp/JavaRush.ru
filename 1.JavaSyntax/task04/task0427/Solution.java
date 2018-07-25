package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        int i1 = Integer.parseInt(s1);
        int sot,des,ed,znak;
        if(i1<1||i1>999)
            return;
        sot=i1/100;
        des=(i1%100)/10;
        ed = i1%10;
        if (ed%2==0)
            znak = 1;
        else znak =-1;
        if(sot==0&&des==0){
            if(znak<0)
                System.out.println("нечетное однозначное число");
            else System.out.println("четное однозначное число");
        }
        else if(sot==0){
            if(znak<0)
                System.out.println("нечетное двузначное число");
            else System.out.println("четное двузначное число");
        }
        else{
            if(znak<0)
                System.out.println("нечетное трехзначное число");
            else System.out.println("четное трехзначное число");
        }




    }
}
