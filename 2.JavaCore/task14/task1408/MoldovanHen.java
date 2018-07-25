package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){return 9;}
    String getDescription(){
        String s = super.getDescription();
        s+=" Моя страна - "+MOLDOVA+ ". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return s;}

}
