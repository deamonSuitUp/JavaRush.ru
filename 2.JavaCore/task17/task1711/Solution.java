package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        //String text = "-u 0 name1 м 15/11/1990";
        //String text = "-i 0 1";
        //String[] args_fake = text.split(" ");
        //String[] args_fake = args;

        //for (int i = 0; i < args_fake.length; i++) {
            //System.out.println(args_fake[i]);
        //}

        Solution testSolution = new Solution();

        //switch (args_fake[0]){
        switch (args[0]){
            case "-c": synchronized (allPeople) {testSolution.c(args);} break;
            case "-u": synchronized (allPeople) {testSolution.u(args);} break;
            case "-d": synchronized (allPeople) {testSolution.d(args);} break;
            case "-i": synchronized (allPeople) {testSolution.i(args);} break;
        }
    }
    public void c ( String[] param){
        try {
            int vsego = (param.length - 1) / 3;
            //System.out.println(vsego);
            SimpleDateFormat obrazecVvoda = new SimpleDateFormat("dd/MM/yyyy");
            // SimpleDateFormat obrazecVivoda = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH); //для запоминания


            for (int i = 0; i < vsego; i++) {

                if (param[2 + (i * 3)].equals("м")) {
                    allPeople.add(Person.createMale(param[1 + (i * 3)], obrazecVvoda.parse(param[3 + (i * 3)])));
                }
                else{
                    allPeople.add(Person.createFemale(param[1 + (i * 3)], obrazecVvoda.parse(param[3 + (i * 3)])));
                }

                //allPeople.get(allPeople.size()-1).stroka();
                System.out.println(allPeople.size()-1);

            }
        }catch (ParseException e){
            System.out.println("error -c");
        }
    }
    public void u ( String[] param){
        try{
            int vsego = (param.length - 1) / 3;
            //System.out.println(vsego);
            SimpleDateFormat obrazecVvoda = new SimpleDateFormat("dd/MM/yyyy");
            Sex tempSex;
            //Date tempBD;

            for (int i = 0; i < vsego; i++) {

                allPeople.get(Integer.parseInt(param[1+(i*4)])).setName(param[2+(i*4)]);

                if (param[3+(i*4)].equals("м"))
                    tempSex = Sex.MALE;
                else tempSex = Sex.FEMALE;
                allPeople.get(Integer.parseInt(param[1+(i*4)])).setSex(tempSex);

                allPeople.get(Integer.parseInt(param[1+(i*4)])).setBirthDay(obrazecVvoda.parse(param[4+(i*4)]));

                //allPeople.get(Integer.parseInt(param[1+(i*4)])).stroka();
            }

        }catch ( ParseException e){
            System.out.println("error -u");
        }
    }
    public void d ( String[] param) {
        for (int i = 1; i <param.length; i++) {
            allPeople.get(Integer.parseInt(param[i])).setName(null);
            allPeople.get(Integer.parseInt(param[i])).setSex(null);
            allPeople.get(Integer.parseInt(param[i])).setBirthDay(null);
    }
    }
    public void i ( String[] param){
        SimpleDateFormat obrazecVivoda = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH); //для запоминания
        String personData = "";
        //int number;
        for (int i = 1; i < param.length; i++) {
            personData += allPeople.get(Integer.parseInt(param[i])).getName() + " ";
            if (allPeople.get(Integer.parseInt(param[i])).getSex() == Sex.MALE)
                personData += "м ";
            else personData += "ж ";
            personData += obrazecVivoda.format(allPeople.get(Integer.parseInt(param[i])).getBirthDay());
            System.out.println(personData);
            personData = "";
        }
    }
}
