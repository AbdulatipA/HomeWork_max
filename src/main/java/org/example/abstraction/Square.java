package org.example.abstraction;

public class Square extends Form {
    public Square(int width, int length) {
        super(width, length);
    }

    @Override
    int square() {
        return length * width * 2;
    }
}

