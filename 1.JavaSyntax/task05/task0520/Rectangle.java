package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;
    public Rectangle(){};
    public Rectangle(int top, int left, int width){
        this.top=top;
        this.left = left;
        this.width = width;
        height = width;
    }
    public Rectangle(int top, int left, int width, int height){
        this.top=top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle (Rectangle r1, int left){
        this.left = left;
    }

    public static void main(String[] args) {

    }
}
