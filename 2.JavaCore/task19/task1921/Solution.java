package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String file = args[0];
        //String file = "E:\\input.txt";
        Date date = new Date(1987-1900,12-1,31);
        System.out.println(date);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()){
            String line = reader.readLine();
            String[] s = line.split(" ");
            if (s.length < 4) continue;
            Date d = new Date(Integer.parseInt(s[s.length-1])-1900,Integer.parseInt(s[s.length-2])-1,Integer.parseInt(s[s.length-3]));
            line = line.split(" " + s[s.length - 3] + " " )[0];
            PEOPLE.add(new Person(line,d));
        }
        /*for (int i = 0; i < PEOPLE.size(); i++) {
            System.out.println(PEOPLE.get(i).getName() + " " + PEOPLE.get(i).getBirthday());
        }*/
        reader.close();
    }
}
