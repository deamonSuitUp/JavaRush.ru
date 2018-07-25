package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        String[] name;
        String delimeter = "\\.";
        name = fileName.split(delimeter);
        //try {
            if (!name[name.length - 1].equals("txt")) {
                //System.out.println("sout");
                super.close();
                throw new UnsupportedFileNameException();
            }
        //}catch (UnsupportedFileNameException e){}
    }

    public static void main(String[] args) throws IOException {
        //TxtInputStream r1 = new TxtInputStream("E:\\input.txt.of");
    }
}

