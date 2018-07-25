package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(12.0,"sqs");
        labels.put(13.0,"s3s");
        labels.put(14.0,"sds");
        labels.put(15.0,"sas");
        labels.put(1.0,"sss");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
