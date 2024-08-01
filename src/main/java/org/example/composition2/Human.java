package org.example.composition2;

public class Human {
    String name;
    Machine title;

    Human(String name, String title) {
        this.name = name;
        this.title = new Machine(title);
    }

    @Override
    public String toString() {
        return "Human: name = " + name + ", car = " + title.title;
    }
}
