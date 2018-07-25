package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

    abstract class StringObject implements SimpleObject<String>{
        public abstract SimpleObject<String> getInstance();}

}