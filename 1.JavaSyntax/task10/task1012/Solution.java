package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }
        ArrayList<Integer> alphabetCount = new ArrayList<Integer>();
        for (int i = 0; i < alphabet.size(); i++) {
            alphabetCount.add(0);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            //String s = "абв";
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int count=0,temp;
        for (int i = 0; i < list.size(); i++) {
            char[] strokaIsSpiska = new char[list.get(i).length()];
            strokaIsSpiska= list.get(i).toCharArray();
            for (int j = 0; j < alphabet.size(); j++) {
                for (int k = 0; k < strokaIsSpiska.length; k++) {
                    if(alphabet.get(j)==strokaIsSpiska[k])
                        count++;
                }
                temp=alphabetCount.get(j)+count;
                alphabetCount.set(j,temp);
                count=0;
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i)+" "+alphabetCount.get(i));
        }
        //System.out.println(alphabetCount);

            //System.out.println(alphabet.get(i)+" "+count);
        //System.out.println(alphabet);
        /*ArrayList<String> proba = new ArrayList<String>();
        proba.add("qwe");
        char ss = 'q';
        System.out.println(Collections.frequency(proba,ss));*/
    }

}
