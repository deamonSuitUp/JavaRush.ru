package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name=null;
    private String address = null;
    private int age;
    private int weight;
    private String color;
    public  Cat(String name){
        this.name = name;
        age = 2;
        weight = 2;
        color = "black";
    }
    public  Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "black";
    }
    public  Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight = 2;
        color = "black";
    }
    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 2;
    }
    public Cat (int weight, String color,String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 2;
    }

    public static void main(String[] args) {

    }
}
