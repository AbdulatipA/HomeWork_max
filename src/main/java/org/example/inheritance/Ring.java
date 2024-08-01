package org.example.inheritance;

public class Ring extends Jewelry  {
    double radius;

    public Ring(double price, String name, double radius) {
        super(price, name);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ring: цена = " + price + ", название = " + name + ", диаметр = " + radius;
    }
}
