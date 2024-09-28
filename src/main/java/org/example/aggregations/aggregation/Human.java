package org.example.aggregations.aggregation;

public class Human {
    String name;
    Sword sword;


    public Human(String name, Sword sword) {
        this.name = name;
        this.sword = sword;
    }

    @Override
    public String toString() {
        return "Human { name = " + name + ", sword = " + sword.title + " }";
    }
}
