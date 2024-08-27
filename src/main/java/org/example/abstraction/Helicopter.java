package org.example.abstraction;

public class Helicopter extends Flying {
    int countHelix;
    public Helicopter(String type, String name, int countHelix) {
        super(type, name);
        this.countHelix = countHelix;
    }

    @Override
    void Showtype() {
        System.out.println("Тип летательного аппарата: " + type);
    }
    void ShowCountHelix(){
        System.out.println("Количетсво винтов у вертолета: " + countHelix);
    }
}
