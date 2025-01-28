package org.example.multiThreading.ThreadPools.task1;

public class User2 implements Runnable{
    private String name;

    public User2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Отправка файла 2 -> " + name);
    }
}
