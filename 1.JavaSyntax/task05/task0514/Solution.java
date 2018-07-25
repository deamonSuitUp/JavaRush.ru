package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person p1 = new Person();
        p1.initialize("vasya",12);
    }

    static class Person {
        //напишите тут ваш код
        private String name=null;
        private int age;
        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
