package org.example.OOP.abstraction;

public class WoodBoat extends WaterTransport{
    public WoodBoat(String type, String name, double price) {
        super(type, name, price);
    }

    @Override
    void syHi(String syHi) {
        System.out.println("И тебе " + syHi +  ", я " + type + ", меня зовут - " + name);
    }
}
