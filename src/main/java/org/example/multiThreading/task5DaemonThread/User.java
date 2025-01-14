package org.example.multiThreading.task5DaemonThread;

public class User extends  Thread{
    String name;
    int time;

    public User(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
            for (int i = 0; i < time; i++) {
                try {
                    System.out.println(name + " пытается подключиться к серверу" + " -> " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
