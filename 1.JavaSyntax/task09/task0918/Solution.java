package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends Exception{
        public void f() throws Exception {}
    }

    static class MyException2 extends MyException {
        public static void v() throws NumberFormatException {}
    }

    static class MyException3 extends MyException{
        public void c() throws RemoteException {}

    }

    static class MyException4 extends MyException{
        public static void dd() throws RuntimeException {
        }
    }
}

