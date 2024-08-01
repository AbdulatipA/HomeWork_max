package org.example.aggregation2;

public class Human {
    String name;
    Machine title;

    Human(String name, Machine title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Human: name = " + name + ", car = " + title.title;
    }
}
