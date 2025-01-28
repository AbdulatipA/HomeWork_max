package org.example.multiThreading.ThreadPools.task3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SendMessage implements Runnable{
    @Override
    public void run() {
        System.out.println("Отправка файла потоком: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutor = new ScheduledThreadPoolExecutor(2);

        scheduledExecutor.submit(() -> {
           timer();
        });

        for (int i = 1; i <= 7; i++) {
            scheduledExecutor.scheduleAtFixedRate(new SendMessage(), 7 * i, 1, TimeUnit.SECONDS);
        }

        try {
            Thread.sleep(10000);
            scheduledExecutor.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            if (!scheduledExecutor.awaitTermination(10, TimeUnit.SECONDS)) {
                scheduledExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void timer(){
        synchronized (System.out) {
            for (int i = 7; i > 0; i--) {
                System.out.print("\rНачнется через " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }
    }
}
