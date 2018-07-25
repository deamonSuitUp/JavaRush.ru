package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int weight = 0;
    private int age = 0;
    private String address = null;
    private String color = null;
    public void initialize (String name){
        this.name = name;
        weight = 2;
        age = 2;
        color = "black";
    }
    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        weight = 2;
        //age = 2;
        color = "black";
    }
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        //weight = 2;
        //age = 2;
        color = "black";
    }
    public void initialize (int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 2;
    }
    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 2;
    }

    public static void main(String[] args) {

    }
}
