package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            hs.add(i);
        }
        return hs;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        /*Iterator<Integer> iter = set.iterator();
        int vrem;
            //if (set.contains(iter.next() > 10))
            /*if (set.contains(10))
                set.remove(10);
            iter.hasNext();
            /*vrem = iter.next();
            if(vrem>10)
                set.remove(iter.next());
        }
        //vrem = null;
            while(iter.hasNext())
                System.out.println(iter);*/
        Iterator<Integer> iterator = set.iterator();
        HashSet<Integer> del = new HashSet<Integer>();
        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            int text = iterator.next();
            if(text>10)
                del.add(text);
            //if(text>10)
                //set.remove(text);
            //System.out.println(text);
            //System.out.println(iterator.next());

            //System.out.println(text);
        }
        /*while(iterator.hasNext()) {
            int text = iterator.next();
            System.out.println(text);
        }*/
        //System.out.println(del);
        set.removeAll(del);
        //System.out.println(set);
            return set;

    }

    public static void main(String[] args) {
        //System.out.println(createSet());
        //createSet();
        removeAllNumbersMoreThan10(createSet());
    }
}
