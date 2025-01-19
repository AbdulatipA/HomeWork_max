package org.example.multiThreading.SyncCountDownLatch;

import static org.example.multiThreading.SyncCountDownLatch.Main.latch;

public class Person extends Thread {
    private String name;


    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Магазин " + name + " начал работу");
    }

    public Person(String name) {
        this.name = name;
    }
}
