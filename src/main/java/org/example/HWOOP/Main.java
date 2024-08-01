package org.example.HWOOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] arrUser = new User[10];
        arrUser[0] = new  User("Alex", "alex54@gmai.com", 3, "al54");
        arrUser[1] = new  User("John", "JJ@gmai.com", 1, "nhoj");
        arrUser[2] = new  User("James", "James_jame@gmai.com", 6, "JJGO");
        arrUser[3] = new  User("Arnold", "Arni@gmai.com", 8, "Coach1");
        arrUser[4] = new  User("Emily", "Emily.M@gmai.com", 2, "EmilyA984");

        User[] users = {arrUser[0], arrUser[1], arrUser[2], arrUser[3], arrUser[4]};
        addUsers(users);
    }

    public static void addUsers(User[] u) {
        for (int i = 0; i < u.length; i++) {
            u[i].PrintCnnect();

            if (u[i].id == 1) {
                u[i].info();
            }
        }
    }
}


