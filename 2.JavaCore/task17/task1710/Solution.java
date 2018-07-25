package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        //String[] test = {"-c Malukov"};
    }

    public static void main(String[] args) {
        //start here - начни тут
        //args[0] = "-c popol";
        //String ss = "-c popol ж 15/04/1990";
        //String ss = "-u 0 popol ж 15/04/1990";
        String ss = "-i 0";
        //String ss = args[0];
        // вот это String[] symbols = ss.split(" ");
        String[] symbols = args;
        for (int i = 0; i < symbols.length; i++) {
            // вот это System.out.println(symbols[i]);
        }
        Solution sol = new Solution();
        switch (symbols[0]){
            case "-c": sol.c(symbols); break;
            case "-u": sol.u(symbols); break;
            case "-d": sol.d(symbols); break;
            case "-i": sol.i(symbols); break;
        }
        for (int i = 0; i < allPeople.size(); i++) {
            //allPeople.get(i).stroka();
        }
    }
    public void c(String[] param){
        try {
            SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
            Date bdd = bd.parse(param[3]);
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Date itog = formatDate.parse(formatDate.format(bdd));
            //System.out.println(formatDate.format(itog));

        /*try {
            System.out.println(formatDate.parse("15/04/1990"));

        }catch (ParseException e){}
        */
        /*int style = DateFormat.MEDIUM;
        //Also try with style = DateFormat.FULL and DateFormat.SHORT
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getDateInstance(style, Locale.ENGLISH);
        System.out.println("English: " + df.format(date));*/

            if (param[2] == "м") {
                allPeople.add(Person.createMale(param[1], itog));
                //allPeople.get(2).stroka();
                System.out.println(allPeople.size()-1);
            }
            else
            {
                allPeople.add(Person.createFemale(param[1], itog));
                //allPeople.get(2).stroka();
                System.out.println(allPeople.size()-1);
            }
        }catch (ParseException e){}
    }
    public void u(String[] param){
        try {
            allPeople.get(Integer.parseInt(param[1])).setName(param[2]);

            SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
            Date bdd = bd.parse(param[4]);
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Date itog = formatDate.parse(formatDate.format(bdd));

            allPeople.get(Integer.parseInt(param[1])).setBirthDay(itog);

            if(param[3].equals("м"))
                allPeople.get(Integer.parseInt(param[1])).setSex(Sex.MALE);
            else
                allPeople.get(Integer.parseInt(param[1])).setSex(Sex.FEMALE);
        }catch (ParseException e){}
    }
    public void d(String[] param){
        int number = Integer.parseInt(param[1]);
        allPeople.get(number).setName(null);
        allPeople.get(number).setSex(null);
        allPeople.get(number).setBirthDay(null);
    }
    public void i(String[] param){
        //try {
            String result = "";
            int number = Integer.parseInt(param[1]);
            result += allPeople.get(number).getName() + " ";
            if (allPeople.get(number).getSex() == Sex.MALE)
                result += "м ";
            else result += "ж ";

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            result += formatDate.format(allPeople.get(number).getBirthDay());

            System.out.println(result);
        //}catch (ParseException e){}
    }
}