package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2,s3; int d1,d2,d3;
        s1 = r1.readLine();
        s2 = r1.readLine();
        s3 = r1.readLine();
        d1 = Integer.parseInt(s1);
        d2 = Integer.parseInt(s2);
        d3 = Integer.parseInt(s3);
        int minn,maxx;
        if(d1==d2||d1==d3){
            System.out.println(d1);
            return;
        }
        if(d2==d3){
            System.out.println(d2);
            return;
        }
        minn = min(d1,d2);
        minn = min(minn,d3);
        maxx = max(d1,d2);
        maxx = max(maxx,d3);
        if(d1<maxx&&d1>minn)
            System.out.println(d1);
        else if(d2>minn&&d2<maxx)
            System.out.println(d2);
        else System.out.println(d3);


    }
    public static int min(int a, int b){
        if(a<b)
            return a;
        else return b;
    }

    public static int max(int a,int b){
        if(a>b)
            return a;
        else return b;
    }
}
