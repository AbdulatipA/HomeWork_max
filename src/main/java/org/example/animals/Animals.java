package org.example.animals;

public abstract class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    public void Move() {
        System.out.println("Животное двигается");
    }

    @Override
    public String toString() {
        return "Animals: " + "name = " + name;
    }
}
