package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iter = cats.iterator();
        cats.remove(iter.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> c1 = new HashSet<Cat>();
        c1.add(new Cat());
        c1.add(new Cat());
        c1.add(new Cat());
        return c1;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c2:cats
             ) {
            System.out.println(c2);
        }
    }

    // step 1 - пункт 1
    public static class Cat{
        public Cat(){}
    }
}
