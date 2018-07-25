package com.javarush.task.task19.task1905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {}

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }
        public String getCountryCode(){
            String search = this.customer.getCountryName();
            //String search = "Canada";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(search))
                    return entry.getKey();
            }
            return null;
        }
        public String getCompany(){
            return  this.customer.getCompanyName();
        }
        public String getContactFirstName(){
            String[] temp = this.contact.getName().split(", ");
            return temp[1];
        }
        public String getContactLastName(){
            String[] temp = this.contact.getName().split(", ");
            return temp[0];
        }
        public String getDialString(){
            String temp = this.contact.getPhoneNumber();
            //String temp = "+38(050)123-45-67";
            char[] tempChar = temp.toCharArray();
            temp = "callto://";
            for (int i = 0; i < tempChar.length; i++) {
                if (tempChar[i] == '(' || tempChar[i] == ')' || tempChar[i] == '-')
                    continue;
                else temp += tempChar[i];
            }
            return temp;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}