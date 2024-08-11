package org.example.furniture;

public abstract class Furniture {
    int height;
    int width;
    int weight;
    double price;
    String type;

    public Furniture(int height, int width, int weight, double price, String type) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Тип = " + type + ", высота = " + height + ", ширина = " + width + ", вес = " + weight +
                ", цена = " + price;
    }
}
