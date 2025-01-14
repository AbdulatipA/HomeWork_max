package org.example.multiThreading.task5DaemonThread;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", 3);
        User user2 = new User("Bob", 10);

        user2.setDaemon(true);

        user1.start();
        user2.start();
    }
}
