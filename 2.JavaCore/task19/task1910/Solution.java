package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(r1.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(r1.readLine()));

        /*String pattern = "[a-z]+";
        String text = "";
        while ((text = reader.readLine()) != null) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);
            while (m.find()) {
                writer.write(text.substring(m.start(), m.end()) + "");
            }
        }*/
        String text;
        while ((text = reader.readLine()) != null){
            writer.write(text.replaceAll("\\p{Punct}",""));
        }

        writer.close();
        reader.close();
        r1.close();
    }
}
