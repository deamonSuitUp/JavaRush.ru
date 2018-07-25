package com.javarush.task.task18.task1812;

import java.io.*;
import java.nio.Buffer;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream originalAOS;
    public QuestionFileOutputStream (AmigoOutputStream amigoOutputStream){
        this.originalAOS = amigoOutputStream;
    }

    public void flush() throws IOException{originalAOS.flush();}
    public void write(int b) throws IOException{originalAOS.write(b);}
    public void write(byte b[]) throws IOException{originalAOS.write(b);}
    public void write(byte b[], int off, int len) throws IOException{originalAOS.write(b, off, len);}
    public void close() throws IOException{
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String s = r1.readLine();
        if (s.equals("д") || s.equals("Д")) {
            originalAOS.close();
        }
        r1.close();
    }
}

