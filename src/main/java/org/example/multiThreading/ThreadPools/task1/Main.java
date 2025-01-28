package org.example.multiThreading.ThreadPools.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(3);
        User1 user1 = new User1("user1");
        User2 user2 = new User2("user2");
        User3 user3 = new User3("user3");

        Runnable[] tasks = new Runnable[] { user1, user2, user3 };

        for (int i = 0; i < tasks.length; i++) {
            try {
                Thread.sleep(1000);
                fixedExecutor.submit(tasks[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        fixedExecutor.shutdown();
        while (!fixedExecutor.isTerminated()) {

        }
        System.out.println("Программа завершена...");
    }
}
