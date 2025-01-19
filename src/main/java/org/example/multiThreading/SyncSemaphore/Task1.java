package org.example.multiThreading.SyncSemaphore;

import java.util.concurrent.Semaphore;

public class Task1 extends Thread{
    private String name;
    private Semaphore semaphore;

    public Task1(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                semaphore.acquire();
                System.out.println("Загрузка ресурсов с сервера " + i + " " + name);
                Thread.sleep(1000);
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
