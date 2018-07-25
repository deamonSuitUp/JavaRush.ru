package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r1.readLine();
        if(s1.equals("helicopter"))
            result = new Helicopter();
            else if(s1.equals("plane")) {
            result = new Plane(r1.read());
        }
        r1.close();
        //add your code here - добавьте код тут
    }
}
