package org.example.multiThreading.task4;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShoppingMall {
    private static String[] lamps = new String[15];
    private static Lock lock = new ReentrantLock();


    public static void on(){
        lock.lock();
        try {
            for (int i = 0; i < lamps.length; i++) {
                lamps[i] = "включен";
                Thread.sleep(1000);
                System.out.println(lamps[i]);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.unlock();
    }

    public static void off(){
        lock.lock();
        try {
            for (int i = lamps.length - 1; i >= 0; i--) {
                lamps[i] = "выключен";
                Thread.sleep(1000);
                System.out.println(lamps[i]);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.unlock();
    }

//   public void printArr(){
//       for (String lamp : lamps) {
//           System.out.println(lamp);
//       }
//   }
}
