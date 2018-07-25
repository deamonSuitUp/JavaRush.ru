package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
        //threads.get(4).start();
    }
    public static class Thread1 extends Thread{
        public void run(){
            while(true){;}
        }
    }
    public static class Thread2 extends Thread {
        public void run() {
            try {
            Random rand = new Random(47);
            if(rand.nextInt(100)>50)
                throw new InterruptedException();
            } catch (InterruptedException e1) {
                System.out.println("InterruptedException");

            }
        }
    }
    public static class Thread3 extends Thread{
        public void run(){
            try {
                while(true) {
                    System.out.println("Ура");
                    this.sleep(500);
                }
            }catch (InterruptedException e){

            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        boolean alive = true;
        public void run(){
            while(alive){}
        }
        public void showWarning(){
            alive = false;
            }
    }
    public static class Thread5 extends Thread{
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String currentString = null;
        int sum = 0;
        public void run(){
            try {
                while (true) {
                    if ((currentString = r1.readLine()).equals("N")) {
                        System.out.println(sum);
                        currentThread().interrupt();
                        break;
                    } else {
                        sum += Integer.parseInt(currentString);
                    }
                }
                }catch(IOException e){
                    e.printStackTrace();
                }
        }
    }

    public static void main(String[] args) {
        //threads.get(3).start();
    }
}