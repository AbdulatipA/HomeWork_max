package org.example.multiThreading.SyncExcahnger;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<Integer> exchanger = new Exchanger<>();
        User user1 = new User("user1", new int[]{1, 2, 3, 4, 5}, exchanger);
        User user2 = new User("user2", new int[]{5, 4, 3, 2, 1}, exchanger);

        new Thread(user1).start();
        new Thread(user2).start();
    }
}
