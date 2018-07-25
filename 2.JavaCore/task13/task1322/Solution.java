package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }
    public static class StringObject<Object> implements SimpleObject{
        public SimpleObject<String> getInstance(){return this;}
    }
}
