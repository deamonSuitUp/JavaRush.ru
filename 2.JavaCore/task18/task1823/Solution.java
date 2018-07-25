package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        while (!(temp = r1.readLine()).equals("exit")){
            new ReadThread(temp).start();
        }
        r1.close();
    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        String fileName;
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            super();
            this.fileName = fileName;
            fileInputStream = new FileInputStream(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run(){
            try {
                int summ = 1, ii=0, min, jj, maxSum = 0;
                int symbols[] = new int[fileInputStream.available()];
                while (fileInputStream.available() > 0) {
                    symbols[ii] = fileInputStream.read();
                    ii++;
                }
                for (int i = 0; i < symbols.length-1; i++) {
                    min = symbols[i];
                    jj = i;
                    for (int j = i+1; j < symbols.length; j++) {
                        if (min > symbols[j]) {
                            min = symbols[j];
                            jj=j;
                        }
                    }
                    symbols[jj] = symbols[i];
                    symbols[i] = min;
                }
                for (int i = 1; i < symbols.length; i++) {
                    if (symbols[i] == symbols[i-1])
                        summ++;
                    else{
                        if (summ > maxSum) {
                            maxSum = summ;
                            ii = symbols[i-1];
                        }
                        summ = 1;
                    }
                    if (i == symbols.length-1){
                        if (summ > maxSum){
                            maxSum = summ;
                            ii = symbols[i];
                        }
                    }
                }
                resultMap.put(fileName,ii);
                fileInputStream.close();
            }catch (IOException e){
                //System.out.println("ioexception");
            }
        }
    }
}
