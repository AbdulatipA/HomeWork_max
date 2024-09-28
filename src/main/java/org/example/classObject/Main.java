package org.example.classObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Alex", 21, 253.1, "Мурманск", "alex123", "Ax752"));
        userList.add(new User("Jack", 26, 8253, "Москва", "jk892", "16698j"));
        userList.add(new User("Masha", 31, 8423.3, "Москва", "871M", "9826Masha"));
        userList.add(new User("Anton", 19, 52.1, "Астрахань", "822Anton", "An_n123"));
        userList.add(new User("Jack", 20, 365, "Москва", "881C", "8136J"));

        List<User> result = print(userList);
        for (User user : result) {
            System.out.println(user + " Клон");
        }
    }


        static ArrayList<User> print(ArrayList<User> userList) {
        ArrayList<User> newUserList = new ArrayList<>();
        for (User u : userList) {
            System.out.println(u);
            if(u.getCity().equals("Москва")){
                try {
                    User userClone = (User) u.clone();
                    newUserList.add(userClone);
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return newUserList;
    }
}
