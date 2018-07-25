package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String fname = null;
        private String sname = null;
        private int age;
        private boolean sex;
        private boolean pet;
        private Human brat = null;
        public Human(){}
        public Human(int age,Human brat){
            brat = this.brat;
            age = this.age;
        }
        public Human(String fname){fname=this.fname;}
        public Human(String fname,String sname){fname=this.fname;sname=this.sname;}
        public Human(int age){age=this.age;}
        public Human(Human copy,String fname){
            fname=this.fname;
            sname=copy.sname;
            age=copy.age;
            sex=copy.sex;
            pet=copy.pet;
            brat=copy;
        }
        public Human(String fname,String sname,int age,boolean sex, boolean pet,Human brat){
            fname=this.fname;
            sname=this.sname;
            age=this.age;
            sex=this.sex;
            pet=this.pet;
            brat=this.brat;
        }
        public Human(int age,boolean sex){age=this.age;sex=this.sex;}
        public Human(int age,boolean sex,boolean pet){age=this.age;sex=this.sex;pet=this.pet;}
        public Human(boolean sex){sex=this.sex;}
    }
}
