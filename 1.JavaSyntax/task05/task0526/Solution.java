package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man m1 = new Man ("va",12,"pop");
        Man m2 = new Man ("vsa",12,"pop");
        Woman w1 = new Woman ("ssa",12,"pop");
        Woman w2 = new Woman ("sa",12,"pop");
        System.out.println(m1.name+" "+m1.age+" "+m1.address);
        System.out.println(m2.name+" "+m2.age+" "+m2.address);
        System.out.println(w1.name+" "+w1.age+" "+w1.address);
        System.out.println(w2.name+" "+w2.age+" "+w2.address);
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address=address;
        }

    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address=address;
        }

    }
}
