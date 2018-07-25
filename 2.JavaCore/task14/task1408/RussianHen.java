package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    int getCountOfEggsPerMonth(){return 3;}
    String getDescription(){
        String s = super.getDescription();
        s+=" Моя страна - "+RUSSIA+ ". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return s;}
}
