package org.example.multiThreading.ThreadPools.task1;

public class User1 implements Runnable{
    private String name;

    public User1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Отправка файла 1 -> " + name);
    }
}
