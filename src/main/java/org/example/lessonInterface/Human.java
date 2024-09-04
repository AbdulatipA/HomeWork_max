package org.example.lessonInterface;

public class Human implements Passenger{
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
