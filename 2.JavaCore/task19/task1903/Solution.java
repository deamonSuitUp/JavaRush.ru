package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;
        public IncomeDataAdapter(IncomeData incomeData){
            this.data = incomeData;
        }
        public String getCompanyName(){
            return this.data.getCompany();
        }
        public String getCountryName(){
            return countries.get(this.data.getCountryCode());
        }
        public String getName(){
            return this.data.getContactLastName() + ", " + this.data.getContactFirstName();
        }
        public String getPhoneNumber(){
            String temp = "";
            temp += "+";
            temp += this.data.getCountryPhoneCode();
            temp += "(";
            char tempMass1[] = String.valueOf(this.data.getPhoneNumber()).toCharArray();
            char[] tempMass = new char[]{'0','0','0','0','0','0','0','0','0','0'};
            int jj = 0;
            for (int i = 10 - tempMass1.length; i < 10; i++) {
                tempMass[i] = tempMass1[jj];
                jj++;
            }
            for (int i = 0; i <3; i++) {
                temp += tempMass[i];
            }
            temp += ")";
            for (int i = 3; i < 6; i++) {
                temp += tempMass[i];
            }
            temp += "-";
            for (int i = 6; i < 8; i++) {
                temp += tempMass[i];
            }
            temp += "-";
            for (int i = 8; i < 10; i++) {
                temp += tempMass[i];
            }
            return temp;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}