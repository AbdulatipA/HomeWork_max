package org.example.multiThreading.SyncSemaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 10; i++) {
            Task1 task1 = new Task1("task1 " + i, semaphore);
            task1.start();
        }
        for (int i = 0; i < 30; i++) {
            Task2 task2 = new Task2("task2 " + i, semaphore);
            task2.start();
        }
    }
}
