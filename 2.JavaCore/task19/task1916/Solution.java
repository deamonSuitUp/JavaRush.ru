package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String file1 = r1.readLine();
        String file2 = r1.readLine();
        FileReader fileReader = new FileReader(file1);
        BufferedReader reader1 = new BufferedReader(fileReader);
        while (reader1.ready()) {
            list1.add(reader1.readLine());
        }
        String temp = list1.get(0);
        list1.remove(0);
        list1.add(0, temp.substring(1, temp.length()));
        if (list1.get(0).equals(""))
            list1.remove(0);
        fileReader = new FileReader(file2);
        reader1 = new BufferedReader(fileReader);
        while (reader1.ready()) {
            list2.add(reader1.readLine());
        }
        fileReader.close();
        reader1.close();
        int sizeList = (list1.size() > list2.size()) ? list1.size() : list2.size();
        String sameString = "";
        Boolean firstColumnLonger = (list1.size() > list2.size()) ? true : false;
        for (int i = 0; i < sizeList - 1; i++) {
            try {
                if (i == 0 || i == 1 || i == sizeList - 2 || i == sizeList - 3) {
                    if (list1.get(i).equals(list2.get(i))) {
                        lines.add(new LineItem(Type.SAME, list1.get(i)));
                        list1.remove(i);
                        list1.add(i, "");
                    } else if ((!list1.get(i).equals(list2.get(i))) && (!list1.get(i).equals(list2.get(i - 1))) && (!list1.get(i).equals(list2.get(i + 1)))) {
                        if (sameString.equals(list2.get(i))) {
                            lines.add(new LineItem(Type.SAME, list2.get(i)));
                            sameString = "";
                        } else sameString = list2.get(i);
                        list2.remove(i);
                        list2.add(i, "");
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    } else if ((!list1.get(i).equals(list2.get(i))) && (!list1.get(i + 1).equals(list2.get(i))) && (!list1.get(i - 1).equals(list2.get(i)))) {
                        if (sameString.equals(list1.get(i))) {
                            lines.add(new LineItem(Type.SAME, list1.get(i)));
                            sameString = "";
                        } else sameString = list1.get(i);
                        list1.remove(i);
                        list1.add(i, "");
                        lines.add(new LineItem(Type.ADDED, list2.get(i)));
                    }
                }
                else {
                    if (list1.get(i).equals(list2.get(i))) {
                        lines.add(new LineItem(Type.SAME, list1.get(i)));
                        list1.remove(i);
                        list1.add(i, "");
                    } else if ((!list1.get(i).equals(list2.get(i))) && (!list1.get(i).equals(list2.get(i - 1))) && (!list1.get(i).equals(list2.get(i + 1))) && (!list1.get(i).equals(list2.get(i - 2))) && (!list1.get(i).equals(list2.get(i + 2)))) {
                        if (sameString.equals(list2.get(i))) {
                            lines.add(new LineItem(Type.SAME, list2.get(i)));
                            sameString = "";
                        } else sameString = list2.get(i);
                        list2.remove(i);
                        list2.add(i, "");
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    } else if ((!list1.get(i).equals(list2.get(i))) && (!list1.get(i + 1).equals(list2.get(i))) && (!list1.get(i - 1).equals(list2.get(i))) && (!list1.get(i + 2).equals(list2.get(i))) && (!list1.get(i - 2).equals(list2.get(i)))) {
                        if (sameString.equals(list1.get(i))) {
                            lines.add(new LineItem(Type.SAME, list1.get(i)));
                            sameString = "";
                        } else sameString = list1.get(i);
                        list1.remove(i);
                        list1.add(i, "");
                        lines.add(new LineItem(Type.ADDED, list2.get(i)));
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                if (firstColumnLonger) lines.add(new LineItem(Type.REMOVED, list1.get(i) + "error"));
                else lines.add(new LineItem(Type.ADDED, list2.get(i) + "error"));
            }
        }
        try {
            if (list1.get(list1.size() - 1).equals(list2.get(list2.size() - 1)))
                lines.add(new LineItem(Type.SAME, list1.get(list1.size() - 1)));
            else if (sameString.equals(list2.get(list2.size() - 1))) {
                lines.add(new LineItem(Type.SAME, sameString));
                lines.add(new LineItem(Type.REMOVED, list1.get(list1.size() - 1)));
            } else {
                lines.add(new LineItem(Type.SAME, sameString));
                lines.add(new LineItem(Type.ADDED, list2.get(list2.size() - 1)));
            }
        } catch (IndexOutOfBoundsException e) {
            try {
                if (firstColumnLonger) lines.add(new LineItem(Type.REMOVED, list1.get(list1.size() - 1)));
                else lines.add(new LineItem(Type.ADDED, list2.get(list2.size() - 1)));
            } catch (IndexOutOfBoundsException r) {
            }
        }
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i).type + " " + lines.get(i).line);
        }
        r1.close();
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
