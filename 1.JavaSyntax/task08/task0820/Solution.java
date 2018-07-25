package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        //printPets(removeCats(pets,cats));
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> d1 = new HashSet<Dog>();
        d1.add(new Dog());
        d1.add(new Dog());
        d1.add(new Dog());
        return d1;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> o1 = new HashSet<Object>();
        o1.addAll(cats);
        o1.addAll(dogs);
        return o1;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
       // Set<Object> copy = new HashSet<Object>(pets);
        //for (Object cc:copy
         //    ) {
            pets.removeAll(cats);
        //}
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o22:pets
             ) {
            System.out.println(o22);
        }
    }

    //напишите тут ваш код
    public static class Cat{
        public Cat(){}
    }
    public static class Dog{public Dog(){}}
}
