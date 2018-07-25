package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        /*List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
        HashMap<String,String> map = new HashMap<String, String>();
        String gor,fam;
        while(true){
            gor = reader.readLine();
            if(gor.isEmpty())
                break;
            fam = reader.readLine();
            if(fam.isEmpty())
                break;
            map.put(gor,fam);
        }
        gor = reader.readLine();
        gor = map.get(gor);
        System.out.println(gor);
    }
}
