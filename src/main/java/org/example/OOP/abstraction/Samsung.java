package org.example.OOP.abstraction;

public class Samsung extends Smartphone{
    public Samsung(String name, String brand, String operatingSystem, int age) {
        super(name, brand, operatingSystem, age);
    }

    @Override
    void showInfo() {
        System.out.println("Тут выводится только часть информации: " + name + " " + brand);
    }
}
