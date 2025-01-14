package org.example.multiThreading.task6Deadlock;

public class DeadlockDemo {
    static final Object monitor1 = new Object();
    static final Object monitor2 = new Object();


    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (monitor1) {
                System.out.println("t1: Захватил monitor1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (monitor2) {
                    System.out.println("t1: Захватил monitor2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (monitor2) {
                System.out.println("t2: Захватил monitor2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (monitor1) {
                    System.out.println("t2: Захватил monitor1");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Потоки завершены");
    }
}
