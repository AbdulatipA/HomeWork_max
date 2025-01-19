package org.example.multiThreading.SyncExcahnger;

import java.util.concurrent.Exchanger;

public class User implements Runnable {
    String name;
    int[] numbers;
    Exchanger<Integer> exchanger;

    public User(String name, int[] numbers, Exchanger<Integer> exchanger) {
        this.name = name;
        this.numbers = numbers;
        this.exchanger = exchanger;
    }

    void print() {
        for (int i = 0; i < numbers.length; i++) {
            Integer number = numbers[i];
            try {
                Thread.sleep(1000);
                System.out.println(name + " отправляет число " + numbers[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                if(number.equals(exchanger.exchange(number))){
                    System.out.println("найдено совпадение: " + number);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        print();
    }
}
