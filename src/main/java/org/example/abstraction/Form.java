package org.example.abstraction;

public abstract class Form {
    int width;
    int length;

    public Form(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Квадрат: " + "ширина = " + width + ", длина = " + length;
    }

    abstract int square();
}
