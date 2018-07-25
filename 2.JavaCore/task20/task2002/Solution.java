package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.javarush.task.task20.task2002.User.Country.OTHER;
import static com.javarush.task.task20.task2002.User.Country.RUSSIA;
import static com.javarush.task.task20.task2002.User.Country.UKRAINE;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            //OutputStream outputStream = new FileOutputStream("E:\\input.txt");
            InputStream inputStream = new FileInputStream(your_file_name);
            //InputStream inputStream = new FileInputStream("E:\\input.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("first");
            user.setLastName("last");
            user.setBirthDate(new Date());
            user.setMale(false);
            user.setCountry(OTHER);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (!users.isEmpty()) {
                for (int i = 0; i < users.size(); i++) {
                    bw.write(users.get(i).getFirstName() + "\r\n");
                    bw.write(users.get(i).getLastName() + "\r\n");
                    bw.write(users.get(i).getBirthDate().getTime() + "\r\n");
                    bw.write(users.get(i).isMale() ? "m\r\n" : "w\r\n");
                    bw.write(users.get(i).getCountry().getDisplayedName());
                    if (i != users.size() - 1)
                        bw.write("\r\n");
                }
            }
            bw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String firstName = null, lastName = null, date = null, sex = null, country = null;
            while (br.ready()) {
                firstName = br.readLine();
                lastName = br.readLine();
                date = br.readLine();
                sex = br.readLine();
                country = br.readLine();
                boolean isMale = false;
                Date d = new Date(Long.parseLong(date));
                User.Country c;
                if (sex.equals("m"))
                    isMale = true;
                if (country.equals(UKRAINE.getDisplayedName()))
                    c = UKRAINE;
                else if (country.equals(RUSSIA.getDisplayedName()))
                    c = RUSSIA;
                else c = OTHER;
                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setMale(isMale);
                user.setBirthDate(d);
                user.setCountry(c);
                users.add(user);
            }
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
