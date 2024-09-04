package org.example.lessonInterface;

public class Driver implements Passenger{
    String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
