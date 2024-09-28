package org.example.OOP.abstraction;

public class Iphone extends Smartphone{
    public Iphone(String name, String brand, String operatingSystem, int age) {
        super(name, brand, operatingSystem, age);
    }

    void showInfo() {
        System.out.println("Тут выводится только часть информации: " + operatingSystem + " " + age);
    }
}
