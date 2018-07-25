package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = r1.readLine();
            secondFileName = r1.readLine();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        //InputStream inStream;
        String fullFileName = null;
        String result = "";
        public void setFileName(String fullFileName){
            this.fullFileName = fullFileName;
        }
        public String getFileContent(){
            return result;
        }
        public void run(){
            try {
                /*InputStream inStream = new FileInputStream(fullFileName);
                int code;
                while(inStream.available() > 0) {
                    code = inStream.read();
                    if (code == 10)
                        continue;
                    if (code == 13)
                        result += ' ';
                    else result += (char) code;
                }*/
                BufferedReader r1 = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)));
                while (r1.ready()){
                    result += r1.readLine() + " ";
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //add your code here - добавьте код тут
}
