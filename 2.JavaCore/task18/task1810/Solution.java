package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            FileInputStream inputStream = new FileInputStream(r1.readLine());
            if (inputStream.available() < 1000){
                inputStream.close();
                r1.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
