package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int i=0;
        if(this.age < anotherCat.age)
            i--;
        else i++;
        if(this.weight <anotherCat.weight )
            i--;
        else i++;
        if (this.strength < anotherCat.strength)
            i--;
        else i++;
        if (i>0)
            return false;
        else return true;
    }

    public static void main(String[] args) {
     /*   Cat cat1 = new Cat();
        Cat cat2= new Cat();
        cat1.age = 2;
        cat2.age = 2;
        cat1.strength = 1;
        cat2.strength = 1;
        cat1.weight = 1;
        cat2.weight = 1;
        System.out.println(cat2.fight(cat1));*/

    }
}
