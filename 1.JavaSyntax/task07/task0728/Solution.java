package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        //int[] array = {21,22,23,24,25,26,27,28,29,30,0,-2,-5,-8,35,36,37,38,39,40};

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int max=-1;
        int maxx;
        int nol=0;
        int size = 0;
        for (int i = size; i < array.length-1; i++) {
            maxx=array[size];
            for (int j = size; j < array.length-1; j++) {
                if (maxx <= array[j + 1]) {
                    max = j+1;
                    maxx=array[j+1];
                    //array[j]=array[j+1];
                    //array[j+1]=sred;
                    // nol=1;
                }
            }
                if(max!=-1) {
                    nol=array[i];
                    array[i] = maxx;
                    array[max]=nol;
                    max=-1;
                }
                //else return;
            size++;
            }
        }
    }

