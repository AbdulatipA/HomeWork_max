package org.example.multiThreading.task2;

public class Journal extends Thread {
    volatile static int countStudent;

    @Override
    public void run() {
        increment();
    }

//    public void increment() {
//        while (countStudent < 5) {
//            synchronized (Journal.class) {
//                if (countStudent > 5) {
//                    break;
//                }
//                System.out.println(Thread.currentThread().getName() + " -> " + countStudent);
//                try {
//                    countStudent++;
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }

    public synchronized static void increment() {
        for (int i = 0; i < 5; i++) {
            if (countStudent > 5) {
                break;
            }
                System.out.println(Thread.currentThread().getName() + " -> " + countStudent);
                try {
                    countStudent++;
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public static void main(String[] args) {
        Journal journal = new Journal();

        Thread t1 = new Thread(journal);
        Thread t2 = new Thread(journal);
        Thread t3 = new Thread(journal);

        t1.start();
        t2.start();
        t3.start();
    }
}




