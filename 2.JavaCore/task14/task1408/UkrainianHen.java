package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    int getCountOfEggsPerMonth(){return 5;}
    String getDescription(){
        String s = super.getDescription();
        s+=" Моя страна - "+UKRAINE+ ". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return s;}
}
