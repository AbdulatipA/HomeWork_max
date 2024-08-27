package org.example.abstraction;

public abstract class WaterTransport {
    String type;
    String name;
    double price;

    public WaterTransport(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "WaterTransport: " + "type = " + type + ", name = " + name + ", price = " + price;
    }

    abstract void syHi(String syHi);
}
