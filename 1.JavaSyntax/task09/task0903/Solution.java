package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement elm = stackTraceElements[2];
        System.out.println(elm.getLineNumber());
        int n = elm.getLineNumber();
        return elm.getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement elm = stackTraceElements[2];
        System.out.println(elm.getLineNumber());
        int n = elm.getLineNumber();
        return elm.getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement elm = stackTraceElements[2];
        System.out.println(elm.getLineNumber());
        int n = elm.getLineNumber();
        return elm.getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement elm = stackTraceElements[2];
        System.out.println(elm.getLineNumber());
        int n = elm.getLineNumber();
        return elm.getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement elm = stackTraceElements[2];
        System.out.println(elm.getLineNumber());
        int n = elm.getLineNumber();
        return elm.getLineNumber();
    }
}
