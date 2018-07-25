package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData(){
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        int i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (true){
            try {
                i=Integer.parseInt(r1.readLine());
                al.add(i);
                }
                catch (NumberFormatException e){
                break;
                }
                catch (IOException d){}
        }
        for (int j = 0; j < al.size(); j++) {
            System.out.println(al.get(j));
        }
    }
}
