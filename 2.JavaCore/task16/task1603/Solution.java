package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код ту
        /*for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
            list.get(i).start();
        }*/
        SpecialThread a = new SpecialThread();
        Thread aa = new Thread(a);
        SpecialThread b = new SpecialThread();
        Thread bb = new Thread(b);
        SpecialThread c = new SpecialThread();
        Thread cc = new Thread(c);
        SpecialThread d = new SpecialThread();
        Thread dd = new Thread(d);
        SpecialThread e = new SpecialThread();
        Thread ee = new Thread(e);
        list.add(aa);
        list.add(bb);
        list.add(cc);
        list.add(dd);
        list.add(ee);
        /*for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
        }*/

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
