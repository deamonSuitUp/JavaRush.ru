package com.javarush.task.task18.task1813;


import java.io.*;

/*
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    //public static String fileName = "E:/input.txt";
    private FileOutputStream original;
    public AmigoOutputStream ( FileOutputStream original) throws FileNotFoundException {
        super(fileName);
        this.original = original;
    }

    public void flush() throws IOException {
            original.flush();
    }
    public void write(int b) throws IOException {original.write(b);}
    public void write(byte b[]) throws IOException {original.write(b);}
    public void write(byte b[], int off, int len) throws IOException {original.write(b, off, len);}
    public void close() throws IOException {
        flush();
        String s = "JavaRush © All rights reserved.";
        byte[] buff = s.getBytes();
        write(buff);
        original.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
