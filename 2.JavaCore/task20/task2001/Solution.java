package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            //OutputStream outputStream = new FileOutputStream("E:\\input.txt");
            InputStream inputStream = new FileInputStream(your_file_name);
            //InputStream inputStream = new FileInputStream("E:\\input.txt");
            //BufferedWriter brr = new BufferedWriter(new OutputStreamWriter(outputStream));
            //brr.write("ffg");
            //brr.close();

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            //outputStream.write(this.name.getBytes());
            //outputStream.close();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (assets.size() != 0){
                bw.write(name + "\r\n");
                for (int i = 0; i < assets.size(); i++) {
                    bw.write(assets.get(i).getName() + "\r\n");
                    if (i == assets.size()-1)
                        bw.write(String.valueOf(assets.get(i).getPrice()));
                    else
                        bw.write(String.valueOf(assets.get(i).getPrice()) + "\r\n");
                }
            }
            else bw.write(name);
            bw.flush();


        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String name = br.readLine();
            List<Asset> assets2 = new ArrayList<>();
            while (br.ready()){
                String asset = br.readLine();
                Double price = Double.parseDouble(br.readLine());
                assets2.add(new Asset(asset,price));
            }
            br.close();
            this.name = name;
            if (assets2 != null)
                this.assets.addAll(assets2);
        }
    }
}
