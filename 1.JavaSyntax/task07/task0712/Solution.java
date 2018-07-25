package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(r1.readLine());
        }
        int max,min; Integer minn=null,maxx=null;
        max = list.get(0).length();
        min = list.get(0).length();
        for (int i = 1; i < 10; i++) {
            if(max<list.get(i).length())
                max=list.get(i).length();
            if(min>list.get(i).length())
                min=list.get(i).length();
        }
        for (int i = 0; i < 10; i++) {
            if(max==list.get(i).length()){
                maxx = i;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(min==list.get(i).length()){
                minn = i;
                break;
            }
        }
        if(minn<maxx)
            System.out.println(list.get(minn));
        else System.out.println(list.get(maxx));
    }
}
