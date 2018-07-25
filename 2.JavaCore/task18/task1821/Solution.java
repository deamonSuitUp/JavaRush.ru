package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        //String file = "F:\\input.txt";
        Boolean add = true;
        FileInputStream fileInputStream = new FileInputStream(file);
        LinkedList<Character> symbols = new LinkedList<Character>();
        LinkedList<Integer> quantity = new LinkedList<Integer>();
        symbols.add((char)fileInputStream.read());
        quantity.add(0,1);
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            for (int i = 0; i < quantity.size(); i++) {
                if (symbols.get(i) == data) {
                    int temp = quantity.get(i);
                    quantity.remove(i);
                    quantity.add(i,++temp);
                    add = false;
                    break;
                }
            }
            if (add) {
                symbols.add((char) data);
                quantity.add(1);
            }
            add = true;
        }
        fileInputStream.close();
        char min;
        int jj;
        for (int i = 0; i < symbols.size()-1; i++) {
             min = symbols.get(i);
             jj = i;
            for (int j = i+1; j < symbols.size(); j++) {
                    if ( min > symbols.get(j)) {
                        min = symbols.get(j);
                        jj = j;
                    }
            }
            symbols.add(i,min);
            quantity.add(i,quantity.get(jj));
            symbols.remove(jj+1);
            quantity.remove(jj+1);
        }
        for (int i = 0; i < symbols.size(); i++) {
            System.out.println((symbols.get(i)) + " " + quantity.get(i));
        }
    }
}
