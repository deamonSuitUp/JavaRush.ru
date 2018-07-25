package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country{

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.equals(UKRAINE))
                hen = new UkrainianHen();
            if(country.equals(BELARUS))
                hen = new BelarusianHen();
            if(country.equals(RUSSIA))
                hen = new RussianHen();
            if(country.equals(MOLDOVA))
                hen = new MoldovanHen();
            //напишите тут ваш код
            return hen;
        }
    }

    /*class RussianHen extends Hen{
        String s;
        s = getDescription();
        String getDescription(){return s;}
    }
    class UkrainianHen extends Hen{}
    class MoldovanHen extends Hen{}
    class BelarusianHen extends Hen{}
*/

}
