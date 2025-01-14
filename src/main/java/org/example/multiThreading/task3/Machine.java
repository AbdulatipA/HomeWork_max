package org.example.multiThreading.task3;


public class Machine extends Thread {
    volatile private boolean flag = true;

    @Override
    public void run() {
        increment();
    }

    public void increment(){
        System.out.println("Стонок запущен");
        while (DataBase.finishedProduct < 20 && flag) {
            synchronized (DataBase.class) {
                DataBase.finishedProduct++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printCount(){
        System.out.println("В данный момент готово: " +
                DataBase.finishedProduct +
                ", но, пока вы читаете это количество растет");
    }
}
