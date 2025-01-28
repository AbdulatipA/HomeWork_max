package org.example.multiThreading.ThreadPools.task1;

public class User3 implements Runnable{
    private String name;

    public User3(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Отправка файла 3 -> " + name);
    }
}
