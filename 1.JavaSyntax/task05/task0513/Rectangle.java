package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;
    private String name = null;
    public void initialize(){};
    public void initialize (Rectangle rec1, String name){
        this.initialize(rec1.top,rec1.left,rec1.width, rec1.height);
        this.name = name;
    }
    public void initialize(int top, int left, int width, int height) {
        this.top =top;
        this.left =left;
        this.width=width;
        this.height=height;
    }
    public void initialize(int top, int left, int width) {
        this.top =top;
        this.left =left;
        this.width=width;
        this.height=width;
    }


    public static void main(String[] args) {

    }
}
