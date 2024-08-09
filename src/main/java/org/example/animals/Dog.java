package org.example.animals;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void Move() {
        System.out.println(name + " бежит");
    }
}
