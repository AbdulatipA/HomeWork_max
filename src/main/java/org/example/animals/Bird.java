package org.example.animals;

public class Bird extends Animals{
    public Bird(String name){
        super(name);
    }

    @Override
    public void Move() {
        System.out.println(name + " летит");
    }
}
