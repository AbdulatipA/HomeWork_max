package org.example.OOP.abstraction;

public abstract class Smartphone {
    String name;
    String brand;
    String operatingSystem;
    int age;

    public Smartphone(String name, String brand, String operatingSystem, int age) {
        this.name = name;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.age = age;
    }

    abstract void showInfo();
}
