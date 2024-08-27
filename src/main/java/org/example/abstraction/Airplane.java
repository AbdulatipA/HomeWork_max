package org.example.abstraction;

public class Airplane extends Flying {
    public Airplane(String type, String name) {
        super(type, name);
    }

    @Override
    void Showtype() {
        System.out.println("Тип летательного аппарата: " + type);
    }
}
