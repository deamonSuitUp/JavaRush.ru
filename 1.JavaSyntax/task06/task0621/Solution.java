package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ded = reader.readLine();
        String bab = reader.readLine();
        String otec = reader.readLine();
        String mat = reader.readLine();
        String sin = reader.readLine();
        String doch = reader.readLine();
        Cat ded1 = new Cat(ded,null,null);
        Cat bab1 = new Cat(bab,null,null);
        Cat otec1 = new Cat(otec,null,ded1);
        Cat mat1 = new Cat(mat,bab1,null);
        Cat sin1 = new Cat(sin,mat1,otec1);
        Cat doch1 = new Cat(doch,mat1,otec1);
        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(otec1);
        System.out.println(mat1);
        System.out.println(sin1);
        System.out.println(doch1);
        /*Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);*/
    }

    public static class Cat {
        private String name;
        private Cat parentM;
        private Cat parentF;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentM, Cat parentF) {
            this.name = name;
            this.parentM = parentM;
            this.parentF = parentF;
        }
       /* Cat(String name, Cat parentF) {
            this.name = name;
            parentM = null;
            this.parentF = parentF;
        }
        Cat(String name, Cat parentM) {
            this.name = name;
            this.parentM = parentM;
            parentF = null;
        }*/

        @Override
        public String toString() {
            if (parentM == null&&parentF == null)
                return "Cat name is " + name + ", no mother, no father";
            if(parentM!=null&&parentF==null)
                return "Cat name is " + name + ", mother is " + parentM.name+", no father";
            if((parentM==null)&&(parentF!=null))
                return "Cat name is " + name +", no mother, father is " + parentF.name;
            if((parentM != null)&&(parentF != null))
                return "Cat name is "+name+", mother is "+parentM.name+", father is "+parentF.name;
            return "";
        }
    }

}
