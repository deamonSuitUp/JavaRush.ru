package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
        /*String[] temp;
        temp = "Иванов Иван Иванович 31 11 1950".split(" ");
        Date d1 = new Date(Integer.parseInt(temp[5]) - 1901,Integer.parseInt(temp[4]),Integer.parseInt(temp[3]));
        Person vasya = new Person(temp[1],temp[2],temp[0],d1);
        System.out.println(vasya);*/
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }
        public Person read(){
            String[] temp;
            temp = this.fileScanner.nextLine().trim().split(" ");
            Date d1 = new Date(Integer.parseInt(temp[5]) - 1900,Integer.parseInt(temp[4]) - 1,Integer.parseInt(temp[3]));
            return new Person(temp[1],temp[2],temp[0],d1);
        }
        public void close(){
            this.fileScanner.close();
        }
    }
}
