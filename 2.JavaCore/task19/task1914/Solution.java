package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myOutputStream = new PrintStream(outputStream);
        System.setOut(myOutputStream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] resultMass = result.split(" ");
        switch (resultMass[1]){
            case "+": result += (Integer.parseInt(resultMass[0]) + Integer.parseInt(resultMass[2])); break;
            case "-": result += (Integer.parseInt(resultMass[0]) - Integer.parseInt(resultMass[2])); break;
            case "*": result += (Integer.parseInt(resultMass[0]) * Integer.parseInt(resultMass[2])); break;
        }
        System.setOut(console);
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

