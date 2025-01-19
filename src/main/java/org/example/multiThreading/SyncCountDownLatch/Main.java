package org.example.multiThreading.SyncCountDownLatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {
    static CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) {
        Person person1 = new Person("Adidas");
        Person person2 = new Person("Nike");
        Person person3 = new Person("Zara");
        Person person4 = new Person("Cave");
        Person person5 = new Person("New Balance");

        List<Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(person1, person2, person3, person4, person5));

        persons.forEach(Person::start);

        openShop();
        startsSale();
    }


    static void openShop(){
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.print("\rОткрытие магазина будет через " + i + " секунд");
                Thread.sleep(1000);
            }
            System.out.println();
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void startsSale(){
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.print("\rСтарт продаж объявлен, ждите " + i + " секунд");
                Thread.sleep(1000);
            }
            System.out.println();
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
