package com.javarush.task.task14.task1408;


public class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth(){return 7;};
    String getDescription(){
        String s = super.getDescription();
        s+=" Моя страна - "+BELARUS+ ". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
        return s;}
}
