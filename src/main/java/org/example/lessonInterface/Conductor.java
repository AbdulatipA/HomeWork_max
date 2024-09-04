package org.example.lessonInterface;

public class Conductor  implements Passenger{
    String name;

    public Conductor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
