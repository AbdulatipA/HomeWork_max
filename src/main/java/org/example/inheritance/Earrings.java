package org.example.inheritance;

public class Earrings extends Jewelry {
    public Earrings(double price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return "Earrings: цена = " + price + ", название = " + name;
    }
}
