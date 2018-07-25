package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String file = r1.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myOutputStream = new PrintStream(outputStream);
        System.setOut(myOutputStream);
        testString.printSomething();
        String result = outputStream.toString();
        fileOutputStream.write(outputStream.toByteArray());
        System.setOut(console);
        System.out.println(result);
        outputStream.close();
        fileOutputStream.close();
        r1.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

