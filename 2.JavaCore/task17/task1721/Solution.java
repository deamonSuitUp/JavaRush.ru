package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2;
        file1 = r1.readLine();
        file2 = r1.readLine();
        FileInputStream f1 = new FileInputStream(file1);
        BufferedReader rr1 = new BufferedReader(new InputStreamReader(f1));
        String text;
        while ((text = rr1.readLine()) != null) {
            allLines.add(text);
        }
        FileInputStream f2 = new FileInputStream(file2);
        BufferedReader rr2 = new BufferedReader(new InputStreamReader(f2));
        while ((text = rr2.readLine()) != null) {
            forRemoveLines.add(text);
        }
        r1.close();
        rr1.close();
        rr2.close();
        //System.out.println(allLines);
        Solution sol = new Solution();
        try {
            sol.joinData();
            System.out.println(allLines);
        } catch (CorruptedDataException e) {
            System.out.println("error" + allLines);
        }
    }

    public void joinData() throws CorruptedDataException {

        //containsAll


        if (allLines.size() < forRemoveLines.size()) {
            //System.out.println(allLines.size());
            remove();
        }
        List<String> forRemoveLines2 = new ArrayList<String>(forRemoveLines);
        /*for (int i = 0; i < forRemoveLines2.size(); i++) {
            for (int j = i+1; j < forRemoveLines2.size()-1; j++) {
                if (forRemoveLines2.get(i).equals(forRemoveLines2.get(j))){
                    forRemoveLines2.remove(j);
                }
            }
        }*/

        boolean search = false;
        for (int i = 0; i < allLines.size(); i++) {
            for (int j = 0; j < forRemoveLines2.size(); j++) {
                if (allLines.get(i).equals(forRemoveLines2.get(j))) {
                    search = true;
                    forRemoveLines2.remove(j);
                    //System.out.println(j);
                    j--;
                    //allLines.remove(i);
                    //i--;
                    //break;
                    if(i!=allLines.size()-1) {
                        for (int k = i + 1; k <allLines.size(); k++) {
                            if (allLines.get(i).equals(allLines.get(k))){
                                allLines.remove(k);
                                k--;
                            }
                        }
                    }
                }
            }
            if (search) {
                //System.out.println(allLines.get(i));
                allLines.remove(i);
                i--;
                search = false;
            }
        }
        if (forRemoveLines2.size() != 0)
            remove();



    }

    public void remove() throws CorruptedDataException {
        //System.out.println(allLines.size());
        /*for (int i = allLines.size() - 1; i >= 0; i--) {
            allLines.remove(i);
        }*/
        allLines.clear();
        throw new CorruptedDataException();
    }
}
