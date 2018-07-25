package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human bab1 = new Human();
        Human bab2 = new Human();
        Human ded2 = new Human();
        Human ded1 = new Human();
        Human otec = new Human();
        Human mat = new Human();
        Human reb1 = new Human();
        Human reb2 = new Human();
        Human reb3 = new Human();
        bab1.name = "bab1";
        bab2.name = "bab2";
        ded2.name = "ded2";
        ded1.name = "ded1";
        otec.name = "otec";
        mat.name = "mat";
        reb1.name = "reb1";
        reb2.name = "reb2";
        reb3.name = "reb3";
        bab1.sex = true;
        bab2.sex = true;
        mat.sex = true;
        bab1.age = 88;
        bab2.age = 89;
        ded1.age = 90;
        ded2.age = 91;
        otec.age = 40;
        mat.age = 41;
        reb1.age = 13;
        reb2.age = 14;
        reb3.age = 15;
        bab1.children.add(otec);
        bab2.children.add(mat);
        ded1.children.add(otec);
        ded2.children.add(mat);
        otec.children.add(reb1);
        otec.children.add(reb2);
        otec.children.add(reb3);
        mat.children.add(reb3);
        mat.children.add(reb2);
        mat.children.add(reb1);
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(otec.toString());
        System.out.println(mat.toString());
        System.out.println(reb1.toString());
        System.out.println(reb2.toString());
        System.out.println(reb3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
