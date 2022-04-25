package pl.coderslab;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        UserDao userDao = new UserDao();

//        user.setUserName("Kuchta");
//        user.setEmail("kuchta117@gmail.com");
//        user.setPassword("Dupa");
//
//        userDao.create(user);


        //////////////////////////////////////////

        //UserDao userDao2 = new UserDao();
//        User user2 = userDao2.read(1);
//        System.out.println(user2);
//
//        System.out.println(user2.getEmail());
//        user2.setEmail("dawid.kuchta@euro.com.pl");
//        System.out.println(user2.getEmail());
//
//        userDao2.update(user2);

        //userDao2.delete(1);

//        User User2 = new User();
//
//        User2.setUserName("kucht2");
//        User2.setEmail("dawid@euro.com.pl");
//        User2.setPassword("Dupa2");
//
//        userDao.create(User2);

        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u.toString());
        }

        User read = userDao.read(1);
        System.out.println(read.toString());


    }
}
