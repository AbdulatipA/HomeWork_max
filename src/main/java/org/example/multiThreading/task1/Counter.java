package org.example.multiThreading.task1;

import lombok.Getter;

@Getter
public class Counter {
    private int count = 10;
    volatile private boolean flag = true;

    public void decrement() {
        if (count > 0) {
            count--;
        } else {
            flag = false;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            while (counter.flag){
                synchronized (counter) {
                    counter.decrement();
                    counter.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Поток t1 завершен");
        });

        Thread t2 = new Thread(() -> {
            while (counter.flag) {
                synchronized (counter) {
                    System.out.println(counter.getCount());
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println("Поток t2 завершен");
        });

        t1.start();
        t2.start();
    }
}





