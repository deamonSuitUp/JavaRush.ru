package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human h1 = new Human("h1",true,33);
        Human h2 = new Human("h2",false,33);
        Human h3 = new Human("h3",true,33);
        Human h4 = new Human("h4",false,33);
        Human h5 = new Human("h5",true,33,h1,h2);
        Human h9 = new Human("h9",true,33,h1,h2);
        Human h6 = new Human("h6",true,33,h3,h4);
        Human h7 = new Human("h7",true,33,h3,h4);
        Human h8 = new Human("h8",true,33,h1,h2);
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());
        System.out.println(h8.toString());
        System.out.println(h9.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father=null;
        Human mother=null;
        public Human(String name,boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name,boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















